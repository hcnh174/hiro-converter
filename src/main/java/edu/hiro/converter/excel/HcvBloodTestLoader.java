package edu.hiro.converter.excel;

import edu.hiro.converter.domain.HcvBloodTest;
import edu.hiro.converter.repositories.HcvBloodTestRepository;
import edu.hiro.util.AbstractEntity;

public class HcvBloodTestLoader extends AbstractBloodTestLoader
{	
	private HcvBloodTestRepository repository;
		
	public HcvBloodTestLoader(HcvBloodTestRepository repository)
	{
		super(1,41,1);
		this.repository=repository;
		conversions.put("ne(%)","ne");
		conversions.put("ne%","ne");
		//conversions.put("gtp","ggtp");
		conversions.put("hcv(taq","hcvtaq");
		conversions.put("gpt","alt");
		conversions.put("got","ast");
		conversions.put("alt(gpt)","alt");
		conversions.put("ast(got)","ast");		
		conversions.put("hcvジェノタイプ","hcvgeno");
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
		repository.save((HcvBloodTest)bloodtest);
	}
}