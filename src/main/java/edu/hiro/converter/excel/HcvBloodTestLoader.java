package edu.hiro.converter.excel;

import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;

import com.google.common.base.Charsets;

import edu.hiro.converter.domain.HcvBloodTest;
import edu.hiro.converter.repositories.HcvBloodTestRepository;
import edu.hiro.util.AbstractEntity;
import edu.hiro.util.StringHelper;

public class HcvBloodTestLoader extends AbstractBloodTestLoader
{	
	private HcvBloodTestRepository repository;
		
	public HcvBloodTestLoader(HcvBloodTestRepository repository)
	{
		this.repository=repository;
		conversions.put("NE(%)","ne");
		conversions.put("NE%","ne");
		conversions.put("HCV(Taq","hcvtaq");
		conversions.put("ALT(GPT)","ALT");
		conversions.put("AST(GOT)","AST");		
		conversions.put("HCVジェノタイプ","hcvGENO");
		conversions.put("HCVコアコウタ","hcvコアコウタイ");
		conversions.put("HCVモニタジ","hcvモニタジェノタイプ");
		
		//skipfields.add("");
	}

	@Override
	protected void getBasicInfo(Sheet sheet, Map<String,String> info)
	{
		info.put("num",helper.getStringCellValue(sheet, "B1"));
		info.put("患者名",helper.getStringCellValue(sheet, "C1"));		
		info.put("status",helper.getStringCellValue(sheet, "E1"));
		info.put("tx",helper.getStringCellValue(sheet, "F1"));
	}
	
	protected void deleteAll()
	{
		repository.deleteAll();
	}
	
	protected AbstractEntity createEntity()
	{
		return new HcvBloodTest();
	}
	
	protected void save(AbstractEntity bloodtest)
	{
		try
		{
		repository.save((HcvBloodTest)bloodtest);
		}
		catch(Exception e)
		{
			StringHelper.println(e.getMessage(),Charsets.UTF_16);
		}
	}
}