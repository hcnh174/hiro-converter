package edu.hiro.converter.readers;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.filemaker.FmHbvPatient;
import edu.hiro.util.CTable;

public class FmHbvTableReader extends AbstractFmTableReader
{	
	public FmHbvTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);
		addConversion("DB ?","DBno");
		addConversion("副　治療施設","副治療施設");
		addConversion("Fatty Liver","FattyLiver");
		addConversion("病歴　備考","病歴備考");
		addConversion("飲酒　分類","飲酒分類");
		addConversion("HCV Ab","HCVAb");
		addConversion("１　診断変更日","診断変更日1");
		addConversion("２　診断変更日","診断変更日2");
		addConversion("変更後の診断１","変更後の診断1");
		addConversion("２変更後の診断","変更後の診断2");
		addConversion("SNP匿名化№","SNP匿名化No");
		addConversion("HBcAb×200","HBcAbx200");
		addConversion("核アBreakthrough hepatitis 年月日","核アBreakthroughHepatitis年月日");
		addConversion("核アBreakthrough hepatitis 有無","核アBreakthroughHepatitis有無");
		addConversion("核アYMDD mutant測定年月日","核アYMDDmutant測定年月日");
		addConversion("核アYMDD mutant結果","核アYMDDmutant結果");
		addConversion("核酸短期有無ＮＡ種類","核酸短期有無NA種類");
		addConversion("核酸長期有無ＮＡ種類","核酸長期有無NA種類");
		addConversion("肝生検試行日 Bx1","肝生検試行日Bx1");
		addConversion("肝生検試行日 Bx2","肝生検試行日Bx2");
		addConversion("肝生検試行日 Bx3","肝生検試行日Bx3");
		addConversion("肝生検備考 Bx1","肝生検備考Bx1");
		addConversion("肝生検備考 Bx2","肝生検備考Bx2");
		addConversion("肝生検備考 Bx3","肝生検備考Bx3");
		addConversion("fibrosis　Bx1","fibrosisBx1");
		addConversion("fibrosis　Bx2","fibrosisBx2");
		addConversion("fibrosis　Bx3","fibrosisBx3");
		addConversion("activity Bx1","activityBx1");
		addConversion("activity Bx2","activityBx2");
		addConversion("activity Bx3","activityBx3");
		addConversion("ＨＡＩ　score Bx1","HAIscoreBx1");
		addConversion("ＨＡＩ　score Bx2","HAIscoreBx2");
		addConversion("ＨＡＩ　score Bx3","HAIscoreBx3");
	}

	@Override
	protected void preProcess(CTable table)
	{
		super.preProcess(table);
		converterService.getDao().deleteFmHbvData();
	}
	
	@Override
	protected Object getEntityById(int id)
	{
		FmHbvPatient patient=new FmHbvPatient(id);
		this.patients.add(patient);
		return patient;
	}
}
