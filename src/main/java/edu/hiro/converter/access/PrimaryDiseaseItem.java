package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl個人主病名")
@Access(value=AccessType.FIELD)
public class PrimaryDiseaseItem extends AbstractPatientItem
{	
	protected @Column(columnDefinition="TEXT") String 主病名="";
	protected Date 診断日=null;
	protected @Column(columnDefinition="TEXT") String 転帰="";
	protected @Column(columnDefinition="TEXT") String 外来医確認="";
	protected Date 確認日=null;	
}