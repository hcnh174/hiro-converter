package edu.hiro.converter.batch;

import java.lang.reflect.Field;

import edu.hiro.converter.filemaker.FmFirstExam;
import edu.hiro.converter.filemaker.FmHcvPatient;

public class FmHcvPatientFieldSetMapper extends AbstractPatientFieldSetMapper<FmHcvPatient>
{
	@Override
	protected FmHcvPatient createEntity()
	{
		return new FmHcvPatient();
	}
//	
//	@Override
//	protected Field getFieldAccessor(String name) throws SecurityException, NoSuchFieldException
//	{
//		return FmFirstExam.class.getDeclaredField(name);
//	}
}
