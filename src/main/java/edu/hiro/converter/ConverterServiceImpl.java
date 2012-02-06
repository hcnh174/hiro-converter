package edu.hiro.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.excel.HbvBloodTestLoader;
import edu.hiro.converter.excel.HcvBloodTestLoader;
import edu.hiro.converter.repositories.HbvBloodTestRepository;
import edu.hiro.converter.repositories.HcvBloodTestRepository;

@Service("converterService")
@Transactional
public class ConverterServiceImpl implements ConverterService
{
	@Autowired
	HcvBloodTestRepository hcvBloodTestRepository;
	
	@Autowired
	HbvBloodTestRepository hbvBloodTestRepository;

	public void loadHcvBloodTests(String folder)
	{
		HcvBloodTestLoader loader=new HcvBloodTestLoader(hcvBloodTestRepository);
		loader.loadFolder(folder);
	}
	
	public void loadHbvBloodTests(String folder)
	{
		HbvBloodTestLoader loader=new HbvBloodTestLoader(hbvBloodTestRepository);
		loader.loadFolder(folder);
	}
}
