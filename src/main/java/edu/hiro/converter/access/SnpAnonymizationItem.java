package edu.hiro.converter.access;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblSNP匿名化番号")
@Access(value=AccessType.FIELD)
public class SnpAnonymizationItem extends AbstractPatientItem
{
	protected Integer 匿名化No=null;
	protected @Column(columnDefinition="TEXT") String rs8099917="";
	protected @Column(columnDefinition="TEXT") String rs12979860="";
}