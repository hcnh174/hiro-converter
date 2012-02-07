package edu.hiro.converter.batch;

import edu.hiro.converter.domain.FmFirstExam;

public class FmFirstExamFieldSetMapper extends AbstractPatientFieldSetMapper<FmFirstExam>
{
	@Override
	protected FmFirstExam createEntity()
	{
		return new FmFirstExam();
	}
}
