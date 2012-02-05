package edu.hiro.converter.readers;

import java.util.ArrayList;
import java.util.List;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.filemaker.AbstractFmPatient;
import edu.hiro.util.CException;
import edu.hiro.util.CTable;
import edu.hiro.util.DateHelper;

public abstract class AbstractFmTableReader extends AbstractTableReader
{
	protected List<AbstractFmPatient> patients=new ArrayList<AbstractFmPatient>();
	
	//////////////////////////////////////////////////////////////////////////////////

	public AbstractFmTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);
		DATE_PATTERN=DateHelper.YYYYMMDD_PATTERN;
	}
	
	@Override
	protected void preProcess(CTable table)
	{
		System.out.println("preProcess table: adding rowID column");
		table.insertRowNumberColumn("rowID"); // add a unique rowID column
	}
	
	@Override
	protected void postProcess(CTable table, List<CTable.Row> rows)
	{
		try
		{
			saveOrUpdateAll();
			//this.converterService.getDao().saveOrUpdateAll(this.patients);
			this.patients.clear();
		}
		catch(Exception e)//InvalidStateException
		{
			System.out.println(e.getMessage());//DatabaseHelper.getDetails(e));
		}
	}
	
	protected void saveOrUpdateAll()
	{
		throw new CException("must override this in derived class");
	}
	
	/*
	@Override
	protected void postProcess(CTable table, List<CTable.Row> rows)
	{
		try
		{
			this.converterService.getDao().saveOrUpdateAll(this.patients);
			this.patients.clear();
		}
		catch(Exception e)//InvalidStateException
		{
			System.out.println(e.getMessage());//DatabaseHelper.getDetails(e));
		}
	}
	*/
	
	/*
	@Override
	protected void setProperty(Object obj, String property, String value)
	{
		if (property.indexOf("SNP匿名化")!=-1)
			super.setProperty(obj,"SNP匿名化No",value);
		else if (property.indexOf("初診時合併症")!=-1 && property.indexOf("度の肝性脳症診断日")!=-1) //初診時合併症Ⅱ度の肝性脳症診断日
			super.setProperty(obj,"初診時合併症2度の肝性脳症診断日",value);
		else if (property.indexOf("度の肝性脳症有無")!=-1)//Ⅱ度の肝性脳症有無
			super.setProperty(obj,"二度の肝性脳症有無",value);
		else if (property.indexOf("合併症")!=-1 && property.indexOf("度の肝性脳症出現の有無")!=-1) //合併症Ⅱ度の肝性脳症出現の有無
			super.setProperty(obj,"合併症2度の肝性脳症出現の有無",value);
		else if (property.indexOf("合併症出現")!=-1 && property.indexOf("度の肝性脳症診断日")!=-1) //合併症出現Ⅱ度の肝性脳症診断日
			super.setProperty(obj,"合併症出現2度の肝性脳症診断日",value);
		else super.setProperty(obj,property,value);
	}
	*/
}
