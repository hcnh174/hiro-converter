package edu.hiro.converter.excel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import edu.hiro.util.CException;
import edu.hiro.util.CTable;
import edu.hiro.util.DataFrame;
import edu.hiro.util.DateHelper;
import edu.hiro.util.ExcelHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.StringHelper;

public class SpreadsheetExtractor
{	
	//private static final short fieldcolor=IndexedColors.GREY_25_PERCENT.getIndex();
	//private static final short selectedcolor=IndexedColors.YELLOW.getIndex();
	private static final String pattern="yyyy'-'MM'-'dd_HH'-'mm";
	private static final String filecolumn="file";
	private static final String sheetcolumn="sheet";
	private static final String templatesheet="template";
	private static final String settingssheet="settings";	
	
	private MessageWriter writer=new MessageWriter();
	private ExcelHelper excelhelper=new ExcelHelper(writer);
	private Params params;
	private Config config;
	private DataFrame dataframe=new DataFrame(true);
	
	//////////////////////////////////////////////////////////////////////////////////
	
	public SpreadsheetExtractor(Params params)
	{
		this.params=params;
		if (params.quiet)
			writer.setQuiet();
	}
	
	public void extract()
	{
		try
		{
			System.out.println("importing data from directory "+params.getDir());
			loadConfig();
			if (params.getMode().equals("extract"))
			{
				loadFolder(params.dir);
				writeSpreadsheet();
			}
		}
		catch (Exception e)
		{
			System.err.println(e);
			error(e.toString());
			e.printStackTrace();
		}
	}

	private void loadConfig()
	{		
		config=new Config(params.template);
		dataframe.addColumn(filecolumn);
		dataframe.addColumn(sheetcolumn);
		for (Field field : config.getSelected())
		{
			dataframe.addColumn(field.getName());
		}
	}
	
	private void writeSpreadsheet()
	{
		System.out.println("Writing output to "+params.outfile);
		Workbook workbook=excelhelper.createWorkbook();
		excelhelper.createWorksheet(workbook, dataframe, "patients");
		excelhelper.writeWorkbook(workbook, params.outfile);
		//FileHelper.writeFile(params.outfile,dataframe.toString());
	}
	
	private List<String> listFiles(String dir)
	{
		List<String> filenames=new ArrayList<String>();
		//System.out.println("template filename="+params.template);
		for (String filename : FileHelper.listFilesRecursively(dir, ".xls", config.recursive))
		{
			String name=FileHelper.stripPath(filename);
			if (name.equals(params.template)) // skip template file
				continue;
			if (name.startsWith("selected-")) // skip output files
				continue;
			if (name.charAt(0)=='.')
				continue;
			if (!filenameMatches(filename))
				continue;
			System.out.println("filename="+filename);
			filenames.add(filename);
		}
		return filenames;
	}

	private void loadFolder(String dir)
	{
		dir=FileHelper.normalizeDirectory(dir);
		System.out.println("loading folder="+dir);
		for (String filename : listFiles(dir))
		{
			loadSpreadsheet(filename);
		}
	}
	
	private void loadSpreadsheet(String filename)
	{
		System.out.println("loading spreadsheet="+filename);
		Workbook workbook=null;
		try
		{
			workbook=excelhelper.openSpreadsheet(filename);
		}
		catch (Exception e)
		{
			error("Cannot open file "+filename+": "+e);
			//e.printStackTrace();
			return;
		}
		for (int sheetnum=0;sheetnum<workbook.getNumberOfSheets();sheetnum++)
		{
			Sheet sheet=workbook.getSheetAt(sheetnum);
			if (!sheetMatches(sheet))
				continue;
			loadSheet(filename,sheet);
		}
	}
	
	private void loadSheet(String filename, Sheet sheet)
	{
		if (config.skipSheet(sheet))
			return;
		try
		{
			config.checkSheet(sheet);
		}
		catch(CException e)
		{
			error(filename+": sheet "+sheet.getSheetName()+": "+e.getMessage());
			return;
		}
		String rowname=getRowname(filename,sheet);
		//String rowname=sheet.getSheetName();
		System.out.println("sheet name: "+sheet.getSheetName());
		dataframe.setValue(filecolumn, rowname, stripBaseDir(filename));
		dataframe.setValue(sheetcolumn, rowname, sheet.getSheetName());
		for (Field field : config.getSelected())
		{
			String colname=field.getName();
			Object value=getValue(sheet,field);
			dataframe.setValue(colname, rowname, value);
		}
	}
	
	private String stripBaseDir(String filename)
	{
		filename=FileHelper.normalize(filename);
		if (!filename.startsWith(params.dir))
			throw new CException("filename does not start with directory name: dir="+params.dir+", filename="+filename);
		return filename.substring(params.dir.length());
	}
	
	private String getRowname(String filename, Sheet sheet)
	{
		return stripBaseDir(filename)+"!"+sheet.getSheetName();
	}
	
	private Object getValue(Sheet sheet, Field field)
	{
		Object value=excelhelper.getCellValue(sheet, field.getRow(), field.getCol());
		value=adjustValue(value);
		return value;
	}

	private Object adjustValue(Object value)
	{
		if (value==null)
			return null;
		if (value instanceof Date)
			return adjustDateValue(value);
		return value;
	}
		
	private String adjustDateValue(Object value)
	{
		Date date=(Date)value;
		int year=DateHelper.getYear(date);
		if (year<1902)
			return null;
		return DateHelper.format(date,DateHelper.DATE_PATTERN);
	}
	
	private boolean filenameMatches(String path)
	{
		String filename=FileHelper.stripPath(path);
		boolean matches=filename.matches(config.filepattern);
		if (!matches)
			writer.message("filename "+filename+" does not match pattern "+config.filepattern+". skipping. ("+path+")");
		return matches;
	}
	
	private boolean sheetMatches(Sheet sheet)
	{
		boolean matches=sheet.getSheetName().matches(config.sheetpattern);
		if (!matches)
			writer.message("sheet "+sheet.getSheetName()+" does not match pattern "+config.sheetpattern+". skipping.");
		return matches;
	}
	
	private void error(String str)
	{
		System.err.println(str);
		FileHelper.appendFile(params.errfile,str,true);
	}
	
	public static class Params
	{
		protected String timestamp=DateHelper.format(pattern);
		protected String mode="extract";
		protected boolean quiet=true;
		protected String dir=".";
		protected String template="./template.xls";
		protected String outfile="./selected-"+timestamp+".xls";
		protected String errfile="./errors-"+timestamp+".txt";
		
		@Option(name="-mode", required=false)
		public void setMode(final String mode){this.mode=mode;}
		public String getMode(){return this.mode;}		
		
		@Option(name="-quiet", required=false)
		public void setQuiet(final String quiet){this.quiet=Boolean.valueOf(quiet);}
		public String getQuiet(){return ""+this.quiet;}		
		
		@Option(name="-dir", required=false)
		public void setDir(final String dir){this.dir=dir;}
		public String getDir(){return this.dir;}

		@Option(name="-template", required=false)
		public void setTemplate(final String template){this.template=template;}
		public String getTemplate(){return this.template;}
		
		@Option(name="-outfile", required=false)
		public void setOutfile(final String outfile){this.outfile=outfile;}
		public String getOutfile(){return this.outfile;}
		
		public Params(String[] args)
		{
			CmdLineParser parser = new CmdLineParser(this);
			try
			{
				parser.parseArgument(args);
			}
			catch (CmdLineException e)
			{
				 System.err.println(e.getMessage());
				 parser.printUsage(System.err);
			}
			dir=FileHelper.getFullPath(dir);
			template=FileHelper.normalize(template);
	    	outfile=FileHelper.normalize(outfile);
		}
		
	    @Override
		public String toString()
		{
			return StringHelper.toString(this);
		}
	}	

	public class Config
	{
		protected String filepattern=".*[0-9]+-[0-9]+\\.xls";
		protected String sheetpattern="[0-9]+";
		protected boolean recursive=false;
		protected String check=null;
		protected List<String> skipsheets=new ArrayList<String>();
		protected IndexedColors color=IndexedColors.YELLOW;
		protected Map<String,Field> fields=new LinkedHashMap<String,Field>();
			
		public Config(String configfile)
		{
			Workbook workbook=excelhelper.openSpreadsheet(params.template);
			loadTemplate(workbook);
			loadSettings(workbook);
		}
		
		private void loadTemplate(Workbook workbook)
		{
			Sheet sheet=workbook.getSheet(templatesheet);
			if (sheet==null)
				throw new CException("no sheet named "+templatesheet+" found");
			for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++)
			{  
				Row row = sheet.getRow(i);  
				for (int colnum=row.getFirstCellNum(); colnum<row.getLastCellNum();colnum++)
				{
					Cell cell=row.getCell(colnum);
					if (!isDefined(cell))
						continue;
					if (isSelected(cell))
						addField(cell,true);
					else addField(cell,false);
				}
			}
		}
		
		private boolean isDefined(Cell cell)
		{
			if (cell==null || cell.getCellStyle()==null)
				return false;
			return cell.getCellStyle().getFillPattern()==CellStyle.SOLID_FOREGROUND;
		}
		
		private void loadSettings(Workbook workbook)
		{
			Sheet sheet=workbook.getSheet(settingssheet);
			if (sheet==null)
				throw new CException("no sheet named "+settingssheet+" found");
			CTable table=excelhelper.extractTable(sheet);
			for (CTable.Row row : table.getRows())
			{
				String name=row.getValue(0);
				String value=row.getValue(1);
				setProperty(name,value);
			}
		}
		
		private void setProperty(String name, String value)
		{
			System.out.println("setting "+name+"="+value);
			if (name.equals("filepattern"))
				filepattern=value;
			else if (name.equals("sheetpattern"))
				sheetpattern=value;
			else if (name.equals("recursive"))
				recursive=Boolean.valueOf(value);
			else if (name.equals("color"))
				setSelectedColor(value);
			else if (name.equals("check"))
				this.check=value;
			else if (name.equals("skip"))
				this.skipsheets=StringHelper.splitAsList(value);
		}

		private void setSelectedColor(String value)
		{
			try
			{
				color=IndexedColors.valueOf(value.toUpperCase());		
			}
			catch (IllegalArgumentException e)
			{
				throw new CException("Problem trying to set color to ["+value+"]: ",e);
			}
		}
			
		private boolean isSelected(Cell cell)
		{
			return (cell.getCellStyle().getFillForegroundColor()==color.getIndex());
		}
		
		private void addField(Cell cell, boolean selected)
		{
			if (!selected) // skip unselected fields for now
				return;
			Object value=excelhelper.getCellValue(cell);
			if (value==null || value.toString().equals("") || value.toString().equals("1"))
				return;			
			Field field=new Field(cell,selected);
			fields.put(field.getName(),field);
			//System.out.println("field="+StringHelper.toString(field));
		}
		
		public Collection<Field> getFields()
		{
			return fields.values();
		}
		
		public Collection<Field> getSelected()
		{
			return Collections2.filter(fields.values(), new Predicate<Field>()
			{
				public boolean apply(Field field)
				{
					return field.getSelected();
				}
			});
		}
		
		public void checkSheet(Sheet sheet)
		{
			if (this.check==null)
				return;
			String[] arr=this.check.split("=");
			String address=arr[0];
			String checkvalue=arr[1];
			checkCell(sheet,address,checkvalue);
		}
		
		private void checkCell(Sheet sheet, String address, String checkvalue)
		{
			Object value=excelhelper.getCellValue(sheet, address);
			if (value==null)
				throw new CException("Expected ["+checkvalue+"] at cell "+address+" but found null");
			if (value.toString().equals(checkvalue))
				return;
			else throw new CException("Expected ["+checkvalue+"] at cell "+address+" but found ["+value+"]");
		}
		
		public boolean skipSheet(Sheet sheet)
		{
			String sheetname=sheet.getSheetName();
			for (String name : skipsheets)
			{
				if (name.equals(sheetname))
					return true;
			}
			return false;
		}
	}

	public class Field
	{
		protected String name;
		protected Integer col;
		protected Integer row;
		protected Boolean selected=false;
		
		public String getName(){return this.name;}
		public void setName(final String name){this.name=name;}

		public Integer getCol(){return this.col;}
		public void setCol(final Integer col){this.col=col;}

		public Integer getRow(){return this.row;}
		public void setRow(final Integer row){this.row=row;}
		
		public Boolean getSelected(){return this.selected;}
		public void setSelected(final Boolean selected){this.selected=selected;}

		public Field(Cell cell, boolean selected)
		{
			this.name=getName(cell);
			this.col=cell.getColumnIndex();
			this.row=cell.getRowIndex();
			this.selected=selected;
		}
		
		private String getName(Cell cell)
		{
			Object value=excelhelper.getCellValue(cell);
			if (value!=null)
				return value.toString();//+getAddress(cell);
			return getAddress(cell);
		}
		
		private String getAddress(Cell cell)
		{
			return "["+excelhelper.getAddress(cell)+"]";
		}
	}
	
	public static void main(String[] args)
	{
		SpreadsheetExtractor extractor=new SpreadsheetExtractor(new Params(args));		
		extractor.extract();
	}
}
