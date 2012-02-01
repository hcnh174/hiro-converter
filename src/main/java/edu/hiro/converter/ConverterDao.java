package edu.hiro.converter;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.access.AbstractPatientItem;
import edu.hiro.converter.access.AccessPatient;
import edu.hiro.util.CIdList;
import edu.hiro.util.IAbstractDao;
import edu.hiro.util.IPaging;

@Transactional
public interface ConverterDao extends IAbstractDao
{
	List<AccessPatient> getAccessPatients();
	List<AccessPatient> getAccessPatients(IPaging paging);
	AccessPatient getAccessPatient(int id);
	Map<Integer,AccessPatient> getAccessPatientsById(CIdList ids);
	
	<T extends AbstractPatientItem> Map<Integer,T> getItemsById(CIdList ids, Class<T> cls);
	void addOrUpdateItems(Collection<? extends AbstractPatientItem> items);

	void deleteFmHcvData();
	void deleteFmHbvData();
	void deleteFmHccData();
	void deleteFmFirstExamData();
}
