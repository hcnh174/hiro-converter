package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl肝生検匿名化番号")
@Access(value=AccessType.FIELD)
public class BiopsyAnonymizationItem extends AbstractPatientItem
{
	protected @Column(columnDefinition="TEXT") String 肝生検施行施設="";
	protected Integer JGS=null;
	protected Date 同意日=null;
}