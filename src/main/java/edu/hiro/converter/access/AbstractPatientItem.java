package edu.hiro.converter.access;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import edu.hiro.util.AbstractEntity;

@MappedSuperclass
public abstract class AbstractPatientItem extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="SERIAL NOT NULL")
	protected Integer id;
	protected Integer 個人ID;

	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	public AbstractPatientItem() {}
}