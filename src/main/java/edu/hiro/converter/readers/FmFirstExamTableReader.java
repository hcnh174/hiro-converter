package edu.hiro.converter.readers;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.filemaker.FmFirstExam;
import edu.hiro.util.CTable;

public class FmFirstExamTableReader extends AbstractFmTableReader
{	
	public FmFirstExamTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);
		
		addConversion("エンボス","患者ID");
		addConversion("肝研ＩＤ","肝研ID");
		addConversion("ふりがな","フリガナ");
		addConversion("紹介元〒","紹介元zip");
		addConversion("身長","BH");
		addConversion("体重","BW");
		addConversion("ＢＭＩ","BMI");
		addConversion("その他の合併症１","その他の合併症1");
		addConversion("肝疾患家族歴１","肝疾患家族歴1");	}

	@Override
	protected void preProcess(CTable table)
	{
		super.preProcess(table);
		converterService.getDao().deleteFmFirstExamData();
	}
	
	@Override
	protected Object getEntityById(int id)
	{
		FmFirstExam patient=new FmFirstExam(id);
		this.patients.add(patient);
		return patient;
	}
	
}
