package edu.hiro.converter.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.hiro.util.SpringBatchHelper;

public class BatchImportServiceImpl implements BatchImportService
{
	public void loadPatients(String dir) {
		JobExecution jobExecution = runJob("loadPatients","dir",dir);
		System.out.println("Job ended with status: "+jobExecution.getExitStatus());
	}
	
	private JobExecution runJob(String id, Object...args)
	{
		String filename1="/META-INF/spring/applicationContext.xml";
		String filename2="/META-INF/spring/batch-setup.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(filename1,filename2);
		return SpringBatchHelper.runJob(context, id, args);		
	}
}
