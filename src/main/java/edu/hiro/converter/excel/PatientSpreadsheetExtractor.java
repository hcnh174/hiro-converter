package edu.hiro.converter.excel;

import java.util.List;

import org.apache.poi.ss.util.CellReference;

import edu.hiro.util.FileHelper;
import edu.hiro.util.StringHelper;

public class PatientSpreadsheetExtractor extends SpreadsheetExtractor
{
	//////////////////////////////////////////////////////////////////////////////////
	
	public PatientSpreadsheetExtractor(Params params)
	{
		super(params);
	}
	
	public static void main(String[] args)
	{
		PatientSpreadsheetExtractor extractor=new PatientSpreadsheetExtractor(new Params(args));		
		extractor.extract();
	}
	
	///////////////////////////////////////////////////////////
	
	private static void makePegribaRepeatingConfig()
	{
		List<String> colfields1=StringHelper.splitAsList("開始日,日3目,週1目,週2目,週3目,週4目,週5目,週6目,週7目,週8目,週12目,週16目,週20目,週24目,週28目,週32目,週36目,週40目,週44目,週48目");
		List<String> colfields2=StringHelper.splitAsList("週52目,週56目,週60目,週64目,週68目,週72目,週76目,週80目,週84目,週88目,週92目,週96目,投与終了時,終了4週目,終了8週目,終了12週目,終了16週目,終了20週目,終了24週目");
		List<String> rowfields=StringHelper.splitAsList("予定日,日付,WBC,好中球分画,Hb,Plt,AST,ALT,KL6,gammaGTP,HCV定量,HCV定性,減量中止の有無,Pegイントロン,レベトール");
		String str1=makeRepeatingConfig("C10",colfields1,rowfields);
		String str2=makeRepeatingConfig("C27",colfields2,rowfields);
		FileHelper.writeFile("c:/temp/config-part.txt",str1+str2);
	}
	
	private static String makeRepeatingConfig(String address, List<String> colfields, List<String> rowfields)
	{
		CellReference cellref=new CellReference(address);
		//System.out.println("address: "+address+", col="+cellref.getCol()+", row="+cellref.getRow());
		StringBuilder buffer=new StringBuilder();
		int col=cellref.getCol();
		for (String colfield : colfields)
		{
			int row=cellref.getRow();
			for (String rowfield : rowfields)
			{	
				String name=rowfield+"_"+colfield;
				CellReference cellref2=new CellReference(row,col);
				String address2=cellref2.formatAsString();
				buffer.append(name+"\t"+address2+"\n");
				row++;
			}
			col++;
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
