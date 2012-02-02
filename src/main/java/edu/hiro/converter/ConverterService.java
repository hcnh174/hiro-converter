package edu.hiro.converter;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.access.AccessPatient;
import edu.hiro.converter.filemaker.FmFirstExam;
import edu.hiro.converter.filemaker.FmHbvPatient;
import edu.hiro.converter.filemaker.FmHcvPatient;
import edu.hiro.util.CTable;
import edu.hiro.util.IPaging;

@Transactional
public interface ConverterService
{
	void importFolder(String dir, ImportParams params);
	void importFiles(List<String> filenames, ImportParams params);
	void importFile(String filename, ImportParams params);	
	
	List<AccessPatient> getAccessPatients();
	List<AccessPatient> getAccessPatients(IPaging paging);
	AccessPatient getAccessPatient(int id);
			
	void loadTable(CTable table, ImportParams params);
	
	void addOrUpdateFmHbvPatients(Collection<FmHbvPatient> patients);
	void addOrUpdateFmHcvPatients(Collection<FmHcvPatient> patients);
	void addOrUpdateFmFirstExamPatients(Collection<FmFirstExam> patients);
	
	ConverterDao getDao();
	
	void test();
}
