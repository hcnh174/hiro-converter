package edu.hiro.converter.batch;

import edu.hiro.converter.domain.FmHcvPatient;

public class FmHcvPatientFieldSetMapper extends AbstractPatientFieldSetMapper<FmHcvPatient>
{
	@Override
	protected FmHcvPatient createEntity()
	{
		return new FmHcvPatient();
	}
}
