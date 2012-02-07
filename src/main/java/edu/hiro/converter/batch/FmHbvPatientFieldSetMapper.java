package edu.hiro.converter.batch;

import java.lang.reflect.Field;

import edu.hiro.converter.filemaker.FmFirstExam;
import edu.hiro.converter.filemaker.FmHbvPatient;

public class FmHbvPatientFieldSetMapper extends AbstractPatientFieldSetMapper<FmHbvPatient>
{
	@Override
	protected FmHbvPatient createEntity()
	{
		return new FmHbvPatient();
	}
}
