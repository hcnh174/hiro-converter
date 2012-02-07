package edu.hiro.converter.excel;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.google.common.collect.Maps;

import edu.hiro.converter.ImportHelper;
import edu.hiro.converter.filemaker.IfnBloodTest;
import edu.hiro.converter.filemaker.IfnTreatment;
import edu.hiro.converter.repositories.IfnBloodTestRepository;
import edu.hiro.converter.repositories.IfnTreatmentRepository;
import edu.hiro.util.BeanHelper;
import edu.hiro.util.DateHelper;
import edu.hiro.util.ExcelHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MathHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.StringHelper;

public class IfnSpreadsheetReader
{	
	protected static final String filepattern=".*[0-9]+-[0-9]+\\.xlsx";
	protected static final String sheetpattern="[0-9]+(-[0-9]+)?";
	
	private MessageWriter writer=new MessageWriter();
	private ExcelHelper excelhelper=new ExcelHelper();
	private BeanHelper beanhelper=new BeanHelper();
	
	//////////////////////////////////////////////////////////////////////////////////

	private IfnTreatmentRepository ifnTreatmentRepository;
	private IfnBloodTestRepository ifnBloodTestRepository;
	
	public IfnSpreadsheetReader(IfnTreatmentRepository ifnTreatmentRepository,
			IfnBloodTestRepository ifnBloodTestRepository)
	{
		this.ifnTreatmentRepository=ifnTreatmentRepository;
		this.ifnBloodTestRepository=ifnBloodTestRepository;
	}
	
	public void loadFolder(String dir)
	{
		ifnTreatmentRepository.deleteAll();
		ifnBloodTestRepository.deleteAll();
		dir=FileHelper.normalizeDirectory(dir);
		writer.message("loading folder="+dir);
		List<String> filenames=FileHelper.listFilesRecursively(dir, ".xlsx");
		for (String filename : filenames)
		{
			if (!ImportHelper.filenameMatches(filename, filepattern))
				continue;
			try
			{
				loadSpreadsheet(filename);
			}
			catch(Exception e)
			{
				System.err.println("problem with file "+filename+", skipping");
			}
		}
	}

	public void loadSpreadsheet(String filename)
	{
		writer.message("loading spreadsheet="+filename);
		Workbook workbook=excelhelper.openSpreadsheet(filename);
		for (int sheetnum=0;sheetnum<workbook.getNumberOfSheets();sheetnum++)
		{
			Sheet sheet=workbook.getSheetAt(sheetnum);
			if (!ImportHelper.sheetMatches(sheet,sheetpattern))
				continue;
			try
			{
				loadSheet(sheet);
			}
			catch(Exception e)
			{
				System.err.println("problem with sheet "+sheet.getSheetName()+", skipping");
			}
		}
		writer.br();
	}
	
	private IfnTreatment createIfnTreatment(Sheet sheet)
	{
		String ifnDBno=sheet.getSheetName();
		return new IfnTreatment(ifnDBno);
	}
	
	private void loadSheet(Sheet sheet)
	{
		writer.write(sheet.getSheetName()+" ");
		IfnTreatment patient=createIfnTreatment(sheet);
	
		setField(sheet,patient,"DBno",39,22,1,2);//DBno
		setField(sheet,patient,"投与開始日",3,1,1,4);
		setField(sheet,patient,"投与終了日",6,1,1,4);
		setField(sheet,patient,"病院",3,6,1,2);
		setField(sheet,patient,"医師",3,8,1,2);
		setField(sheet,patient,"病院ID",3,10,1,2);//病院ID
		setField(sheet,patient,"姓",3,12);
		setField(sheet,patient,"名",3,13);
		setField(sheet,patient,"生年月日",3,14,1,2);
		//setField(sheet,patient,"年齢",3,16);
		setField(sheet,patient,"性別",3,17);
		setField(sheet,patient,"身長",3,18);
		setField(sheet,patient,"体重",3,19);
		setField(sheet,patient,"肝組織",3,20);
		setField(sheet,patient,"肝生検",3,21,1,2);
		setField(sheet,patient,"ICG",3,23);
		setField(sheet,patient,"genotype",3,24);//Genotype
		setField(sheet,patient,"ifn既往",3,25);
		setField(sheet,patient,"効果判定",3,26,1,2);
		
		//投与開始前検査 - 投与開始時データ
		setField(sheet,patient,"HCVcore抗体開始",6,8);
		setField(sheet,patient,"クレアチニン開始",6,9);
		setField(sheet,patient,"ヒアルロン酸開始",6,10);
		setField(sheet,patient,"フェリチン開始",6,11);
		setField(sheet,patient,"ANA開始",6,12);
		setField(sheet,patient,"マイクロゾーム開始",6,13);
		setField(sheet,patient,"T3開始",6,14);
		setField(sheet,patient,"T4開始",6,15);
		setField(sheet,patient,"TSH開始",6,16);
		setField(sheet,patient,"HbA1c開始",6,17);
		setField(sheet,patient,"TCHO開始",6,18);
		setField(sheet,patient,"TG開始",6,19);
		setField(sheet,patient,"HDL開始",6,20);
		setField(sheet,patient,"FE開始",6,21);
		setField(sheet,patient,"AFP開始",6,22);
		setField(sheet,patient,"血糖開始",6,23); //血糖(FBS)
		setField(sheet,patient,"INS開始",6,24); //INS(ｲﾝｽﾘﾝ)開始
		
		//投与開始前検査 - 投与終了時データ
		setField(sheet,patient,"HCVcore抗体終了",7,8);
		setField(sheet,patient,"クレアチニン終了",7,9);
		setField(sheet,patient,"ヒアルロン酸終了",7,10);
		setField(sheet,patient,"フェリチン終了",7,11);
		setField(sheet,patient,"ANA終了",7,12);
		setField(sheet,patient,"マイクロゾーム終了",7,13);
		setField(sheet,patient,"T3終了",7,14);
		setField(sheet,patient,"T4終了",7,15);
		setField(sheet,patient,"TSH終了",7,16);
		setField(sheet,patient,"HbA1c終了",7,17);
		setField(sheet,patient,"TCHO終了",7,18);
		setField(sheet,patient,"TG終了",7,19);
		setField(sheet,patient,"HDL終了",7,20);
		setField(sheet,patient,"FE終了",7,21);
		setField(sheet,patient,"AFP終了",7,22);
		setField(sheet,patient,"血糖終了",7,23); //血糖(FBS)終了
		setField(sheet,patient,"INS終了",7,24); //INS(ｲﾝｽﾘﾝ)終了
		
		setField(sheet,patient,"効果判定bio",9,25,2,3);//効果判定Bio
		setField(sheet,patient,"効果判定viro",11,25,2,3);//効果判定Viro
		
		//Pegｲﾝﾄﾛﾝ
		setField(sheet,patient,"pegｲﾝﾄﾛﾝ減量",15,24);//Pegｲﾝﾄﾛﾝ減量
		setField(sheet,patient,"pegｲﾝﾄﾛﾝ時期",15,25);
		setField(sheet,patient,"pegｲﾝﾄﾛﾝ変更後の量",15,26,1,2);
		setField(sheet,patient,"pegｲﾝﾄﾛﾝ備考",16,24,3,2);
		setField(sheet,patient,"pegｲﾝﾄﾛﾝ総投与量",17,26,2,2);
		
		//ﾚﾍﾞﾄｰﾙ
		setField(sheet,patient,"ﾚﾍﾞﾄｰﾙ減量",21,24);
		setField(sheet,patient,"ﾚﾍﾞﾄｰﾙ時期",21,25);
		setField(sheet,patient,"ﾚﾍﾞﾄｰﾙ変更後の量",21,26,1,2);
		setField(sheet,patient,"ﾚﾍﾞﾄｰﾙ備考",22,24,3,2);
		setField(sheet,patient,"ﾚﾍﾞﾄｰﾙ総投与量",23,26,2,2);

		setField(sheet,patient,"シート名",39,24,1,2);
		setField(sheet,patient,"ダブル登録",39,26,1,2);
		setField(sheet,patient,"SNPsIDch",41,22);
		setField(sheet,patient,"SNPsIDno",41,23);
		setField(sheet,patient,"匿名化no",41,24,1,2);//匿名化No
		
		//patient.年齢=DateHelper.getDurationInYears(patient.投与開始日,patient.生年月日);
		//StringHelper.println(patient.toString());
		ifnTreatmentRepository.save(patient);
		
		loadBloodTests(sheet,patient);
	}
	
	private void setField(Sheet sheet, Object obj, String property, int row, int col)
	{
		setField(sheet,obj,property,row,col,1,1);
	}

	private void setField(Sheet sheet, Object obj, String property, int row, int col, int rowspan, int colspan)
	{
		//importhelper.setField(obj,property,"test");
		Object value=excelhelper.getCellValue(sheet,row-1,col-1); // POI is 0-based
		value=adjustValue(property,value);
		if (value==null)
			return;
		beanhelper.setField(obj,property,value.toString());
	}
	
	private Object adjustValue(String property, Object value)
	{
		if (value==null)
			return null;
		if (property.equals("性別") && ImportHelper.Sex.find(value.toString())==null)
			return null;
		if (isND(property,value))
			return null;
		//System.out.println("setting "+obj.getClass().getName()+" property: "+property+"=["+value+"] ("+value.getClass().getCanonicalName()+")");
		if (value instanceof Date)
			return adjustDateValue(property,value);
		if (isZeroAsEmptyField(property,value))
			return null;
		if (value instanceof Double && (value.toString().indexOf(".0")!=-1) || value.toString().indexOf("E")!=-1)
		{
			Double dvalue=MathHelper.parseDouble(value.toString());
			if (dvalue!=null)
				value=StringHelper.formatDecimal(dvalue,0);
			//System.out.println("weird double property: "+property+" value="+value);
		}
		if (value!=null)
			value=StringHelper.normalize(value.toString());
		return value;
	}
	
	private String adjustDateValue(String property, Object value)
	{
		Date date=(Date)value;
		int year=DateHelper.getYear(date);
		if (year<1902)
			return null;
		return DateHelper.format(date,DateHelper.DATE_PATTERN);
	}
	
	private boolean isND(String property, Object value)
	{
		if (!(value instanceof String))
			return false;
		String svalue=value.toString().trim();
		return svalue.equals("ND") || svalue.equals("ＮＤ");
	}
	
	private boolean isZeroAsEmptyField(String property, Object value)
	{
		if (!(value instanceof Double))
			return false;
		double dvalue=((Double)value).doubleValue();
		if (dvalue!=0)
			return false;
		return true;
	}
	
	///////////////////////////////////////////////////////////////
	
	private void loadBloodTests(Sheet sheet, IfnTreatment patient)
	{		
		IfnBloodTest.Type[] weeks=IfnBloodTest.Type.values();
		Map<IfnBloodTest.Type,IfnBloodTest> bloodtests=Maps.newLinkedHashMap();
		
		int col=3;
		for (int i=0;i<=20;i++)
		{
			IfnBloodTest.Type week=weeks[i];
			IfnBloodTest bloodtest=findOrCreateBloodTest(patient,bloodtests,week);
			int row=10;
			for (IfnBloodTest.Field field : IfnBloodTest.Field.values())
			{
				setField(sheet,bloodtest,field.name(),row++,col);
			}
			col++;
		}
		col=3;
		for (int i=21;i<weeks.length;i++)
		{
			IfnBloodTest.Type week=weeks[i];
			IfnBloodTest bloodtest=findOrCreateBloodTest(patient,bloodtests,week);
			int row=27;
			for (IfnBloodTest.Field field : IfnBloodTest.Field.values())
			{
				setField(sheet,bloodtest,field.name(),row++,col);
			}
			col++;
		}
		
		for (IfnBloodTest bloodtest : bloodtests.values())
		{
			if (!bloodtest.isEmpty())
				ifnBloodTestRepository.save(bloodtest);
		}
	}

	private IfnBloodTest findOrCreateBloodTest(IfnTreatment patient, Map<IfnBloodTest.Type,IfnBloodTest> bloodtests, IfnBloodTest.Type type)
	{
		if (!bloodtests.containsKey(type))
			bloodtests.put(type,new IfnBloodTest(patient.ifnDBno,type));
		return bloodtests.get(type);
	}
}

/*
String regex="[0-9]+(-[0-9]+)?"; String name;
name="3421"; System.out.println(name+"="+name.matches(regex));
name="3421-2"; System.out.println(name+"="+name.matches(regex));
name="Sheet1"; System.out.println(name+"="+name.matches(regex));
*/

