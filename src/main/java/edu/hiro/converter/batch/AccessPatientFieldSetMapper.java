package edu.hiro.converter.batch;

import edu.hiro.converter.filemaker.AccessPatient;

public class AccessPatientFieldSetMapper extends AbstractPatientFieldSetMapper<AccessPatient>
{
	@Override
	protected AccessPatient createEntity()
	{
		return new AccessPatient();
	}
}
