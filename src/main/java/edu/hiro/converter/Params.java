package edu.hiro.converter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.SpringHelper;
import edu.hiro.util.StringHelper;

public class Params
{
	protected String tempDir;
	protected String inDir;
	protected String outDir;
	protected String files;
	//protected DbParams hdb=new DbParams();
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

	//public DbParams getHdb(){return this.hdb;}
	//public void setHdb(final DbParams hdb){this.hdb=hdb;}
	
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
		//hdb.validate();
		converter.validate();
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
		//DbParams.getPropertyMap("hdb.",map);
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
//		properties.setProperty("hdb.driver",hdb.getDriver());
//		properties.setProperty("hdb.name",hdb.getName());
//		properties.setProperty("hdb.template",hdb.getTemplate());
//		properties.setProperty("hdb.host",hdb.getHost());
//		properties.setProperty("hdb.port",hdb.getPort());
//		properties.setProperty("hdb.username",hdb.getUsername());
//		properties.setProperty("hdb.password",hdb.getPassword());
		
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