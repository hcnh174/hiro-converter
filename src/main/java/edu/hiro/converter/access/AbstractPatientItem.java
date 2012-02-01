package edu.hiro.converter.access;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import edu.hiro.util.AbstractEntity;

@MappedSuperclass
public abstract class AbstractPatientItem extends AbstractEntity
{
	protected Integer id;
	protected Integer 個人ID;
	protected AccessPatient patient;
	
	@Column(insertable=false,updatable=false)
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}

	@Column(insertable=false,updatable=false)
	public Integer get個人ID(){return this.個人ID;}
	public void set個人ID(final Integer 個人ID){this.個人ID=個人ID;}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="個人ID")
	public AccessPatient getPatient(){return this.patient;}
	public void setPatient(final AccessPatient patient){this.patient=patient;}
	
	public AbstractPatientItem() {}
	
	public AbstractPatientItem(int id)
	{
		this.id=id;
	}

	public void initialize(){}
}