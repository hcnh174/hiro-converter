package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import edu.hiro.util.AbstractEntity;

@Entity
@Table(name="tbl個人")
@Access(value=AccessType.FIELD)
public class AccessPatient extends AbstractEntity
{
	@Id @NotNull protected Integer 個人ID=null;
	protected @Column(columnDefinition="TEXT") String 患者ID=null;
	protected @Column(columnDefinition="TEXT") String 患者名="";
	protected @Column(columnDefinition="TEXT") String フリガナ="";
	protected Date 生年月日=null;
	protected @Column(columnDefinition="TEXT") String 性別=null;
	protected @Column(columnDefinition="TEXT") String 旧姓="";
	
	public Integer get個人ID(){return this.個人ID;}
	
	public AccessPatient() {}

	public AccessPatient(int 個人ID)
	{
		this.個人ID=個人ID;
	}
}