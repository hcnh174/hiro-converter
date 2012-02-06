package edu.hiro.converter.pegriba;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.filemaker.PegribaPatient;
import edu.hiro.util.MessageWriter;

@Transactional
public class PegribaServiceImpl implements PegribaService
{	
	/*
	protected IPegribaDao dao;	
	
	public IPegribaDao getDao(){return this.dao;}
	@Required public void setDao(IPegribaDao dao){this.dao=dao;}
	*/
	
	//////////////////////////////////////////////////////////
	
	public void importPegribaSpreadsheets(String dir, MessageWriter writer)
	{
		System.out.println("importing data from directory "+dir);
		PegribaSpreadsheetReader reader=new PegribaSpreadsheetReader(writer);
		reader.loadFolder(dir);
		List<PegribaPatient> patients=reader.getPatients();
		//getDao().deletePegribaData();
		//getDao().saveOrUpdateAll(patients);
	}
	
	/*
	public CDataFrame getPegribaData(CPegribaParams params)
	{
		return getDao().getPegribaData(params);
	}
	
	////////////////////////////////////////////////////
	
	public List<CPegribaPatient> getPatients(IPaging paging)
	{
		List<CPegribaPatient> patients=getDao().getPatients(paging);
		return patients;
	}
	
	public CPegribaPatient getPatient(Integer pegribaDBno)
	{
		CPegribaPatient patient=getDao().getPatient(pegribaDBno);
		patient.initialize();
		return patient;
	}
	
	public void updatePatient(Integer pegribaDBno, Map<String,String> properties)
	{
		CPegribaPatient patient=getPatient(pegribaDBno);
		patient.updateProperties(properties);
		getDao().saveOrUpdate(patient);
	}
	*/
}
