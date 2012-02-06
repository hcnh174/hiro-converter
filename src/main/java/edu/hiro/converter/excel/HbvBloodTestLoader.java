package edu.hiro.converter.excel;

import edu.hiro.converter.filemaker.HbvBloodTest;
import edu.hiro.converter.repositories.HbvBloodTestRepository;
import edu.hiro.util.AbstractEntity;

public class HbvBloodTestLoader extends AbstractBloodTestLoader
{		
	private HbvBloodTestRepository repository;
		
	public HbvBloodTestLoader(HbvBloodTestRepository repository)
	{
		super(1,25,2);
		this.repository=repository;
		conversions.put("gpt","alt");
		conversions.put("got","ast");
		conversions.put("icg(r15)","icg");
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