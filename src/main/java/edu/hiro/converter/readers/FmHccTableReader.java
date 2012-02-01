package edu.hiro.converter.readers;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.filemaker.FmHccPatient;
import edu.hiro.util.CTable;

// fmhcc file has a comma in the field 外来医,follow先 that throws off SV loading
public class FmHccTableReader extends AbstractFmTableReader
{	
	public FmHccTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);		
		addConversion("ふりかな","フリガナ");
		addConversion("JIS score","JISscore");
		addConversion("T.Bil","TBil");
		addConversion("PT%","PT");
		addConversion("ICG-R","ICGR");
		addConversion("Liver damage","Liverdamage");
		addConversion("openRFA治療日１","openRFA治療日1");
		addConversion("RFA治療日２","RFA治療日2");
		addConversion("PEI治療日３","PEI治療日3");
		addConversion("TACE治療日４","TACE治療日4");
		addConversion("HAI治療日５","HAI治療日5");
		addConversion("chemo治療日６","chemo治療日6");
		addConversion("T.AFP","TAFP");
		addConversion("外来医,follow先","外来医follow先");
		addConversion("HBcAb×200","HBcAbx200");
		addConversion("CA19-9","CA199");
		addConversion("γglb","gammaglb");
		addConversion("γGTP","gammaGTP");
		addConversion("T.protein","Tprotein");
		addConversion("T.cho","Tcho");
		addConversion("D.Bil","DBil");
		addConversion("HDL ch","HDLch");
		addConversion("LDL ch","LDLch");
		addConversion("PT INR","PTINR");
		addConversion("HOMA-IR","HOMAIR");
		addConversion("75gOGTT施行日","OGTT施行日");
	}

	@Override
	protected void preProcess(CTable table)
	{
		super.preProcess(table);
		converterService.getDao().deleteFmHccData();
	}
	
	@Override
	protected Object getEntityById(int id)
	{
		FmHccPatient patient=new FmHccPatient(id);
		this.patients.add(patient);
		return patient;
	}
	
}
