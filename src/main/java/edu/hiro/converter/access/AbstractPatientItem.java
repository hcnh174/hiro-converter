package edu.hiro.converter.access;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

import edu.hiro.util.AbstractEntity;

@MappedSuperclass
public abstract class AbstractPatientItem extends AbstractEntity
{
	protected Integer 個人ID;
	//protected AccessPatient patient;

	public abstract Integer getId();
	public abstract void setId(int id);

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="個人ID")
//	public AccessPatient getPatient(){return this.patient;}
//	public void setPatient(final AccessPatient patient){this.patient=patient;}
	
	public AbstractPatientItem() {}
	
	public void initialize(){}
}