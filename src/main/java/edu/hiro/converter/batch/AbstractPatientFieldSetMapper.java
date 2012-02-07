package edu.hiro.converter.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import edu.hiro.util.BeanHelper;

public abstract class AbstractPatientFieldSetMapper<T> implements FieldSetMapper<T>
{
	private BeanHelper beanhelper=new BeanHelper();
	
	protected abstract T createEntity();
	
	public T mapFieldSet(FieldSet fieldSet) throws BindException {
		T patient = createEntity();
		
		String[] names=fieldSet.getNames();
		String[] values=fieldSet.getValues();
		for (int index=0; index<names.length; index++)
		{
			String name=names[index];
			String value=values[index];
			beanhelper.setField(patient,name,value);
		}
		return patient;
	}
}
