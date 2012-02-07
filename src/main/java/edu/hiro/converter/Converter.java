package edu.hiro.converter;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.google.common.base.Charsets;

import edu.hiro.util.CException;
import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.ExceptionHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.StringHelper;

public class Converter
{	
	//chcp 65001
	public static void main(String[] argv)
	{		
		Args args=new Args(argv);
		Params params=args.loadParams();
		Converter converter=new Converter(params);
		//if (true) return;		
		try
		{
			converter.execute(args.actions);
		}
		catch(Exception e)
		{
			StringHelper.println(ExceptionHelper.getMessage(e),Charsets.UTF_16);
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
		case hbvbloodtests:
			return loadHbvBloodTests();
		case hcvbloodtests:
			return loadHcvBloodTests();
		case ifn:
			return loadIfnSpreadsheets();
		case access:
			return loadAccessPatients();
		case fmfirstexam:
			return loadFmFirstExamPatients();
		case fmhbv:
			return loadFmHbvPatients();
		case fmhcv:
			return loadFmHcvPatients();			
		case correct:
			return correct();
		case setupfile:
			return makeSetupFile();
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
		loadIfnSpreadsheets();		
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
	
	public boolean loadIfnSpreadsheets()
	{
		ConverterService converterService=getConverterService();
		converterService.loadIfnSpreadsheets(params.ifnDir);
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

	public boolean makeSetupFile()
	{
		DatabaseHelper.createSetupFile("src/main/sql",true);
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
	
	ConverterService getConverterService()
	{
		return (ConverterService)getApplicationContext().getBean("converterService");
	}
}
//
//public static void println(String str)
//{
//	//System.setOut(new PrintStream(System.out,true,"UTF-8"));
//	System.out.println(new String(str.getBytes(Charsets.UTF_8)));
//}
