package edu.hiro.converter.filemaker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="fmfirstexam")
public class FmFirstExam extends AbstractFmPatient
{
	protected String 患者ID="";
	protected Integer 肝研ID=null;
	protected String 患者名="";
	protected String フリガナ="";
	protected String 生年月日=null;
	protected String 性別="";
	protected String 初診時年齢="";
	protected String 外来医="";
	protected String 初診日=null;
	protected String 紹介元病院="";
	protected String 紹介医="";
	protected String 紹介元zip="";
	protected String 紹介元住所="";
	protected String 紹介元電話="";
	protected Float BH=null;
	protected Float BW=null;
	protected Float BMI=null;
	protected String 輸血時年齢=null;
	protected String その他の合併症="";
	protected String 肝疾患家族歴="";
	protected String 特記すべき既往歴="";
	protected String 飲酒内容="";
	protected String データ更新日=null;
	protected String データ更新者="";
	protected String 転科・転医先とその理由="";
	protected String 紹介医有無="";
	protected String 糖尿病="";
	protected String 高血圧="";
	protected String 高脂血症="";
	protected String その他の合併症1="";
	protected String 輸血歴="";
	protected String 肝疾患家族歴1="";
	protected String 飲酒歴="";
	protected String 診断状況="";
	protected String 診断名="";
	protected String 各ファイルへ連絡="";
	protected String 初診後転帰="";
	protected Float エタノール換算量=null;
	protected Integer 年=null;
	protected Float 初診時積算飲酒量=null;
	protected String 病期="";
	protected String HCC="";
	protected String 備考="";
	
	public FmFirstExam(){}
	
	public FmFirstExam(int rowID)
	{
		super(rowID);
	}
}