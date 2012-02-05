package edu.hiro.converter.batch;

import java.lang.reflect.Field;
import java.util.Map;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.google.common.collect.Maps;

import edu.hiro.util.CException;
import edu.hiro.util.StringHelper;

public abstract class AbstractPatientFieldSetMapper<T> implements FieldSetMapper<T>
{
	private Map<String,Field> map=Maps.newHashMap();
	private Map<String,String> conversions=Maps.newHashMap();
	
	protected abstract T createEntity();
	
	public T mapFieldSet(FieldSet fieldSet) throws BindException {
		T patient = createEntity();
		
		String[] names=fieldSet.getNames();
		String[] values=fieldSet.getValues();
		for (int index=0; index<names.length; index++)
		{
			String name=names[index];
			String value=values[index];
			//FileHelper.appendFile("d:/temp/setproperty.txt",""+name+"="+value);
			setProperty(patient,name,value);
		}
		return patient;
	}
	
	//protected abstract Field getFieldAccessor(String name) throws SecurityException, NoSuchFieldException;
	
	private Field getField(T patient, String name) throws SecurityException, NoSuchFieldException
	{
		if (map.containsKey(name))
			return map.get(name);
		//Field field = FmHcvPatient.class.getDeclaredField(name);
		Field field = patient.getClass().getDeclaredField(name);
		field.setAccessible(true);
		map.put(name,field);
		return field;
	}

	private void setProperty(T patient, String name, String value)
	{
		try
		{
			if (!StringHelper.hasContent(value))
				return;
			name=convertProperty(name);
			Field field = getField(patient,name);
			field.set(patient,value);
			//Object newvalue=field.get(patient);
			//FileHelper.appendFile("d:/temp/setproperty.txt",name+"="+value+", newvalue="+newvalue);
		}
		catch (Exception e)
		{
			System.err.println("Can't find property: "+name+": "+e);
			//FileHelper.appendFile("d:/temp/setproperty.txt","Can't find property: "+name+": "+e);
		}
	}
	
	final protected void addConversion(String from, String to)
	{
		if (this.conversions.containsKey(from))
			throw new CException("attempting to overwrite an existing conversion: from="+from+", to="+to+", current="+this.conversions.get(from));
		this.conversions.put(from,to);
	}

	final protected String convertProperty(String name)
	{
		if (this.conversions.containsKey(name))
		{
			System.out.println("found converted name for="+name);
			return this.conversions.get(name);
		}
		return name;
	}
}
