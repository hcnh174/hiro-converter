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

import edu.hiro.util.CException;
import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.ExceptionHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.MessageWriter;
import edu.hiro.util.SpringHelper;
import edu.hiro.util.StringHelper;

public class Converter
{	
	public static final String CONVERTER_PROPERTIES_PATH="classpath:default.converter.properties";
	public static final String ACTION_DELIMITER=",";
	
	public static void main(String[] argv)
	{		
		Args args=new Args(argv);
		if (args.actions.size()==0 || args.actions.get(0)==Action.help)
		{
			System.out.println(Args.getHelp());
			return;
		}
		
		Params params=args.loadParams();
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
	private GenericApplicationContext applicationContext=null;
	
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
		case vacuum:
			return vacuum();
		case help:
			return doNothing();
		default:
			writer.message("no handler for action: "+action);
			return false;
		}
	}
	
	public boolean load()
	{
		/*
		if (!FileHelper.confirm("Convert data? (press y to confirm drop or any other key to skip)"))
		{
			System.out.println("Skipping convert");
			return true;
		}
		*/
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

	/*
	public boolean merge()
	{
		IMergeService mergeService=getMergeService();
		mergeService.mergePatients();
		return true;
	}
	
	public boolean export()
	{
		IMergeService mergeService=getMergeService();
		CExportParams exportparams=new ExportParams(params.outDir,writer);
		mergeService.exportData(exportparams);
		return true;
	}
	*/
	
	public boolean vacuum()
	{
		DatabaseHelper.vacuum(params.converter);
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
			
		applicationContext = new GenericApplicationContext();
		SpringHelper.registerDataSource(applicationContext,"dataSource",params.hdb);
		SpringHelper.registerDataSource(applicationContext,"converterDataSource",params.converter);
		//registerDataSource(applicationContext,"converterDataSource",params.db,"converter");
		SpringHelper.loadXmlBeanDefinitions(applicationContext,"classpath:spring-base.xml","spring-services.xml","spring-converter.xml");
		applicationContext.refresh();
	}
	
	/*
	public static void registerDataSource(GenericApplicationContext context, String name, DatabaseHelper.Params params, String dbname)
	{
		String url="jdbc:postgresql://"+params.getHost()+":"+params.getPort()+"/"+dbname;
		SpringHelper.registerDataSource(context,name,params.getDriver(),url,//params.getUrl(dbname),
			params.getUsername(),params.getPassword());
	}
	*/
	
	private ConverterService getConverterService()
	{
		return (ConverterService)getApplicationContext().getBean("converterService");
	}
//	
//	private IMergeService getMergeService()
//	{
//		return (IMergeService)getApplicationContext().getBean("mergeService");
//	}
//	
	public static class Params
	{
		protected String tempDir;
		protected String inDir;
		protected String outDir;
		protected String files;
		protected DbParams hdb=new DbParams();
		protected DbParams converter=new DbParams();
		//protected JbossParams jboss=new JbossParams();
		
		public static class DbParams extends DatabaseHelper.Params
		{
			public static void getPropertyMap(String prefix, Map<String,Object> map)
			{
				mapProperty(map,prefix,"driver","driver");
				mapProperty(map,prefix,"name","name");
				mapProperty(map,prefix,"driver","driver");
				mapProperty(map,prefix,"jndi","jndi");
				mapProperty(map,prefix,"template","template");
				mapProperty(map,prefix,"host","host");
				mapProperty(map,prefix,"port","port");
				mapProperty(map,prefix,"username","username");
				mapProperty(map,prefix,"password","password");
				mapProperty(map,prefix,"basedb","basedb");
			}
		}
	
		public static class JbossParams
		{
			protected String libDir;
			protected String deployDir;
			
			public String getLibDir(){return this.libDir;}
			public void setLibDir(final String libDir){this.libDir=libDir;}

			public String getDeployDir(){return this.deployDir;}
			public void setDeployDir(final String deployDir){this.deployDir=deployDir;}
			
			public void validate()
			{
				libDir=FileHelper.normalizeDirectory(SpringHelper.checkResolvedProperty("libDir",libDir));
				deployDir=FileHelper.normalizeDirectory(SpringHelper.checkResolvedProperty("deployDir",deployDir));
			}
			
			@Override
			public String toString()
			{
				return StringHelper.toString(this);
			}
		}
		
		public Params(){}

		public DbParams getHdb(){return this.hdb;}
		public void setHdb(final DbParams hdb){this.hdb=hdb;}
		
		public DbParams getConverter(){return this.converter;}
		public void setConverter(final DbParams converter){this.converter=converter;}
		
		//public JbossParams getJboss(){return this.jboss;}
		//public void setJboss(final JbossParams jboss){this.jboss=jboss;}
		
		public String getTempDir(){return this.tempDir;}
		public void setTempDir(final String tempDir){this.tempDir=tempDir;}

		public String getInDir(){return this.inDir;}
		public void setInDir(final String inDir){this.inDir=inDir;}
		
		public String getOutDir(){return this.outDir;}
		public void setOutDir(final String outDir){this.outDir=outDir;}
		
		public String getFiles(){return this.files;}
		public void setFiles(final String files){this.files=files;}
		
		public void validate()
		{
			hdb.validate();
			converter.validate();
			//jboss.validate();
			tempDir=FileHelper.normalizeDirectory(SpringHelper.checkResolvedProperty("tempDir",tempDir));
			inDir=FileHelper.normalizeDirectory(SpringHelper.checkResolvedProperty("inDir",inDir));
			outDir=FileHelper.normalizeDirectory(SpringHelper.checkResolvedProperty("outDir",outDir));
		}
		
		public static Map<String,Object> getPropertyMap()
		{
			Map<String,Object> map=new LinkedHashMap<String,Object>();
			mapProperty(map,"tempDir","tempDir");
			mapProperty(map,"inDir","inDir");
			mapProperty(map,"outDir","outDir");
			mapProperty(map,"files","files");
			//mapProperty(map,"jboss.","libDir","lib.dir");
			//mapProperty(map,"jboss.","deployDir","deploy.dir");
			DbParams.getPropertyMap("hdb.",map);
			DbParams.getPropertyMap("converter.",map);
			/*
			mapProperty(map,"db.","driver","driver");
			mapProperty(map,"db.","name","name");
			mapProperty(map,"db.","driver","driver");
			mapProperty(map,"db.","jndi","jndi");
			mapProperty(map,"db.","template","template");
			mapProperty(map,"db.","host","host");
			mapProperty(map,"db.","port","port");
			mapProperty(map,"db.","username","username");
			mapProperty(map,"db.","password","password");
			mapProperty(map,"db.","basedb","basedb");
			*/
			return map;
		}
		
		private static void mapProperty(Map<String,Object> map, String name, String value)
		{
			mapProperty(map,"",name,value);
		}
		
		private static void mapProperty(Map<String,Object> map, String prefix, String name, String value)
		{
			map.put(prefix+name,"${"+prefix+value+"}");
		}
		
		public Properties getProperties()
		{
			System.out.println("Get properties method called");
			Properties properties=new Properties();
			properties.setProperty("hdb.driver",hdb.getDriver());
			properties.setProperty("hdb.name",hdb.getName());
			properties.setProperty("hdb.template",hdb.getTemplate());
			properties.setProperty("hdb.host",hdb.getHost());
			properties.setProperty("hdb.port",hdb.getPort());
			properties.setProperty("hdb.username",hdb.getUsername());
			properties.setProperty("hdb.password",hdb.getPassword());
			
			properties.setProperty("converter.driver",converter.getDriver());
			properties.setProperty("converter.name",converter.getName());
			properties.setProperty("converter.template",converter.getTemplate());
			properties.setProperty("converter.host",converter.getHost());
			properties.setProperty("converter.port",converter.getPort());
			properties.setProperty("converter.username",converter.getUsername());
			properties.setProperty("converter.password",converter.getPassword());
			return properties;
		}
			
		@Override
		public String toString()
		{
			return StringHelper.toString(this);
		}
	}
	
	public static class Args
	{
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
			buffer.append("usage: ant setup -Dfilename=setup.properties -Daction=all\n");
			buffer.append("available actions:\n");
			for (Action action : Action.values())
			{
				buffer.append(action.name()+": "+action.getDescription()+"\n");
			}
			return buffer.toString();
		}
		
		public Params loadParams()
		{
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
	
	public enum Action
	{
		load("Import data"),
		correct("Apply corrections"),
		merge("Merge data"),
		vacuum("run vacuum analyze on the database to refresh query statistics"),
		help("show usage and action types");
		
		private String description;
		
		Action(String description)
		{
			this.description=description;
		}
		
		public String getDescription(){return description;}
		
		public static Action find(String value)
		{
			try
			{
				return Action.valueOf(value.trim());
			}
			catch(IllegalArgumentException e)
			{
				throw new CException("cannot find action type: "+value);
			}
		}
	}
}
