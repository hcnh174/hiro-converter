package edu.hiro.converter.pegriba;

import org.springframework.transaction.annotation.Transactional;

import edu.hiro.util.MessageWriter;

@Transactional
public interface PegribaService
{
	void importPegribaSpreadsheets(String dir, MessageWriter writer);
	
	/*
	DataFrame getPegribaData(PegribaParams params);	
	List<CPegribaPatient> getPatients(IPaging paging);
	CPegribaPatient getPatient(Integer pegribaDBno);
	void updatePatient(Integer pegribaDBno, Map<String,String> properties);	
	*/
	
	public enum Sex
	{
		男,
		女;
		
		public static Sex find(String str)
		{
			str=str.toUpperCase();
			if ("男".equals(str) || "M".equals(str) || "MALE".equals(str))
				return 男;
			else if ("女".equals(str) || "F".equals(str) || "FEMALE".equals(str))
				return 女; 
			else return null;
		}
	};	
}
