package edu.hiro.converter.readers;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.filemaker.AbstractFmPatient;
import edu.hiro.converter.filemaker.FmHcvPatient;
import edu.hiro.converter.repositories.FmHcvPatientRepository;
import edu.hiro.util.CTable;
import edu.hiro.util.StringHelper;

public class FmHcvTableReader extends AbstractFmTableReader
{	
	protected FmHcvPatientRepository fmHcvPatientRepository;
	
	public FmHcvTableReader(ConverterServiceImpl converterService, ImportParams params, FmHcvPatientRepository fmHcvPatientRepository)
	{
		super(converterService,params);
		this.fmHcvPatientRepository=fmHcvPatientRepository;
		
		addConversion("DB №","DBno");		
		/*
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
		addConversion("DM ｺﾝﾄﾛｰﾙ","DMｺﾝﾄﾛｰﾙ");
		addConversion("γ-globlin","gammagloblin");
		addConversion("γ-GTP","gammaGTP");
		addConversion("HCV-RNA量","HCVRNA量");
		addConversion("Ⅱ度の肝性脳症有無","二度の肝性脳症有無");
		addConversion("HOMA-IR score","HOMAIRscore");
		addConversion("初診時合併症Ⅱ度の肝性脳症診断日","初診時合併症2度の肝性脳症診断日");
		addConversion("合併症Ⅱ度の肝性脳症出現の有無","合併症2度の肝性脳症出現の有無");
		addConversion("合併症出現Ⅱ度の肝性脳症診断日","合併症出現2度の肝性脳症診断日");
		addConversion("HCV core 70","HCVcore70");
		addConversion("HCV core 90","HCVcore90");
		addConversion("HCV core ISDR","HCVcoreISDR");
		addConversion("HCV core 検査日","HCVcore検査日");
		addConversion("肝生検施行日 Bx1","肝生検施行日Bx1");
		addConversion("肝生検施行日 Bx2","肝生検施行日Bx2");
		addConversion("肝生検施行日 Bx3","肝生検施行日Bx3");
		addConversion("肝生検施行日 Bx4","肝生検施行日Bx4");
		addConversion("肝生検施行日 Bx5","肝生検施行日Bx5");
		addConversion("肝生検施行日 Bx6","肝生検施行日Bx6");
		addConversion("肝生検施行日 Bx7","肝生検施行日Bx7");
		addConversion("肝生検施行日 Bx8","肝生検施行日Bx8");
		addConversion("肝生検施行日 Bx9","肝生検施行日Bx9");
		addConversion("肝生検施行日 Bx10","肝生検施行日Bx10");
		addConversion("肝生検備考 Bx1","肝生検備考Bx1");
		addConversion("肝生検備考 Bx2","肝生検備考Bx3");
		addConversion("肝生検備考 Bx3","肝生検備考Bx2");
		addConversion("肝生検備考 Bx4","肝生検備考Bx4");
		addConversion("肝生検備考 Bx5","肝生検備考Bx5");
		addConversion("肝生検備考 Bx6","肝生検備考Bx6");
		addConversion("肝生検備考 Bx7","肝生検備考Bx7");
		addConversion("肝生検備考 Bx8","肝生検備考Bx8");
		addConversion("肝生検備考 Bx9","肝生検備考Bx9");
		addConversion("肝生検備考 Bx10","肝生検備考Bx10");
		addConversion("fibrosis　Bx1","fibrosisBx1");
		addConversion("fibrosis　Bx2","fibrosisBx2");
		addConversion("fibrosis　Bx3","fibrosisBx3");
		addConversion("fibrosis　Bx4","fibrosisBx4");
		addConversion("fibrosis　Bx5","fibrosisBx5");
		addConversion("fibrosis　Bx6","fibrosisBx6");
		addConversion("fibrosis　Bx7","fibrosisBx7");
		addConversion("fibrosis　Bx8","fibrosisBx8");
		addConversion("fibrosis　Bx9","fibrosisBx9");
		addConversion("fibrosis　Bx10","fibrosisBx10");
		addConversion("activity Bx1","activityBx1");
		addConversion("activity Bx2","activityBx2");
		addConversion("activity Bx3","activityBx3");
		addConversion("activity Bx4","activityBx4");
		addConversion("activity Bx5","activityBx5");
		addConversion("activity Bx6","activityBx6");
		addConversion("activity Bx7","activityBx7");
		addConversion("activity Bx8","activityBx8");
		addConversion("activity Bx9","activityBx9");
		addConversion("activity Bx10","activityBx10");
		addConversion("ＨＡＩ　score Bx1","HAIscoreBx1");
		addConversion("ＨＡＩ　score Bx2","HAIscoreBx2");
		addConversion("ＨＡＩ　score Bx3","HAIscoreBx3");
		addConversion("ＨＡＩ　score Bx4","HAIscoreBx4");
		addConversion("ＨＡＩ　score Bx5","HAIscoreBx5");
		addConversion("ＨＡＩ　score Bx6","HAIscoreBx6");
		addConversion("ＨＡＩ　score Bx7","HAIscoreBx7");
		addConversion("ＨＡＩ　score Bx8","HAIscoreBx8");
		addConversion("ＨＡＩ　score Bx9","HAIscoreBx9");
		addConversion("ＨＡＩ　score Bx10","HAIscoreBx10");
		*/
	}

	@Override
	protected void preProcess(CTable table)
	{
		super.preProcess(table);
		fmHcvPatientRepository.deleteAll();
		//converterService.getDao().deleteFmHcvData();
	}

	@Override
	protected Object getEntityById(int id)
	{
		FmHcvPatient patient=new FmHcvPatient(id);
		this.patients.add(patient);
		return patient;
	}
	
	@Override
	protected void saveOrUpdateAll()
	{
		System.out.println("saving patients: num="+StringHelper.toString(patients.size()));
		for (AbstractFmPatient patient : this.patients)
		{
			System.out.println("saving patient: "+StringHelper.toString(patient));
			fmHcvPatientRepository.save((FmHcvPatient)patient);
		}
	}
}
