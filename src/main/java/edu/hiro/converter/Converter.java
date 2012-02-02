package edu.hiro.converter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import edu.hiro.util.CException;
import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.ExceptionHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.SpringHelper;
import edu.hiro.util.StringHelper;

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
		ConverterService converterService=getConverterService();
		List<String> filenames=StringHelper.wrap(StringHelper.split(params.files,","),params.inDir,"");
		converterService.importFiles(filenames, new ImportParams(writer));
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
		SpringHelper.registerDataSource(applicationContext,"converterDataSource",params.converter);
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
