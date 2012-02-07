package edu.hiro.converter.excel;

import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;

import edu.hiro.converter.domain.HbvBloodTest;
import edu.hiro.converter.repositories.HbvBloodTestRepository;
import edu.hiro.util.AbstractEntity;

public class HbvBloodTestLoader extends AbstractBloodTestLoader
{		
	private HbvBloodTestRepository repository;
		
	public HbvBloodTestLoader(HbvBloodTestRepository repository)
	{
		this.repository=repository;
		skipfields.add("ICG(R15)");
	}
	
	@Override
	protected void getBasicInfo(Sheet sheet, Map<String,String> info)
	{
		info.put("患者名",helper.getStringCellValue(sheet, "B1"));
		info.put("フリガナ",helper.getStringCellValue(sheet, "B2"));
		info.put("主治療施設",helper.getStringCellValue(sheet, "C1"));
		info.put("num",helper.getStringCellValue(sheet, "D1"));
		info.put("status",helper.getStringCellValue(sheet, "E1"));
		info.put("tx",helper.getStringCellValue(sheet, "F1"));
	}
	
	protected void deleteAll()
	{
		repository.deleteAll();
	}
	
	protected AbstractEntity createEntity()
	{
		return new HbvBloodTest();
	}
	
	protected void save(AbstractEntity bloodtest)
	{
		repository.save((HbvBloodTest)bloodtest);
	}
}