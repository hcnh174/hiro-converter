package edu.hiro.converter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import com.google.common.collect.Maps;

import edu.hiro.util.DatabaseHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.SpringHelper;
import edu.hiro.util.StringHelper;

public class Params
{
	protected String baseDir;
	protected String hbvbloodtestsDir;
	protected String hcvbloodtestsDir;
	protected String ifnDir;
	protected String accessFile;
	protected String fmfirstexamFile;
	protected String fmhcvFile;
	protected String fmhbvFile;

	public Params(){}
	
	public String getBaseDir(){return this.baseDir;}
	public void setBaseDir(final String baseDir){this.baseDir=baseDir;}
	
	public String getHbvbloodtestsDir(){return this.hbvbloodtestsDir;}
	public void setHbvbloodtestsDir(final String hbvbloodtestsDir){this.hbvbloodtestsDir=hbvbloodtestsDir;}
	
	public String getHcvbloodtestsDir(){return this.hcvbloodtestsDir;}
	public void setHcvbloodtestsDir(final String hcvbloodtestsDir){this.hcvbloodtestsDir=hcvbloodtestsDir;}
	
	public String getIfnDir(){return this.ifnDir;}
	public void setIfnDir(final String ifnDir){this.ifnDir=ifnDir;}
	
	public String getAccessFile(){return this.accessFile;}
	public void setAccessFile(final String accessFile){this.accessFile=accessFile;}
	
	public String getFmfirstexamFile(){return this.fmfirstexamFile;}
	public void setFmfirstexamFile(final String fmfirstexamFile){this.fmfirstexamFile=fmfirstexamFile;}
	
	public String getFmhcvFile(){return this.fmhcvFile;}
	public void setFmhcvFile(final String fmhcvFile){this.fmhcvFile=fmhcvFile;}
	
	public String getFmhbvFile(){return this.fmhbvFile;}
	public void setFmhbvFile(final String fmhbvFile){this.fmhbvFile=fmhbvFile;}
	
	public void validate()
	{
		SpringHelper.checkResolvedProperty("baseDir",baseDir);
		SpringHelper.checkResolvedProperty("hbvbloodtestsDir",hbvbloodtestsDir);
		SpringHelper.checkResolvedProperty("ifnDir",ifnDir);		
		SpringHelper.checkResolvedProperty("accessFile",accessFile);
		SpringHelper.checkResolvedProperty("fmfirstexamFile",fmfirstexamFile);
		SpringHelper.checkResolvedProperty("fmhcvFile",fmhcvFile);
		SpringHelper.checkResolvedProperty("fmhbvFile",fmhbvFile);
	}
	
	public static Map<String,Object> getPropertyMap()
	{
		Map<String,Object> map=Maps.newLinkedHashMap();
		mapProperty(map,"baseDir");
		mapProperty(map,"hbvbloodtestsDir");
		mapProperty(map,"ifnDir");		
		mapProperty(map,"accessFile");
		mapProperty(map,"fmfirstexamFile");
		mapProperty(map,"fmhcvFile");
		mapProperty(map,"fmhbvFile");
		return map;
	}
	
	private static void mapProperty(Map<String,Object> map, String name)
	{
		mapProperty(map,name,name);
	}
	
	private static void mapProperty(Map<String,Object> map, String name, String value)
	{
		mapProperty(map,"",name,value);
	}
	
	private static void mapProperty(Map<String,Object> map, String prefix, String name, String value)
	{
		map.put(prefix+name,"${"+prefix+value+"}");
	}

	@Override
	public String toString()
	{
		return StringHelper.toString(this);
	}
}