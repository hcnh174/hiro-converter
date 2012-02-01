package edu.hiro.converter.readers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.hiro.converter.ConverterServiceImpl;
import edu.hiro.converter.ImportParams;
import edu.hiro.converter.access.AccessPatient;
import edu.hiro.util.CIdList;
import edu.hiro.util.CTable;

public class AccessPatientTableReader extends AbstractTableReader
{	
	private Map<Integer,AccessPatient> patients=new HashMap<Integer,AccessPatient>();
	
	//////////////////////////////////////////////////////////////////////////////////

	public AccessPatientTableReader(ConverterServiceImpl converterService, ImportParams params)
	{
		super(converterService,params);
		
		//個人
		addConversion("患者No","患者ID");
		addConversion("氏名","患者名");
		addConversion("氏名カナ","フリガナ");
	}

	@Override
	protected void preProcess(CTable table, List<CTable.Row> rows)
	{
		// find or create patients
		List<Integer> ids=table.getNumericIdentifiers(rows,IDENTIFIER_COLUMN);
		this.patients=this.converterService.findOrCreateAccessPatients(new CIdList(ids));
	}
	
	@Override
	protected void postProcess(CTable table, List<CTable.Row> rows)
	{
		this.converterService.getDao().saveOrUpdateAll(this.patients.values());
	}
	
	@Override
	protected Object getEntityById(int id)
	{
		return this.patients.get(id);
	}
}
