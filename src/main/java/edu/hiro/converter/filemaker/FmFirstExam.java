package edu.hiro.converter.filemaker;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fmfirstexam")
@Access(value=AccessType.FIELD)
public class FmFirstExam extends AbstractFmPatient
{
	protected @Column(columnDefinition="TEXT") String エンボス;
	protected @Column(columnDefinition="TEXT") String ふりがな;
	protected @Column(columnDefinition="TEXT") String 外来医;
	protected @Column(columnDefinition="TEXT") String 患者名;
	protected @Column(columnDefinition="TEXT") String 肝研ID;
	protected @Column(columnDefinition="TEXT") String 初診後転帰;
	protected @Column(columnDefinition="TEXT") String 初診時積算飲酒量;
	protected @Column(columnDefinition="TEXT") String 初診時年齢;
	protected @Column(columnDefinition="TEXT") String 初診日;
	protected @Column(columnDefinition="TEXT") String 診断状況;
	protected @Column(columnDefinition="TEXT") String 診断名;
	protected @Column(columnDefinition="TEXT") String 身長;
	protected @Column(columnDefinition="TEXT") String 性別;
	protected @Column(columnDefinition="TEXT") String 生年月日;
	protected @Column(columnDefinition="TEXT") String 体重;
	protected @Column(columnDefinition="TEXT") String 年;
	protected @Column(columnDefinition="TEXT") String HCC;
	protected @Column(columnDefinition="TEXT") String 備考;
	protected @Column(columnDefinition="TEXT") String 病期;

	public FmFirstExam(){}
	
	public FmFirstExam(int rowID)
	{
		super(rowID);
	}
}