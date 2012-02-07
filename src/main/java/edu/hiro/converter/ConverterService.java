package edu.hiro.converter;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ConverterService
{
	void loadAccessPatients(String dir);
	void loadFmFirstExamPatients(String dir);
	void loadFmHbvPatients(String dir);
	void loadFmHcvPatients(String dir);	
	void loadHcvBloodTests(String folder);
	void loadHbvBloodTests(String folder);
	void loadPegribaSpreadsheets(String folder);
}
