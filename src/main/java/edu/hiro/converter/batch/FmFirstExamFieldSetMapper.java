package edu.hiro.converter.batch;

import edu.hiro.converter.filemaker.FmFirstExam;

public class FmFirstExamFieldSetMapper extends AbstractPatientFieldSetMapper<FmFirstExam>
{
	@Override
	protected FmFirstExam createEntity()
	{
		return new FmFirstExam();
	}

//		addConversion("エンボス","患者ID");
//		addConversion("肝研ＩＤ","肝研ID");
//		addConversion("ふりがな","フリガナ");
//		addConversion("紹介元〒","紹介元zip");
//		addConversion("身長","BH");
//		addConversion("体重","BW");
//		addConversion("ＢＭＩ","BMI");
//		addConversion("その他の合併症１","その他の合併症1");
//		addConversion("肝疾患家族歴１","肝疾患家族歴1");
}
