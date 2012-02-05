package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl入院台帳")
@Access(value=AccessType.FIELD)
public class HospitalizationItem extends AbstractPatientItem
{	
	protected Date 入院日=null;
	protected Date 退院日=null;
	protected Integer 入院回数=null;
	protected @Column(columnDefinition="TEXT") String 主病名1="";
	protected @Column(columnDefinition="TEXT") String 主病名1の転帰="";
	protected @Column(columnDefinition="TEXT") String 主病名2="";
	protected @Column(columnDefinition="TEXT") String 主病名2の転帰="";
	protected @Column(columnDefinition="TEXT") String 指導医="";
	protected @Column(columnDefinition="TEXT") String 外来医="";
	protected @Column(columnDefinition="TEXT") String 検査="";
	protected Date 検査日=null;
	protected @Column(columnDefinition="TEXT") String 今後の治療方針="";
	protected @Column(columnDefinition="TEXT") String 治療内容="";
	protected @Column(columnDefinition="TEXT") String 入院後経過="";
	protected @Column(columnDefinition="TEXT") String 注意点="";
}