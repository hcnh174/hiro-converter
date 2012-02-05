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
	protected @Column(columnDefinition="TEXT") String 肝研ＩＤ;
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


/*	
	protected @Column(columnDefinition="TEXT") String 患者ID;
	protected @Column(columnDefinition="TEXT") Integer 肝研ID=null;
	protected @Column(columnDefinition="TEXT") String 患者名;
	protected @Column(columnDefinition="TEXT") String フリガナ;
	protected @Column(columnDefinition="TEXT") String 生年月日=null;
	protected @Column(columnDefinition="TEXT") String 性別;
	protected @Column(columnDefinition="TEXT") String 初診時年齢;
	protected @Column(columnDefinition="TEXT") String 外来医;
	protected @Column(columnDefinition="TEXT") String 初診日=null;
	protected @Column(columnDefinition="TEXT") String 紹介元病院;
	protected @Column(columnDefinition="TEXT") String 紹介医;
	protected @Column(columnDefinition="TEXT") String 紹介元zip;
	protected @Column(columnDefinition="TEXT") String 紹介元住所;
	protected @Column(columnDefinition="TEXT") String 紹介元電話;
	protected @Column(columnDefinition="TEXT") Float BH=null;
	protected @Column(columnDefinition="TEXT") Float BW=null;
	protected @Column(columnDefinition="TEXT") Float BMI=null;
	protected @Column(columnDefinition="TEXT") String 輸血時年齢=null;
	protected @Column(columnDefinition="TEXT") String その他の合併症;
	protected @Column(columnDefinition="TEXT") String 肝疾患家族歴;
	protected @Column(columnDefinition="TEXT") String 特記すべき既往歴;
	protected @Column(columnDefinition="TEXT") String 飲酒内容;
	protected @Column(columnDefinition="TEXT") String データ更新日=null;
	protected @Column(columnDefinition="TEXT") String データ更新者;
	protected @Column(columnDefinition="TEXT") String 転科・転医先とその理由;
	protected @Column(columnDefinition="TEXT") String 紹介医有無;
	protected @Column(columnDefinition="TEXT") String 糖尿病;
	protected @Column(columnDefinition="TEXT") String 高血圧;
	protected @Column(columnDefinition="TEXT") String 高脂血症;
	protected @Column(columnDefinition="TEXT") String その他の合併症1;
	protected @Column(columnDefinition="TEXT") String 輸血歴;
	protected @Column(columnDefinition="TEXT") String 肝疾患家族歴1;
	protected @Column(columnDefinition="TEXT") String 飲酒歴;
	protected @Column(columnDefinition="TEXT") String 診断状況;
	protected @Column(columnDefinition="TEXT") String 診断名;
	protected @Column(columnDefinition="TEXT") String 各ファイルへ連絡;
	protected @Column(columnDefinition="TEXT") String 初診後転帰;
	protected @Column(columnDefinition="TEXT") Float エタノール換算量=null;
	protected @Column(columnDefinition="TEXT") Integer 年=null;
	protected @Column(columnDefinition="TEXT") Float 初診時積算飲酒量=null;
	protected @Column(columnDefinition="TEXT") String 病期;
	protected @Column(columnDefinition="TEXT") String HCC;
	protected @Column(columnDefinition="TEXT") String 備考;
	*/
	
	public FmFirstExam(){}
	
	public FmFirstExam(int rowID)
	{
		super(rowID);
	}
}