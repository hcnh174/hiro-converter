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
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected String 主病名="";
	protected Date 診断日=null;
	protected String 転帰="";
	protected String 外来医確認="";
	protected Date 確認日=null;	
}