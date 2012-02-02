package edu.hiro.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.springframework.context.support.GenericApplicationContext;

import edu.hiro.util.CException;
import edu.hiro.util.FileHelper;
import edu.hiro.util.SpringHelper;
import edu.hiro.util.StringHelper;

public class Args
{
	public static final String ACTION_DELIMITER=",";
	public static final String CONVERTER_PROPERTIES_PATH="classpath:default.converter.properties";
	
	protected String filename;
	protected List<Action> actions=new ArrayList<Action>();
	
	private static final String FILENAME="filename";
	private static final String ACTION="action";
	
	public Args(String[] args)
	{			
		Options options = new Options();
		options.addOption(FILENAME,true,"properties files");
		options.addOption(ACTION,true,"operation to perform");
		
		CommandLine line=parseCommandLine(args,options);
		if (line.hasOption(FILENAME))
		{
			this.filename=FileHelper.normalize(line.getOptionValue(FILENAME));
			if (!FileHelper.exists(this.filename))
				throw new CException("can't find setup file: "+this.filename);
		}
        if (line.hasOption(ACTION))
        	this.actions=parseActions(line.getOptionValue(ACTION));
	}
	
	private CommandLine parseCommandLine(String[] args, Options options)
	{
		CommandLineParser parser = new BasicParser();//GnuParser();
	    try
	    {
	        CommandLine line = parser.parse(options, args);
	        return line;
	    }
	    catch(ParseException e)
	    {
	       throw new CException(e);
	    }
	}
	
	private List<Action> parseActions(String values)
	{
		List<Action> actions=new ArrayList<Action>();
		for (String value : StringHelper.split(values,ACTION_DELIMITER))
		{
			actions.add(Action.find(value));
		}
		return actions;
	}
	
	public static String getHelp()
	{
		StringBuilder buffer=new StringBuilder();
		buffer.append("usage: mvn test -Pconvert -e");// -Dfilename=setup.properties -Daction=all\n");
		buffer.append("available actions:\n");
		for (Action action : Action.values())
		{
			buffer.append(action.name()+": "+action.getDescription()+"\n");
		}
		return buffer.toString();
	}
	
	public Params loadParams()
	{
		if (filename==null)
			throw new CException("converter properties filename has not been set");
		
		GenericApplicationContext context = new GenericApplicationContext();
		SpringHelper.registerPropertyPlaceholderConfigurer(context,
				CONVERTER_PROPERTIES_PATH,FileHelper.getFilenameAsUrl(filename));
		
		Map<String,Object> map=Params.getPropertyMap();
		SpringHelper.registerBean(context,"params",Params.class,map);
		context.refresh();
		
		Params params=(Params)context.getBean("params");
		params.validate();
		System.out.println("setup params="+params.toString());
		return params;
	}
}
