package edu.hiro.converter.readers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Stopwatch;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.util.BeanHelper;
import edu.hiro.util.CException;
import edu.hiro.util.CTable;
import edu.hiro.util.DateHelper;
import edu.hiro.util.MathHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.StringHelper;

@Transactional
public abstract class AbstractTableReader implements TableReader
{
	final protected ConverterServiceImpl converterService;
	protected ImportParams params;
	protected int IDENTIFIER_COLUMN=0;
	protected String DATE_PATTERN=DateHelper.MMDDYYYY_PATTERN;
	protected MessageWriter writer;
	private Map<String,String> conversions=new HashMap<String,String>();
	final protected BeanHelper beanhelper=new BeanHelper();
	private boolean overwrite=true;	
	
	//////////////////////////////////////////////////////////////////////////////////

	public AbstractTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		this.converterService=converterService;
		this.params=params;
		this.writer=params.getWriter();
		//this.beanhelper=new BeanHelper(this.writer);
	}
	
	final public void loadTable(CTable table)
	{
		preProcess(table);
		loadTable(table,table.getRows());
		postProcess(table);
	}
	
	final public void loadInBatches(CTable table)
	{
		preProcess(table);
		int batchsize=this.params.getBatchsize();
		int numsequences=table.getRows().size();
		int numbatches=MathHelper.getNumbatches(numsequences, batchsize);
		for (int batchnumber=0;batchnumber<numbatches;batchnumber++)
		{
			int start=batchnumber*batchsize;
			loadTable(table,start,batchsize);
		}
		postProcess(table);
	}

	final protected void loadTable(CTable table, int start, int limit)
	{
		Stopwatch stopwatch=new Stopwatch();
		this.writer.write("batch load rows - from "+start+" to "+(start+limit)+"...");
		stopwatch.start();
		loadTable(table,table.getRows(start,limit));
		this.writer.message("done. elapsed="+stopwatch.stop());
	}
	
	final protected void loadTable(CTable table, List<CTable.Row> rows)
	{
		preProcess(table,rows);
		for (CTable.Row row : rows)
		{
			loadRow(table,row);
		}
		postProcess(table,rows);
	}
		
	protected void preProcess(CTable table){}
	
	protected void postProcess(CTable table){}
	
	protected void preProcess(CTable table, List<CTable.Row> rows){}
	
	protected void postProcess(CTable table, List<CTable.Row> rows){}

	final private void loadRow(CTable table, CTable.Row row)
	{
		Integer id=MathHelper.parseInt(row.getValue(IDENTIFIER_COLUMN));
		//String id=row.getValue(IDENTIFIER_COLUMN);
		if (id==null)
		{
			this.writer.error("can't find id for row: "+row.toString());
			StringHelper.logError("can't find id for row: "+row.toString());
			return;
		}
		Object entity=getEntityById(id);
		if (entity==null)
		{
			this.writer.error("Skipping:  can't find entity with id: "+id);
			return;
		}
		beforeLoadRow(table,row,entity);
		for (int col=1;col<table.getHeader().size();col++)
		{
			String property=table.getHeader().getValue(col);
			String value=row.getValue(col);
			setProperty(entity,property,value,overwrite);
		}
		afterLoadRow(table,row,entity);
	}
	
	
	// override this method to handle special cases
	protected void setProperty(Object obj, String property, String value)
	{
		this.beanhelper.setPropertyFromString(obj,property,value,DATE_PATTERN);
	}
	
	final private void setProperty(Object obj, String property, String value, boolean overwrite)
	{
		if (!StringHelper.hasContent(property))
			return;
		property=convertProperty(property);
		if (!StringHelper.hasContent(value))
			return;
		value=StringHelper.removeUnreadableChars(value);
		if (!overwrite && StringHelper.hasContent(this.beanhelper.getProperty(obj, property)))
			return;
		setProperty(obj,property,value);
	}
	
	protected abstract Object getEntityById(int id);
	
	final protected void doNothing(){}
	
	protected void beforeLoadRow(CTable table, CTable.Row row, Object entity){}
	
	protected void afterLoadRow(CTable table, CTable.Row row, Object entity){}

	final protected void addConversion(String from, String to)
	{
		if (this.conversions.containsKey(from))
			throw new CException("attempting to overwrite an existing conversion: from="+from+", to="+to+", current="+this.conversions.get(from));
		this.conversions.put(from,to);
	}

	final protected String convertProperty(String property)
	{
		if (this.conversions.containsKey(property))
			return this.conversions.get(property);
		return property;
	}		
}
