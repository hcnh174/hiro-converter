package edu.hiro.converter.filemaker;

import javax.persistence.MappedSuperclass;

import edu.hiro.util.AbstractEntity;

@MappedSuperclass
public class AbstractFmPatient extends AbstractEntity
{
	protected Integer rowID=null;
	
	public AbstractFmPatient(){}
	
	public AbstractFmPatient(int rowID)
	{
		this.rowID=rowID;
	}
	
	public void setRowID(final Integer rowID){this.rowID=rowID;}
}