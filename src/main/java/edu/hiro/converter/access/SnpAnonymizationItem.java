package edu.hiro.converter.access;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tblSNP匿名化番号")
public class SnpAnonymizationItem extends AbstractPatientItem
{	
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected Integer 匿名化No=null;
	protected String rs8099917="";
	protected String rs12979860="";
}