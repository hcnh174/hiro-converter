package edu.hiro.converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.hiro.converter.access.AbstractPatientItem;
import edu.hiro.converter.access.AccessPatient;
import edu.hiro.converter.filemaker.FmFirstExam;
import edu.hiro.converter.filemaker.FmHbvPatient;
import edu.hiro.converter.filemaker.FmHcvPatient;
import edu.hiro.converter.readers.AccessPatientTableReader;
import edu.hiro.converter.readers.FmFirstExamTableReader;
import edu.hiro.converter.readers.FmHbvTableReader;
import edu.hiro.converter.readers.FmHccTableReader;
import edu.hiro.converter.readers.FmHcvTableReader;
import edu.hiro.converter.readers.ItemTableReader;
import edu.hiro.converter.readers.TableReader;
import edu.hiro.util.BeanHelper;
import edu.hiro.util.CException;
import edu.hiro.util.CIdList;
import edu.hiro.util.CTable;
import edu.hiro.util.FileHelper;
import edu.hiro.util.IPaging;
import edu.hiro.util.StringHelper;

@Service("converterService")
@Transactional
public class ConverterServiceImpl implements ConverterService
{	
	public static final String TABLE_SUFFIX=".txt";
	public static final String MERGE_SUFFIX=".mer";
	
	@Resource(name="converterDao")
	protected ConverterDao dao;	
	
	public ConverterDao getDao(){return this.dao;}

	//////////////////////////////////////////////////////////////////
	
	public List<AccessPatient> getAccessPatients()
	{
		return getDao().getAccessPatients();
	}
	
	public List<AccessPatient> getAccessPatients(IPaging paging)
	{
		return getDao().getAccessPatients(paging);
	}
	
	public AccessPatient getAccessPatient(int id)
	{
		AccessPatient patient=getDao().getAccessPatient(id);
		if (patient==null)
			throw new CException("patient could not be found: "+id);
		patient.initialize();
		return patient;
	}
	
	//////////////////////////////////////////////////////////////
	
	public void importFolder(String dir, ImportParams params)
	{
		importFiles(FileHelper.listFiles(dir,TABLE_SUFFIX),params);
	}
	
	public void importFiles(List<String> filenames, ImportParams params)
	{
		for (String filename : filenames)
		{
			importFile(filename,params);		
		}
	}

	public void importFile(String filename, ImportParams params)
	{
		params.getWriter().write("loading table: "+filename+"...");
		String suffix=FileHelper.getSuffix(filename);
		if (suffix.equals(MERGE_SUFFIX))
		{
			filename=convertFile(filename);
			suffix=FileHelper.getSuffix(filename);
		}
		String identifier=FileHelper.getIdentifierFromFilename(filename,suffix);
		CTable table=CTable.parseCvsFile(filename);
		params.setType(ImportParams.TableType.valueOf(identifier));
		loadTable(table,params);
		params.getWriter().message("finished "+filename);
	}
	
	private String convertFile(String oldfilename)
	{
		FileHelper.Encoding oldencoding=FileHelper.Encoding.SHIFT_JIS;
		FileHelper.Encoding newencoding=FileHelper.Encoding.UTF8;
		String newfilename=FileHelper.changeSuffix(oldfilename,MERGE_SUFFIX,TABLE_SUFFIX);
		System.out.println("converting file "+oldfilename+" to "+newfilename);
		FileHelper.convertEncoding(oldfilename, oldencoding, newfilename, newencoding);
		if (newfilename.indexOf("fmhcc.txt")!=-1)
			fixHccHeader(newfilename);
		return newfilename;
	}
	
	private void fixHccHeader(String filename)
	{
		System.out.println("fixing extra comma in fmhcc");
		String str=FileHelper.readFile(filename);
		str=StringHelper.replace(str,"外来医,follow先","外来医follow先");
		FileHelper.writeFile(filename,str);
	}
	
	public void loadTable(CTable table, ImportParams params)
	{
		ImportParams.TableType type=params.getType();
		if (type.getEntityType()==ImportParams.EntityType.ACCESS_PATIENT)
			loadPatientTable(table,params);
		else if (type.getEntityType()==ImportParams.EntityType.ACCESS_ITEM)
			loadItemTable(table,params);
		else if (type.getEntityType()==ImportParams.EntityType.FILEMAKER_HBV)
			loadFmHbvTable(table,params);
		else if (type.getEntityType()==ImportParams.EntityType.FILEMAKER_HCV)
			loadFmHcvTable(table,params);
		else if (type.getEntityType()==ImportParams.EntityType.FILEMAKER_HCC)
			loadFmHccTable(table,params);
		else if (type.getEntityType()==ImportParams.EntityType.FILEMAKER_FIRSTEXAM)
			loadFmFirstExamTable(table,params);
		else throw new CException("no loader for table type: "+params.getType());
	}
	
	//////////////////////////////////////////////////////////////////////
	
	private void loadPatientTable(CTable table, ImportParams params)
	{
		TableReader reader=new AccessPatientTableReader(this,params);
		reader.loadInBatches(table);
	}
	
	private void loadItemTable(CTable table, ImportParams params)
	{
		TableReader reader=new ItemTableReader(this,params);
		reader.loadInBatches(table);
	}
	
	private void loadFmHbvTable(CTable table, ImportParams params)
	{
		TableReader reader=new FmHbvTableReader(this,params);
		reader.loadInBatches(table);
	}
	
	private void loadFmHcvTable(CTable table, ImportParams params)
	{
		TableReader reader=new FmHcvTableReader(this,params);
		reader.loadInBatches(table);
	}
	
	private void loadFmHccTable(CTable table, ImportParams params)
	{
		//FileHelper.writeFile("c:/temp/lengthreport.txt",table.getFieldLengthReport().toString());
		//FileHelper.writeFile("c:/temp/cleaned.txt",table.toString());
		TableReader reader=new FmHccTableReader(this,params);
		reader.loadInBatches(table);
	}
	
	private void loadFmFirstExamTable(CTable table, ImportParams params)
	{
		TableReader reader=new FmFirstExamTableReader(this,params);
		reader.loadInBatches(table);
	}

	////////////////////////////////////////////////////////////////////////////////
	
	protected AccessPatient findOrCreateAccessPatient(int id)
	{
		AccessPatient patient=getDao().getAccessPatient(id);
		if (patient==null)
		{
			patient=new AccessPatient(id);
			getDao().saveOrUpdate(patient);
		}
		return patient;
	}
	
	public Map<Integer,AccessPatient> findOrCreateAccessPatients(CIdList ids)
	{
		Map<Integer,AccessPatient> map=getDao().getAccessPatientsById(ids);
		List<AccessPatient> newpatients=new ArrayList<AccessPatient>();
		for (Integer id : ids.getIds())
		{
			if (map.containsKey(id))
			{
				AccessPatient patient=map.get(id);
				patient.initialize();
				continue;
			}
			AccessPatient patient=new AccessPatient(id);
			map.put(patient.get個人ID(),patient);
			newpatients.add(patient);
		}
		getDao().saveOrUpdateAll(newpatients);
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends AbstractPatientItem> Map<Integer,T> findOrCreateItems(CIdList ids, Class<T> cls)
	{
		Map<Integer,T> map=getDao().getItemsById(ids,cls);
		List<T> newitems=new ArrayList<T>();
		for (Integer id : ids.getIds())
		{
			if (map.containsKey(id))
				continue;
			T item=(T)BeanHelper.newInstance(cls);
			item.setId(id);
			map.put(item.getId(),item);
			newitems.add(item);
		}
		getDao().addOrUpdateItems(newitems);
		return map;
	}

	////////////////////////////////////////////////////////////////////
	
	public void addOrUpdateFmHbvPatients(Collection<FmHbvPatient> patients)
	{
		System.out.println("trying to add or update FmHbv patients: "+patients.size());
		getDao().saveOrUpdateAll(patients);
	}
	
	public void addOrUpdateFmHcvPatients(Collection<FmHcvPatient> patients)
	{
		System.out.println("trying to add or update FmHcv patients: "+patients.size());
		getDao().saveOrUpdateAll(patients);
	}
	
	public void addOrUpdateFmFirstExamPatients(Collection<FmFirstExam> patients)
	{
		System.out.println("trying to add or update FmFirstExam patients: "+patients.size());
		getDao().saveOrUpdateAll(patients);
	}
	
	//////////////////////////////////////////////////////////
	
}
