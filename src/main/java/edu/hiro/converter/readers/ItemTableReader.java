package edu.hiro.converter.readers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.access.AbstractPatientItem;
import edu.hiro.converter.access.AccessPatient;
import edu.hiro.converter.access.BasicInfoItem;
import edu.hiro.converter.access.BiopsyAnonymizationItem;
import edu.hiro.converter.access.BiopsyItem;
import edu.hiro.converter.access.HospitalizationItem;
import edu.hiro.converter.access.InterferonItem;
import edu.hiro.converter.access.PrimaryDiseaseItem;
import edu.hiro.converter.access.SnpAnonymizationItem;
import edu.hiro.converter.access.SnpItem;
import edu.hiro.util.CException;
import edu.hiro.util.CIdList;
import edu.hiro.util.CTable;
import edu.hiro.util.MathHelper;

@SuppressWarnings("unchecked")
public class ItemTableReader extends AbstractTableReader
{
	private Map<Integer,AccessPatient> patients=new HashMap<Integer,AccessPatient>();
	private Map<Integer,AbstractPatientItem> items=new HashMap<Integer,AbstractPatientItem>();
	private Class cls;
	private static final String PATIENT_IDENTIFIER="個人ID";
	
	//////////////////////////////////////////////////////////////////////////////////

	public ItemTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);
		this.cls=getItemClass(params.getType());
		
		//tbl個人基本人
		addConversion("1日飲酒量","一日飲酒量");

		// SNP
		addConversion("他院患者No(SNP施設)","他院患者No");
		addConversion("DB №","DBNo");
		addConversion("匿名化№","匿名化No");

		//個人IFN
		addConversion("HBVDNA(TMA)陰性化日","HBVDNATMA陰性化日");
		addConversion("HCV-RNA（定性）（投与時）","HCVRNA定性投与時");
		addConversion("GPT（投与時）","GPT投与時");
		addConversion("HCV-RNA（投与終了日）","HCVRNA投与終了日");
		addConversion("GPT（HCV投与終了日）","GPTHCV投与終了日");
		addConversion("HCV-RNA（終了6ヵ月後）","HCVRNA終了6ヵ月後");
		addConversion("GPT（HCV投与終了6ヵ月後）","GPTHCV投与終了6ヵ月後");
		addConversion("HCV-RNA（投与前）","HCVRNA投与前");
		addConversion("GPT(投与前）","GPT投与前");
		addConversion("Plt（投与前）","Plt投与前");
		addConversion("Alb（投与前）","Alb投与前");
		addConversion("Plt（投与終了時）","Plt投与終了時");
		addConversion("Alb（投与終了時）","Alb投与終了時");
		addConversion("Plt（投与6ヶ月以降）","Plt投与6ヶ月以降");
		addConversion("Alb（投与6ヶ月以降）","Alb投与6ヶ月以降");
		addConversion("効果判定（投与終了時Biochemical Response)　","効果判定投与終了時BiochemicalResponse");
		addConversion("効果判定（投与終了時Virological Response)","効果判定投与終了時VirologicalResponse");
		addConversion("効果判定（投与6ヵ月後Biochemical Response)　","効果判定投与6ヵ月後BiochemicalResponse");
		addConversion("効果判定（投与6ヶ月後Virological Response)","効果判定投与6ヶ月後VirologicalResponse");
		addConversion("HCV-RNA(投与前の単位）","HCVRNA投与前の単位");
		addConversion("HCV-RNA(投与終了時の単位）","HCVRNA投与終了時の単位");
		addConversion("HCV-RNA(投与6ヶ月後の単位）","HCVRNA投与6ヶ月後の単位");
		addConversion("Trial/重複","Trial");
		addConversion("PT(初診時)","PT初診時");
		addConversion("治療2W目　HCV-RNA","治療2W目HCVRNA");
		addConversion("治療2W目　HCV-RNAの単位","治療2W目HCVRNAの単位");
		addConversion("治療2W目　Plt","治療2W目Plt");
		addConversion("治療4W目　HCV-RNA","治療4W目HCVRNA");
		addConversion("治療4W目　HCV-RNAの単位","治療4W目HCVRNAの単位");
		addConversion("治療4W目　Plt","治療4W目Plt");
		addConversion("ﾍﾟｸﾞﾘﾊﾞ(施設名)","ﾍﾟｸﾞﾘﾊﾞ施設名");
		addConversion("ﾍﾟｸﾞﾘﾊﾞｼｰﾄ№ ","ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo");
		addConversion("ﾍﾟｶﾞｼｽ(施設名)","ﾍﾟｶﾞｼｽ施設名");
		addConversion("ﾍﾟｶﾞｼｽｼｰﾄ№","ﾍﾟｶﾞｼｽｼｰﾄNo");
		addConversion("Trial施設名","Trial施設名");
		addConversion("Trial施設ID","Trial施設ID");
		addConversion("ﾍﾟｸﾞﾘﾊﾞ施設ID","ﾍﾟｸﾞﾘﾊﾞ施設ID");
		addConversion("ﾍﾟｶﾞｼｽ施設ID","ﾍﾟｶﾞｼｽ施設ID");
		addConversion("γGTP(治療前) ","gammaGTP治療前");
	
		//個人肝生検
		addConversion("新犬山分類(F)","新犬山分類F");
		addConversion("新犬山分類(A)","新犬山分類A");
		
		// do not delete!
		//addConversion("ΓGTP(治療前)","gammaGTP治療前");
	}

	@Override
	protected void preProcess(CTable table, List<CTable.Row> rows)
	{
		// find or create patients
		Integer col=table.getColumn(PATIENT_IDENTIFIER);
		List<Integer> ids=table.getNumericIdentifiers(rows,col);
		this.patients=this.converterService.findOrCreateAccessPatients(new CIdList(ids));
		
		// find or create items
		ids=table.getNumericIdentifiers(rows,IDENTIFIER_COLUMN);
		this.items=this.converterService.findOrCreateItems(new CIdList(ids),this.cls);
	}
	
	@Override
	protected void postProcess(CTable table, List<CTable.Row> rows)
	{
		this.converterService.getDao().addOrUpdateItems(this.items.values());
		this.patients.clear();
	}
	
	// override this method to handle special cases
	@Override
	protected void setProperty(Object obj, String property, String value)
	{
		if (property.equals(PATIENT_IDENTIFIER))
		{
			AbstractPatientItem item=(AbstractPatientItem)obj;
			AccessPatient patient=getPatientById(MathHelper.parseInt(value));
			patient.addItem(item);
		}
		else if (property.indexOf("ﾍﾟｸﾞﾘﾊﾞｼｰﾄ")!=-1)
			super.setProperty(obj,"ﾍﾟｶﾞｼｽｼｰﾄNo",value);
		else if (property.indexOf("ﾍﾟｶﾞｼｽｼｰﾄ")!=-1)
			super.setProperty(obj,"ﾍﾟｶﾞｼｽｼｰﾄNo",value);
		else if (property.indexOf("GTP(治療前)")!=-1)
			super.setProperty(obj,"gammaGTP治療前",value);
		else super.setProperty(obj,property,value);
	}
	
	@Override
	protected Object getEntityById(int id)
	{
		return this.items.get(id);
	}
	
	protected AccessPatient getPatientById(int id)
	{
		return this.patients.get(id);
	}
	
	protected Class getItemClass(ImportParams.TableType type)
	{
		switch(type)
		{
			case tbl個人基本: return BasicInfoItem.class;
			case tblSNP: return SnpItem.class;
			case tblSNP匿名化番号: return SnpAnonymizationItem.class;
			case tbl個人IFN: return InterferonItem.class;
			case tbl個人主病名: return PrimaryDiseaseItem.class;
			case tbl個人肝生検: return BiopsyItem.class;
			case tbl肝生検匿名化番号: return BiopsyAnonymizationItem.class;
			case tbl入院台帳: return HospitalizationItem.class;
		}
		throw new CException("no handler for item table type: "+type);
	}
}
