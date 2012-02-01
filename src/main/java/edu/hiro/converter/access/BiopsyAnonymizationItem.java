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
	protected String 肝生検施行施設="";
	protected Integer JGS=null;
	protected Date 同意日=null;

	@Length(max=15) @NotNull
	public String get肝生検施行施設(){return this.肝生検施行施設;}
	public void set肝生検施行施設(final String 肝生検施行施設){this.肝生検施行施設=肝生検施行施設;}

	public Integer getJGS(){return this.JGS;}
	public void setJGS(final Integer JGS){this.JGS=JGS;}

	public Date get同意日(){return this.同意日;}
	public void set同意日(final Date 同意日){this.同意日=同意日;}
	
	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}