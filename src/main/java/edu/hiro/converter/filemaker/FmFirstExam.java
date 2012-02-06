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
	protected String エンボス;
	protected String ふりがな;
	protected String 外来医;
	protected String 患者名;
	protected String 肝研id;
	protected String 初診後転帰;
	protected String 初診時積算飲酒量;
	protected String 初診時年齢;
	protected String 初診日;
	protected String 診断状況;
	protected String 診断名;
	protected String 身長;
	protected String 性別;
	protected String 生年月日;
	protected String 体重;
	protected String 年;
	protected String hcc;
	protected String 備考;
	protected String 病期;

	public FmFirstExam(){}
	
	public FmFirstExam(int rowID)
	{
		super(rowID);
	}
}