package edu.hiro.converter;

import java.util.List;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.ExceptionHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;

public class Converter
{	
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
		
		DatabaseHelper.createSetupFile("src/main/sql");
	
		//if (true) return;
		
		Converter converter=new Converter(params);
		try
		{
			//converter.execute(args.actions);
			
//			converter.loadHbvBloodTests();
//			converter.loadHcvBloodTests();
			converter.loadPegribaSpreadsheets();		
//			converter.loadAccessPatients();
//			converter.loadFmFirstExamPatients();
//			converter.loadFmHbvPatients();
//			converter.loadFmHcvPatients();
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
		case help:
			return doNothing();
		default:
			writer.message("no handler for action: "+action);
			return false;
		}
	}
	
	public boolean load()
	{
		loadHbvBloodTests();
		loadHcvBloodTests();
		loadPegribaSpreadsheets();		
		loadAccessPatients();
		loadFmFirstExamPatients();
		loadFmHbvPatients();
		loadFmHcvPatients();
		return true;
	}
	
	public boolean loadHbvBloodTests()
	{
		ConverterService converterService=getConverterService();
		converterService.loadHbvBloodTests(params.hbvbloodtestsDir);
		return true;
	}
	
	public boolean loadHcvBloodTests()
	{
		ConverterService converterService=getConverterService();
		converterService.loadHcvBloodTests(params.hcvbloodtestsDir);
		return true;
	}
	
	public boolean loadPegribaSpreadsheets()
	{
		ConverterService converterService=getConverterService();
		converterService.loadPegribaSpreadsheets(params.ifnDir);
		return true;
	}
	
	public boolean loadAccessPatients()
	{
		ConverterService converterService=getConverterService();
		converterService.loadAccessPatients(params.accessFile);
		return true;
	}
	
	public boolean loadFmFirstExamPatients()
	{
		ConverterService converterService=getConverterService();
		converterService.loadFmFirstExamPatients(params.fmfirstexamFile);
		return true;
	}
	
	public boolean loadFmHbvPatients()
	{
		ConverterService converterService=getConverterService();
		converterService.loadFmHbvPatients(params.fmhbvFile);
		return true;
	}
	
	public boolean loadFmHcvPatients()
	{
		ConverterService converterService=getConverterService();
		converterService.loadFmHcvPatients(params.fmhcvFile);
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
		//if (!DatabaseHelper.databaseExists(params.converter))
		//	throw new CException("can't create application context because database not created yet: "+params.converter.getName());
		applicationContext = new GenericXmlApplicationContext("META-INF/spring/applicationContext.xml");
		//applicationContext.refresh();
	}
	
	private ConverterService getConverterService()
	{
		return (ConverterService)getApplicationContext().getBean("converterService");
	}
}
