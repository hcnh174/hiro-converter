package edu.hiro.converter;

import java.lang.reflect.Field;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;

import edu.hiro.util.StringHelper;

public class ImportHelper
{	
	public static String adjustFieldName(String field,  Map<String,String> conversions)
	{
		field=adjustFieldName(field);
		field=convertField(field,conversions);
		return field;
	}
	
	public static String adjustFieldName(String field)
	{
		field=StringHelper.normalize(field);
		field=StringHelper.replace(field," ","");
		field=field.toLowerCase();
		return field;
	}
	
	private static String convertField(String name, Map<String,String> conversions)
	{
		if (conversions.containsKey(name))
		{
			//StringHelper.println("found converted name for="+name,Charsets.UTF_16);
			return conversions.get(name);
		}
		return name;
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	private Map<String,Field> map=Maps.newHashMap();

	public void setProperty(Object obj, String name, String value)
	{
		try
		{
			if (!StringHelper.hasContent(name))
				return;
			value=StringHelper.normalize(value);
			if (!StringHelper.hasContent(value))
				return;
			Field field = getField(obj,name);
			field.set(obj,value);
		}
		catch (Exception e)
		{
			StringHelper.println("Can't find property: "+name+": "+e,Charsets.UTF_16);
		}
	}
	
	private Field getField(Object obj, String name) throws SecurityException, NoSuchFieldException
	{
		if (map.containsKey(name))
			return map.get(name);
		Field field = obj.getClass().getDeclaredField(name);
		field.setAccessible(true);
		map.put(name,field);
		return field;
	}
}