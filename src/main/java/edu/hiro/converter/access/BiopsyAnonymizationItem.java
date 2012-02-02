package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl肝生検匿名化番号")
public class BiopsyAnonymizationItem extends AbstractPatientItem
{	
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected String 肝生検施行施設="";
	protected Integer JGS=null;
	protected Date 同意日=null;
}