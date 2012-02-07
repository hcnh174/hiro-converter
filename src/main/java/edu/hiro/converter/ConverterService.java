package edu.hiro.converter;

import org.springframework.transaction.annotation.Transactional;

//@Transactional
public interface ConverterService
{
	void loadAccessPatients(String filename);
	void loadFmFirstExamPatients(String filename);
	void loadFmHbvPatients(String filename);
	void loadFmHcvPatients(String filename);	
	void loadHcvBloodTests(String folder);
	void loadHbvBloodTests(String folder);
	void loadIfnSpreadsheets(String folder);
	
	//void test();
}
