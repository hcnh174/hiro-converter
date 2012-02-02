package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl入院台帳")
public class HospitalizationItem extends AbstractPatientItem
{	
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected Date 入院日=null;
	protected Date 退院日=null;
	protected Integer 入院回数=null;
	protected String 主病名1="";
	protected String 主病名1の転帰="";
	protected String 主病名2="";
	protected String 主病名2の転帰="";
	protected String 指導医="";
	protected String 外来医="";
	protected String 検査="";
	protected Date 検査日=null;
	protected String 今後の治療方針="";
	protected String 治療内容="";
	protected String 入院後経過="";
	protected String 注意点="";
}