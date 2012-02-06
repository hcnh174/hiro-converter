package edu.hiro.converter.batch;

import java.lang.reflect.Field;
import java.util.Map;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;

import edu.hiro.util.CException;
import edu.hiro.util.FileHelper;
import edu.hiro.util.StringHelper;

public abstract class AbstractPatientFieldSetMapper<T> implements FieldSetMapper<T>
{
	private Map<String,Field> map=Maps.newHashMap();
	
	protected abstract T createEntity();
	
	public T mapFieldSet(FieldSet fieldSet) throws BindException {
		T patient = createEntity();
		
		String[] names=fieldSet.getNames();
		String[] values=fieldSet.getValues();
		for (int index=0; index<names.length; index++)
		{
			String name=names[index];
			String value=values[index];
			setProperty(patient,name,value);
		}
		return patient;
	}
	
	private Field getField(T patient, String name) throws SecurityException, NoSuchFieldException
	{
		if (map.containsKey(name))
			return map.get(name);
		Field field = patient.getClass().getDeclaredField(name);
		field.setAccessible(true);
		map.put(name,field);
		return field;
	}

	private void setProperty(T patient, String name, String value)
	{
		try
		{
			value=StringHelper.normalize(value);
			if (!StringHelper.hasContent(value))
				return;
			Field field = getField(patient,name);
			field.set(patient,value);
		}
		catch (Exception e)
		{
			StringHelper.println("Can't find property: "+name+": "+e,Charsets.UTF_16);
		}
	}
}
