package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl個人主病名")
public class PrimaryDiseaseItem extends AbstractPatientItem
{	
	protected String 主病名="";
	protected Date 診断日=null;
	protected String 転帰="";
	protected String 外来医確認="";
	protected Date 確認日=null;	
	
	@Length(max=50) @NotNull
	public String get主病名(){return this.主病名;}
	public void set主病名(final String 主病名){this.主病名=主病名;}

	public Date get診断日(){return this.診断日;}
	public void set診断日(final Date 診断日){this.診断日=診断日;}

	@Length(max=50) @NotNull
	public String get転帰(){return this.転帰;}
	public void set転帰(final String 転帰){this.転帰=転帰;}

	@Length(max=50) @NotNull
	public String get外来医確認(){return this.外来医確認;}
	public void set外来医確認(final String 外来医確認){this.外来医確認=外来医確認;}

	public Date get確認日(){return this.確認日;}
	public void set確認日(final Date 確認日){this.確認日=確認日;}
	

	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
	
}