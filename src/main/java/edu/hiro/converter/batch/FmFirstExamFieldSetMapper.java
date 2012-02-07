package edu.hiro.converter.batch;

import edu.hiro.converter.filemaker.FmFirstExam;

public class FmFirstExamFieldSetMapper extends AbstractPatientFieldSetMapper<FmFirstExam>
{
	@Override
	protected FmFirstExam createEntity()
	{
		return new FmFirstExam();
	}
}
