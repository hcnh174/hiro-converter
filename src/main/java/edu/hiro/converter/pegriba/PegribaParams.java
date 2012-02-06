package edu.hiro.converter.pegriba;

import java.util.ArrayList;
import java.util.List;

import edu.hiro.converter.filemaker.PegribaBloodTest;
import edu.hiro.converter.filemaker.PegribaPatient;
import edu.hiro.util.DataFrame;
import edu.hiro.util.DateHelper;

public class PegribaParams
{	
	public enum Order {BY_WEEK,BY_TYPE};
	
	protected String filename="pegriba"+DateHelper.format(DateHelper.DATE_PATTERN)+".xls";
	protected String sheetname="pegriba";
	protected Order order=Order.BY_WEEK;
	protected List<PegribaPatient.Field> patientcolumns=new ArrayList<PegribaPatient.Field>();
	protected List<PegribaBloodTest.Field> bloodtestcolumns=new ArrayList<PegribaBloodTest.Field>();
	protected List<PegribaBloodTest.Type> weeks=new ArrayList<PegribaBloodTest.Type>();
	protected String filter="";

	public String getFilename(){return this.filename;}
	public void setFilename(final String filename){this.filename=filename;}

	public String getSheetname(){return this.sheetname;}
	public void setSheetname(final String sheetname){this.sheetname=sheetname;}
	
	public List<PegribaPatient.Field> getPatientcolumns(){return this.patientcolumns;}
	public void setPatientcolumns(final List<PegribaPatient.Field> patientcolumns){this.patientcolumns=patientcolumns;}

	public List<PegribaBloodTest.Field> getBloodtestcolumns(){return this.bloodtestcolumns;}
	public void setBloodtestcolumns(final List<PegribaBloodTest.Field> bloodtestcolumns){this.bloodtestcolumns=bloodtestcolumns;}

	public List<PegribaBloodTest.Type> getWeeks(){return this.weeks;}
	public void setWeeks(final List<PegribaBloodTest.Type> weeks){this.weeks=weeks;}
	
	public String getFilter(){return this.filter;}
	public void setFilter(final String filter){this.filter=filter;}
		
	public boolean hasBloodTestFields()
	{
		return !bloodtestcolumns.isEmpty() && !weeks.isEmpty();
	}
	
	public List<Column> getPatientColumnNames()
	{
		List<Column> columns=new ArrayList<Column>();
		for (PegribaPatient.Field field : PegribaPatient.Field.values())
		{
			Column column=new Column(field.name(),field.getSelected());
			columns.add(column);
		}
		return columns;
	}
	
	public List<Column> getBloodTestColumnNames()
	{	
		List<Column> columns=new ArrayList<Column>();
		for (PegribaBloodTest.Field field : PegribaBloodTest.Field.values())
		{
			columns.add(new Column(field.name(),field.getSelected()));
		}
		return columns;
	}
	
	public List<Column> getWeekNames()
	{
		List<Column> columns=new ArrayList<Column>();
		for (PegribaBloodTest.Type field : PegribaBloodTest.Type.values())
		{
			columns.add(new Column(field.name(),field.getSelected()));
		}
		return columns;
	}
	
	public class Column
	{
		protected String name;
		protected boolean checked=false;
		
		public Column(String name, boolean checked)
		{
			this.name=name;
			this.checked=checked;
		}
		
		public String getName(){return this.name;}
		public boolean getChecked(){return this.checked;}
	}
	
	// create an empty data frame with the columns initialized in the right order
	public DataFrame createDataFrame()
	{
		DataFrame dataframe=new DataFrame();
		for (PegribaPatient.Field field : getPatientcolumns())
		{
			dataframe.addColumn(field.name());
		}
		if (order==Order.BY_TYPE)
			getBloodTestsByType(dataframe);
		else if (order==Order.BY_WEEK)
			getBloodTestsByWeek(dataframe);
		return dataframe;
	}
	
	private void getBloodTestsByType(DataFrame dataframe)
	{
		for (PegribaBloodTest.Field field : getBloodtestcolumns())
		{
			for (PegribaBloodTest.Type week : getWeeks())
			{
				String column=PegribaBloodTest.createColumnName(field,week);
				dataframe.addColumn(column);
			}
		}
	}
	
	private void getBloodTestsByWeek(DataFrame dataframe)
	{
		for (PegribaBloodTest.Type week : getWeeks())
		{
			for (PegribaBloodTest.Field field : getBloodtestcolumns())			
			{
				String column=PegribaBloodTest.createColumnName(field,week);
				dataframe.addColumn(column);
			}
		}
	}
}
