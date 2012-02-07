package edu.hiro.converter;

import org.springframework.batch.core.JobExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.excel.HbvBloodTestLoader;
import edu.hiro.converter.excel.HcvBloodTestLoader;
import edu.hiro.converter.excel.IfnSpreadsheetReader;
import edu.hiro.converter.repositories.AccessPatientRepository;
import edu.hiro.converter.repositories.FmFirstExamRepository;
import edu.hiro.converter.repositories.FmHbvPatientRepository;
import edu.hiro.converter.repositories.FmHcvPatientRepository;
import edu.hiro.converter.repositories.HbvBloodTestRepository;
import edu.hiro.converter.repositories.HcvBloodTestRepository;
import edu.hiro.converter.repositories.IfnBloodTestRepository;
import edu.hiro.converter.repositories.IfnTreatmentRepository;
import edu.hiro.util.SpringBatchHelper;

@Service("converterService")
//@Transactional
public class ConverterServiceImpl implements ConverterService
{
	
	@Autowired
	AccessPatientRepository accessPatientRepository;
	
	@Autowired
	FmFirstExamRepository fmFirstExamRepository;
	
	@Autowired
	FmHbvPatientRepository fmHbvPatientRepository;
	
	@Autowired
	FmHcvPatientRepository fmHcvPatientRepository;
	
	@Autowired
	HcvBloodTestRepository hcvBloodTestRepository;
	
	@Autowired
	HbvBloodTestRepository hbvBloodTestRepository;
	
	@Autowired
	IfnTreatmentRepository ifnTreatmentRepository;
	
	@Autowired
	IfnBloodTestRepository ifnBloodTestRepository;


	// filemaker files
	
	public void loadAccessPatients(String filename)
	{
		accessPatientRepository.deleteAll();
		runJob("loadAccessPatients","filename",filename);		
	}
	
	public void loadFmFirstExamPatients(String filename)
	{
		fmFirstExamRepository.deleteAll();
		runJob("loadFmFirstExamPatients","filename",filename);		
	}
	
	public void loadFmHbvPatients(String filename)
	{
		fmHbvPatientRepository.deleteAll();
		runJob("loadFmHbvPatients","filename",filename);		
	}
	
	public void loadFmHcvPatients(String filename)
	{
		fmHcvPatientRepository.deleteAll();
		runJob("loadFmHcvPatients","filename",filename);		
	}
	
	// blood test spreadsheets
	
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
	
	// ifn spreadsheets
	
	public void loadPegribaSpreadsheets(String folder)
	{
		System.out.println("importing data from directory "+folder);
		IfnSpreadsheetReader reader=new IfnSpreadsheetReader(ifnTreatmentRepository,
				ifnBloodTestRepository);
		reader.loadFolder(folder);
	}
	
	///////////////////////////////////////////////////////
	
	private JobExecution runJob(String id, Object...args)
	{
		String filename1="/META-INF/spring/applicationContext.xml";
		String filename2="/META-INF/spring/batch-setup.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(filename1,filename2);
		JobExecution jobExecution=SpringBatchHelper.runJob(context, id, args);
		System.out.println("Job ended with status: "+jobExecution.getExitStatus());
		return jobExecution;
	}
	
	public void test()
	{
		HbvBloodTestLoader loader=new HbvBloodTestLoader(hbvBloodTestRepository);
		loader.loadFile("D:/projects/patientdb.etc/dataroom/血液データ(Excel)/B型/18001-18100.xlsx");
	}
}
