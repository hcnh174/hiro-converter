package edu.hiro.converter;

import java.util.List;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import edu.hiro.util.CException;
import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.ExceptionHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.StringHelper;

public class Converter
{	
//	public static void main(String[] argv)
//	{
//		//StringHelper.println("ｱﾚﾙｷﾞｰ="+StringHelper.normalize("ｱﾚﾙｷﾞｰ"),Charsets.UTF_16);		
//		//String dir="h:/patientdb.etc";
//		String dir="d:/projects/patientdb.etc";
//		//ExcelHelper helper=new ExcelHelper();
//		String filename="d:/projects/patientdb.etc/dataroom/血液データ(Excel)/C型/1601-1700.xlsx";
//		BloodTestLoader loader=new BloodTestLoader();
//		loader.loadFile(filename);
//		
//		//BatchImportService batchService=new BatchImportServiceImpl();
//		//batchService.loadPatients(dir);
//	}
	
	public static void main(String[] argv)
	{		
		Args args=new Args(argv);
		if (args.actions.size()==0 || args.actions.get(0)==Action.help)
		{
			System.out.println(Args.getHelp());
			return;
		}
		
		Params params=args.loadParams();
		System.out.println("params: "+params.toString());
		
		Converter converter=new Converter(params);
		try
		{
			converter.execute(args.actions);
		}
		catch(Exception e)
		{
			System.err.println(ExceptionHelper.getMessage(e));
			e.printStackTrace();
			FileHelper.writeFile("c:/temp/converter-exception.txt",ExceptionHelper.getMessage(e));
		}
	}

	private Params params;
	private MessageWriter writer=new MessageWriter();
	private GenericXmlApplicationContext applicationContext=null;
	
	public Converter(Params params)
	{
		this.params=params;
	}
	
	public void execute(List<Action> actions)
	{
		for (Action action : actions)
		{
			execute(action);
		}
	}
	
	public boolean execute(Action action)
	{
		System.out.println("starting action: "+action);
		switch(action)
		{
		case load:
			return load();
		case correct:
			return correct();
		//case merge:
		//	return merge();
		case help:
			return doNothing();
		default:
			writer.message("no handler for action: "+action);
			return false;
		}
	}
	
	public boolean load()
	{
		List<String> filenames=StringHelper.wrap(StringHelper.split(params.files,","),params.inDir,"");
		ConverterService converterService=getConverterService();
		//converterService.importFiles(filenames, new ImportParams(writer));
		//String filename="d:/projects/patientdb.etc/dataroom/血液データ(Excel)/C型/1601-1700.xlsx";
		String folder="d:/projects/patientdb.etc/dataroom/血液データ(Excel)/C型";
		//converterService.loadHcvBloodTests(folder);
		folder="d:/projects/patientdb.etc/dataroom/血液データ(Excel)/B型";
		converterService.loadHbvBloodTests(folder);
		return true;
	}
	
	public boolean correct()
	{
		System.out.println("apply corrections");
		return true;
	}

	
	public boolean doNothing()
	{
		return true;
	}
	
	private GenericApplicationContext getApplicationContext()
	{
		if (applicationContext==null)
			loadApplicationContext();
		return applicationContext;		
	}
	
	private void loadApplicationContext()
	{
		if (!DatabaseHelper.databaseExists(params.converter))
			throw new CException("can't create application context because database not created yet: "+params.converter.getName());
			
		applicationContext = new GenericXmlApplicationContext();
		//SpringHelper.registerDataSource(applicationContext,"converterDataSource",params.converter);
		applicationContext.load("META-INF/spring/applicationContext.xml");
		//SpringHelper.registerDataSource(applicationContext,"dataSource",params.hdb);
		//registerDataSource(applicationContext,"converterDataSource",params.db,"converter");
		//SpringHelper.loadXmlBeanDefinitions(applicationContext,"classpath:META-INF/spring/applicationContext.xml");
		applicationContext.refresh();
	}
	
	private ConverterService getConverterService()
	{
		return (ConverterService)getApplicationContext().getBean("converterService");
	}
}
