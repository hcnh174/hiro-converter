package edu.hiro.converter.filemaker;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import edu.hiro.util.AbstractEntity;

@MappedSuperclass
public abstract class AbstractPatient extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="SERIAL NOT NULL")
	protected Integer rowID=null;
	
	public Integer getRowID(){return this.rowID;}
}