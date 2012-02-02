package edu.hiro.converter;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.access.AbstractPatientItem;
import edu.hiro.converter.access.AccessPatient;
import edu.hiro.util.AbstractDaoImpl;
import edu.hiro.util.CIdList;
import edu.hiro.util.IPaging;
import edu.hiro.util.StringHelper;

@Service("converterDao")
@Transactional
public class ConverterDaoImpl extends AbstractDaoImpl implements ConverterDao
{	
	////////////////////////////////////////////////////////
	
	@SuppressWarnings("unchecked")
	public List<AccessPatient> getAccessPatients()
	{
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from AccessPatient as patient\n");
		return find(buffer);
	}
	
	@SuppressWarnings("unchecked")
	public List<AccessPatient> getAccessPatients(IPaging paging)
	{
		String sql="from AccessPatient as patient\n";
		Query query = getSession().createQuery("select count(*) "+sql);
		long total=(Long)(query.iterate().next());
		paging.setTotal((int)total);
								
		query=getSession().createQuery("select patient "+sql);//paging;// +paging.getSorting().getHql("patient."));//break!
		query.setFirstResult(paging.getStart());
		query.setMaxResults(paging.getPagesize());
		return query.list();
	}
	
	public AccessPatient getAccessPatient(int id)
	{
		return (AccessPatient)get(AccessPatient.class,id);
	}

	/*
	public void addOrUpdateAccessPatient(AccessPatient patient)
	{
		saveOrUpdate(patient);
	}
	
	public void deleteAccessPatient(int id)
	{
		delete(getPatient(id));
	}
	*/
	
	@SuppressWarnings("unchecked")
	public Map<Integer,AccessPatient> getAccessPatientsById(CIdList ids)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<Integer,AccessPatient>();
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from AccessPatient as patient\n");
		buffer.append("where "+ids.toSql("patient.個人ID")+"\n");
		List<AccessPatient> patients=find(buffer);
		Map<Integer,AccessPatient> map=new HashMap<Integer,AccessPatient>();
		for (AccessPatient patient : patients)
		{
			//patient.initialize();
			map.put(patient.get個人ID(),patient);
		}
		return map;
	}
	
	/*
	public void addOrUpdatePatients(Collection<AccessPatient> patients)
	{
		saveOrUpdateAll(patients);
	}
	*/
	
	@SuppressWarnings("unchecked")
	public <T extends AbstractPatientItem> Map<Integer,T> getItemsById(CIdList ids, Class<T> cls)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<Integer,T>();
		StringBuilder buffer=new StringBuilder();
		buffer.append("select item\n");
		buffer.append("from "+cls.getName()+" as item\n");
		buffer.append("where "+ids.toSql("item.id")+"\n");
		StringHelper.println("sql="+buffer.toString());
		List<T> items=find(buffer);
		Map<Integer,T> map=new HashMap<Integer,T>();
		for (T item : items)
		{
			map.put(item.getId(),item);
		}
		return map;
	}
	
	public void addOrUpdateItems(Collection<? extends AbstractPatientItem> items)
	{
		saveOrUpdateAll(items);
	}
	
	////////////////////////////////
	
	public void deleteFmHcvData()
	{		
		Query query=getSession().createSQLQuery("DELETE FROM fmhcv;");
		query.executeUpdate();
	}
	
	public void deleteFmHbvData()
	{		
		Query query=getSession().createSQLQuery("DELETE FROM fmhbv;");
		query.executeUpdate();
	}
	
	public void deleteFmHccData()
	{		
		Query query=getSession().createSQLQuery("DELETE FROM fmhcc;");
		query.executeUpdate();
	}
	
	public void deleteFmFirstExamData()
	{
		Query query=getSession().createSQLQuery("DELETE FROM fmfirstexam;");
		query.executeUpdate();
	}
	
	/*
	@SuppressWarnings("unchecked")
	public Map<String,CFmHbvPatient> getFmHbvPatientsBy患者ID(List<String> ids)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<String,CFmHbvPatient>();
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from CFmHbvPatient as patient\n");
		buffer.append("where "+CIdentifierListHelper.toSql("patient.患者ID",ids)+"\n");
		List<CFmHbvPatient> patients=find(buffer);
		Map<String,CFmHbvPatient> map=new HashMap<String,CFmHbvPatient>();
		for (CFmHbvPatient patient : patients)
		{
			map.put(patient.get患者ID(),patient);
		}
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,CFmHcvPatient> getFmHcvPatientsBy患者ID(List<String> ids)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<String,CFmHcvPatient>();
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from CFmHcvPatient as patient\n");
		buffer.append("where "+CIdentifierListHelper.toSql("patient.患者ID",ids)+"\n");
		List<CFmHcvPatient> patients=find(buffer);
		Map<String,CFmHcvPatient> map=new HashMap<String,CFmHcvPatient>();
		for (CFmHcvPatient patient : patients)
		{
			map.put(patient.get患者ID(),patient);
		}
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,CFmFirstExam> getFmFirstExamPatientsBy患者ID(List<String> ids)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<String,CFmFirstExam>();
		StringHelper.println("getFmFirstExamPatientsById: ids.size="+ids.size());
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from CFmFirstExam as patient\n");
		buffer.append("where "+CIdentifierListHelper.toSql("patient.患者ID",ids)+"\n");
		List<CFmFirstExam> patients=find(buffer);
		Map<String,CFmFirstExam> map=new HashMap<String,CFmFirstExam>();
		for (CFmFirstExam patient : patients)
		{
			map.put(patient.get患者ID(),patient);
		}
		StringHelper.println("getFmFirstExamPatientsById: map.size="+map.values().size());
		return map;
	}	
	
	@SuppressWarnings("unchecked")
	public Map<Integer,CFmHccPatient> getFmHccPatientsByRowId(CIdList ids)
	{		
		if (ids.isEmpty())
			return new LinkedHashMap<Integer,CFmHccPatient>();
		StringBuilder buffer=new StringBuilder();
		buffer.append("select patient\n");
		buffer.append("from CFmHccPatient as patient\n");
		buffer.append("where "+ids.toSql("patient.rowID")+"\n");
		List<CFmHccPatient> patients=find(buffer);
		Map<Integer,CFmHccPatient> map=new HashMap<Integer,CFmHccPatient>();
		for (CFmHccPatient patient : patients)
		{
			map.put(patient.getRowID(),patient);
		}
		return map;
	}
	*/
}