package edu.hiro.converter;

import java.lang.reflect.Field;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;

import edu.hiro.util.FileHelper;
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
		//field=field.toLowerCase();
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
	
	public static boolean filenameMatches(String path, String filepattern)
	{
		String filename=FileHelper.stripPath(path);
		if (filename.startsWith("~"))
			return false;
		boolean matches=filename.matches(filepattern);
		if (!matches)
			System.out.println("filename "+filename+" does not match pattern "+filepattern+". skipping. ("+path+")");
		return matches;
	}	
	
	public static boolean sheetMatches(Sheet sheet, String sheetpattern)
	{
		String name=sheet.getSheetName();
		if (name.matches("Sheet[1-3]")) // probably an empty workbook
			return false;
		boolean matches=name.matches(sheetpattern);
		if (!matches)
			System.out.println("sheet "+name+" does not match pattern "+sheetpattern+". skipping.");
		return matches;
	}
	
	/////////////////////////////////////////////////////////////////////////////

	public enum Sex
	{
		男,
		女;
		
		public static Sex find(String str)
		{
			str=str.toUpperCase();
			if ("男".equals(str) || "M".equals(str) || "MALE".equals(str))
				return 男;
			else if ("女".equals(str) || "F".equals(str) || "FEMALE".equals(str))
				return 女; 
			else return null;
		}
	};	
}