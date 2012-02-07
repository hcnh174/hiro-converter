package edu.hiro.converter.excel;

import java.awt.Point;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import edu.hiro.converter.ImportHelper;
import edu.hiro.util.AbstractEntity;
import edu.hiro.util.BeanHelper;
import edu.hiro.util.CException;
import edu.hiro.util.DateHelper;
import edu.hiro.util.ExcelHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.StringHelper;

public abstract class AbstractBloodTestLoader
{
	protected static final String filepattern=".*[0-9]+-[0-9]+\\.xlsx";
	protected static final String sheetpattern="^[0-9]+|^sheet [0-9]+";//"[0-9]+";
	protected static final String DATECELL="日付";
	
	protected ExcelHelper helper=new ExcelHelper();	
	protected final Map<String,String> conversions=Maps.newHashMap();
	protected final Set<String> skipfields=Sets.newHashSet();
	protected final BeanHelper beanhelper=new BeanHelper();
	
	public AbstractBloodTestLoader()
	{
		conversions.put("GPT","ALT");
		conversions.put("GOT","AST");
	}
	
	public void loadFolder(String folder)
	{
		deleteAll();
		for (String filename : FileHelper.listFiles(folder,".xlsx",true))
		{
			if (!ImportHelper.filenameMatches(filename,filepattern))
				continue;
			try
			{
				loadFile(filename);
			}
			catch (Exception e)
			{
				System.err.println("error opening file "+filename+": "+e);
			}
		}
	}
	
	public void loadFile(String filename)
	{
		System.out.println("loading file: "+filename);
		Workbook workbook=helper.openSpreadsheet(filename);
		for (int index=0;index<workbook.getNumberOfSheets();index++)
		{
			Sheet sheet=workbook.getSheetAt(index);
			if (!ImportHelper.sheetMatches(sheet,sheetpattern))
				return;
			loadSheet(sheet);
		}
		System.out.print("\n");
	}
	
	public void loadSheet(Sheet sheet)
	{
		Map<String,String> info=Maps.newHashMap();
		info.put("sheetname",sheet.getSheetName());
		info.put("idnum",helper.getStringCellValue(sheet, "A1"));
		getBasicInfo(sheet,info);
		
		DataRange range=findDataRange(sheet);
		for (int rownum=range.firstrow; rownum<=range.lastrow; rownum++)
		{
			try
			{
				loadRow(sheet,range,rownum,info);
			}
			catch (Exception e)
			{
				System.err.println("error in row, skipping rest: "+e);
				return;
			}
		}
	}
	
	protected void getBasicInfo(Sheet sheet, Map<String,String> info){}
	
	protected abstract void deleteAll();
	
	protected abstract AbstractEntity createEntity();
	
	protected abstract void save(AbstractEntity bloodtest);
	
	private void loadRow(Sheet sheet, DataRange range, int rownum, Map<String,String> info)
	{
		List<String> values=getValues(sheet,range,rownum);
		AbstractEntity bloodtest=createEntity();
		for (int index=0;index<range.fields.size();index++)
		{
			String field=range.fields.get(index);
			String value=values.get(index);
			if (field.equals(DATECELL) && !StringHelper.hasContent(value))
				return;
			setField(bloodtest,field,value);
		}
		beanhelper.setFields(bloodtest,info);
		save(bloodtest);
	}

	protected void setField(AbstractEntity bloodtest, String field, String value)
	{
		//StringHelper.println("set "+field+"="+value);
		if (skipfields.contains(field))
			return;
		if (field.equals(DATECELL))
			value=fixDate(value);
		beanhelper.setField(bloodtest,field,value);
	}
	
	protected String fixDate(String value)
	{
		try
		{
			Date date=DateHelper.parse(value,DateHelper.EXCEL_PATTERN);			
			return DateHelper.format(date,DateHelper.YYYYMMDD_PATTERN);
		}
		catch (Exception e)
		{
			return value;
		}
	}
	
	private List<String> getFields(Sheet sheet, DataRange range)
	{
		List<String> fields=getValues(sheet,range,range.headerrow);
		for (int index=0;index<fields.size();index++)
		{
			String field=fields.get(index);
			field=adjustField(field);
			fields.set(index,field);
		}
		//StringHelper.println("fields: "+StringHelper.join(fields), Charsets.UTF_16);
		return fields;
	}
	
	// override in derived class to add additional checks, but call parent function first
	protected String adjustField(String field)
	{
		field=ImportHelper.adjustFieldName(field,conversions);
		field=StringHelper.replace(field,"-","");
		if (field.endsWith("GTP"))
			field="gGTP";
		return field;
	}
	
	private List<String> getValues(Sheet sheet, DataRange range, int rownum)
	{
		List<String> values=Lists.newArrayList();
		for (int colnum=range.firstcolumn; colnum<=range.lastcolumn; colnum++)
		{
			Object value=helper.getCellValue(sheet,rownum,colnum);
			if (value==null)
				value="";
			values.add(value.toString());
		}
		return values;
	}
	
	////////////////////////////////////////////////////////
	
	private Point findDateCell(Sheet sheet)
	{
		for (int rownum=0; rownum<100;rownum++)
		{
			for (int colnum=0; colnum<=100; colnum++)
			{
				Object value=helper.getCellValue(sheet,rownum,colnum);
				if (value!=null && value.toString().equals(DATECELL))
					return new Point(colnum,rownum);
			}
		}
		throw new CException("cannot find date cell in sheet "+sheet.getSheetName());
	}
	
	private int findMaxRowExtent(Sheet sheet, Point cell)
	{
		boolean started=false;
		for (int rownum=cell.y+1; rownum<=cell.y+10000; rownum++)
		{
			Object value=helper.getCellValue(sheet,rownum,cell.x);
			if (value!=null)
				started=true;
			else if (started && value==null)
				return rownum-1;
			//System.out.println("date column value: "+value);
		}
		throw new CException("cannot find end of row range "+sheet.getSheetName());
	}
	
	private int findMaxColExtent(Sheet sheet, Point cell)
	{
		for (int colnum=cell.x+1; colnum<=cell.x+1000; colnum++)
		{
			Object value=helper.getCellValue(sheet,cell.y,colnum);
			if (value==null)
				return colnum-1;
		}
		throw new CException("cannot find end of col range "+sheet.getSheetName());
	}
	
	private DataRange findDataRange(Sheet sheet)
	{
		Point datecell=findDateCell(sheet);
		//StringHelper.println("date cell: col="+datecell.x+" row="+datecell.y, Charsets.UTF_16);
		DataRange range=new DataRange();
		range.headerrow=datecell.y;
		range.firstrow=datecell.y+1;
		range.lastrow=findMaxRowExtent(sheet,datecell);
		range.lastcolumn=findMaxColExtent(sheet,datecell);
		range.fields=getFields(sheet,range);
		StringHelper.println("range="+range.toString(), Charsets.UTF_16);
		return range;
	}	
	
	public class DataRange
	{
		public Integer firstcolumn=1;
		public Integer lastcolumn;
		public Integer headerrow;
		public Integer firstrow;
		public Integer lastrow;
		public List<String> fields;
		
		@Override
		public String toString()
		{
			return StringHelper.toString(this);
		}
	}
}