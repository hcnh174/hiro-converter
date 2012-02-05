package edu.hiro.converter.batch;

import java.lang.reflect.Field;
import java.util.Map;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.validation.BindException;

import com.google.common.collect.Maps;

import edu.hiro.converter.filemaker.FmHcvPatient;

public class FmHcvPatientFieldSetMapper implements FieldSetMapper<FmHcvPatient>
{
	protected Map<String,Field> map=Maps.newHashMap();
	
	public FmHcvPatient mapFieldSet(FieldSet fieldSet) throws BindException {
		FmHcvPatient patient = new FmHcvPatient();
		
		//ConfigurablePropertyAccessor accessor=PropertyAccessorFactory.forDirectFieldAccess(patient);
		String[] names=fieldSet.getNames();
		String[] values=fieldSet.getValues();
		for (int index=0; index<names.length; index++)
		{
			String name=names[index];
			String value=values[index];
			//patient.setAttribute(name, value);
			//setProperty(accessor,patient,name,value);

			setProperty(patient,name,value);
//			try {
//				Field field = FmHcvPatient.class.getDeclaredField(name);
//				field.setAccessible(true);
//				field.set(patient,value);
//			} catch (SecurityException e) {
//				System.err.println("Can't find property: "+name+": "+e);
//			} catch (NoSuchFieldException e) {
//				System.err.println("Can't find property: "+name+": "+e);
//			} catch (IllegalArgumentException e) {
//				System.err.println("Can't find property: "+name+": "+e);
//			} catch (IllegalAccessException e) {
//				System.err.println("Can't find property: "+name+": "+e);
//			}
		}
		return patient;
	}
	
	private Field getField(String name) throws SecurityException, NoSuchFieldException
	{
		if (map.containsKey(name))
			return map.get(name);
		//try {
			Field field = FmHcvPatient.class.getDeclaredField(name);
			field.setAccessible(true);
			map.put(name,field);
			return field;
//		} catch (SecurityException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		} catch (NoSuchFieldException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		} catch (IllegalArgumentException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		}
	}
	
	private void setProperty(FmHcvPatient patient, String name, String value)
	{
		try {
			Field field = getField(name);
			//field.setAccessible(true);
			field.set(patient,value);
		} catch (SecurityException e) {
			System.err.println("Can't find property: "+name+": "+e);
		} catch (NoSuchFieldException e) {
			System.err.println("Can't find property: "+name+": "+e);
		} catch (IllegalArgumentException e) {
			System.err.println("Can't find property: "+name+": "+e);
		} catch (IllegalAccessException e) {
			System.err.println("Can't find property: "+name+": "+e);
		}
	}
//	
//	private void setProperty(FmHcvPatient patient, String name, String value)
//	{
//		try {
//			Field field = FmHcvPatient.class.getDeclaredField(name);
//			field.setAccessible(true);
//			field.set(patient,value);
//		} catch (SecurityException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		} catch (NoSuchFieldException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		} catch (IllegalArgumentException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		} catch (IllegalAccessException e) {
//			System.err.println("Can't find property: "+name+": "+e);
//		}
//	}
//	
	
	/*
	private void setProperty(ConfigurablePropertyAccessor accessor, FmHcvPatient patient,
			String name, String value)
	{
		System.out.println(name+"="+value);
		try
		{
			accessor.setPropertyValue(name,value);
		}
		catch (Exception e)
		{
			System.err.println("Can't find property: "+name+": "+e);
		}
	}
	*/
}
