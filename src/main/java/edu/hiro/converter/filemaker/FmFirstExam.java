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

	@Length(max=50)
	@JsonProperty
	public String get患者ID(){return this.患者ID;}
	public void set患者ID(final String 患者ID){this.患者ID=患者ID;}

	@JsonProperty
	public Integer get肝研ID(){return this.肝研ID;}
	public void set肝研ID(final Integer 肝研ID){this.肝研ID=肝研ID;}

	@Length(max=255)
	@JsonProperty
	public String get患者名(){return this.患者名;}
	public void set患者名(final String 患者名){this.患者名=患者名;}

	@Length(max=255)
	@JsonProperty
	public String getフリガナ(){return this.フリガナ;}
	public void setフリガナ(final String フリガナ){this.フリガナ=フリガナ;}

	@Length(max=50)
	@JsonProperty
	public String get生年月日(){return this.生年月日;}
	public void set生年月日(final String 生年月日){this.生年月日=生年月日;}

	@Length(max=255)
	@JsonProperty
	public String get性別(){return this.性別;}
	public void set性別(final String 性別){this.性別=性別;}

	@Length(max=255)
	@JsonProperty
	public String get初診時年齢(){return this.初診時年齢;}
	public void set初診時年齢(final String 初診時年齢){this.初診時年齢=初診時年齢;}

	@Length(max=255)
	@JsonProperty
	public String get外来医(){return this.外来医;}
	public void set外来医(final String 外来医){this.外来医=外来医;}

	@Length(max=50)
	@JsonProperty
	public String get初診日(){return this.初診日;}
	public void set初診日(final String 初診日){this.初診日=初診日;}

	@Length(max=255)
	@JsonProperty
	public String get紹介元病院(){return this.紹介元病院;}
	public void set紹介元病院(final String 紹介元病院){this.紹介元病院=紹介元病院;}

	@Length(max=255)
	@JsonProperty
	public String get紹介医(){return this.紹介医;}
	public void set紹介医(final String 紹介医){this.紹介医=紹介医;}

	@Length(max=255)
	@JsonProperty
	public String get紹介元zip(){return this.紹介元zip;}
	public void set紹介元zip(final String 紹介元zip){this.紹介元zip=紹介元zip;}

	@Length(max=255)
	@JsonProperty
	public String get紹介元住所(){return this.紹介元住所;}
	public void set紹介元住所(final String 紹介元住所){this.紹介元住所=紹介元住所;}

	@Length(max=255)
	@JsonProperty
	public String get紹介元電話(){return this.紹介元電話;}
	public void set紹介元電話(final String 紹介元電話){this.紹介元電話=紹介元電話;}

	@JsonProperty
	public Float getBH(){return this.BH;}
	public void setBH(final Float BH){this.BH=BH;}

	@JsonProperty
	public Float getBW(){return this.BW;}
	public void setBW(final Float BW){this.BW=BW;}

	@JsonProperty
	public Float getBMI(){return this.BMI;}
	public void setBMI(final Float BMI){this.BMI=BMI;}

	@Length(max=50)
	@JsonProperty
	public String get輸血時年齢(){return this.輸血時年齢;}
	public void set輸血時年齢(final String 輸血時年齢){this.輸血時年齢=輸血時年齢;}

	@Length(max=255)
	@JsonProperty
	public String getその他の合併症(){return this.その他の合併症;}
	public void setその他の合併症(final String その他の合併症){this.その他の合併症=その他の合併症;}

	@Length(max=255)
	@JsonProperty
	public String get肝疾患家族歴(){return this.肝疾患家族歴;}
	public void set肝疾患家族歴(final String 肝疾患家族歴){this.肝疾患家族歴=肝疾患家族歴;}

	@Length(max=255)
	@JsonProperty
	public String get特記すべき既往歴(){return this.特記すべき既往歴;}
	public void set特記すべき既往歴(final String 特記すべき既往歴){this.特記すべき既往歴=特記すべき既往歴;}

	@Length(max=255)
	@JsonProperty
	public String get飲酒内容(){return this.飲酒内容;}
	public void set飲酒内容(final String 飲酒内容){this.飲酒内容=飲酒内容;}

	@Length(max=50)
	@JsonProperty
	public String getデータ更新日(){return this.データ更新日;}
	public void setデータ更新日(final String データ更新日){this.データ更新日=データ更新日;}

	@Length(max=255)
	@JsonProperty
	public String getデータ更新者(){return this.データ更新者;}
	public void setデータ更新者(final String データ更新者){this.データ更新者=データ更新者;}

	@Length(max=255)
	@JsonProperty
	public String get転科・転医先とその理由(){return this.転科・転医先とその理由;}
	public void set転科・転医先とその理由(final String 転科・転医先とその理由){this.転科・転医先とその理由=転科・転医先とその理由;}

	@Length(max=255)
	@JsonProperty
	public String get紹介医有無(){return this.紹介医有無;}
	public void set紹介医有無(final String 紹介医有無){this.紹介医有無=紹介医有無;}

	@Length(max=255)
	@JsonProperty
	public String get糖尿病(){return this.糖尿病;}
	public void set糖尿病(final String 糖尿病){this.糖尿病=糖尿病;}

	@Length(max=255)
	@JsonProperty
	public String get高血圧(){return this.高血圧;}
	public void set高血圧(final String 高血圧){this.高血圧=高血圧;}

	@Length(max=255)
	@JsonProperty
	public String get高脂血症(){return this.高脂血症;}
	public void set高脂血症(final String 高脂血症){this.高脂血症=高脂血症;}

	@Length(max=255)
	@JsonProperty
	public String getその他の合併症1(){return this.その他の合併症1;}
	public void setその他の合併症1(final String その他の合併症1){this.その他の合併症1=その他の合併症1;}

	@Length(max=255)
	@JsonProperty
	public String get輸血歴(){return this.輸血歴;}
	public void set輸血歴(final String 輸血歴){this.輸血歴=輸血歴;}

	@Length(max=255)
	@JsonProperty
	public String get肝疾患家族歴1(){return this.肝疾患家族歴1;}
	public void set肝疾患家族歴1(final String 肝疾患家族歴1){this.肝疾患家族歴1=肝疾患家族歴1;}

	@Length(max=255)
	@JsonProperty
	public String get飲酒歴(){return this.飲酒歴;}
	public void set飲酒歴(final String 飲酒歴){this.飲酒歴=飲酒歴;}

	@Length(max=255)
	@JsonProperty
	public String get診断状況(){return this.診断状況;}
	public void set診断状況(final String 診断状況){this.診断状況=診断状況;}

	@Length(max=255)
	@JsonProperty
	public String get診断名(){return this.診断名;}
	public void set診断名(final String 診断名){this.診断名=診断名;}

	@Length(max=255)
	@JsonProperty
	public String get各ファイルへ連絡(){return this.各ファイルへ連絡;}
	public void set各ファイルへ連絡(final String 各ファイルへ連絡){this.各ファイルへ連絡=各ファイルへ連絡;}

	@Length(max=255)
	@JsonProperty
	public String get初診後転帰(){return this.初診後転帰;}
	public void set初診後転帰(final String 初診後転帰){this.初診後転帰=初診後転帰;}

	@JsonProperty
	public Float getエタノール換算量(){return this.エタノール換算量;}
	public void setエタノール換算量(final Float エタノール換算量){this.エタノール換算量=エタノール換算量;}

	@JsonProperty
	public Integer get年(){return this.年;}
	public void set年(final Integer 年){this.年=年;}

	@JsonProperty
	public Float get初診時積算飲酒量(){return this.初診時積算飲酒量;}
	public void set初診時積算飲酒量(final Float 初診時積算飲酒量){this.初診時積算飲酒量=初診時積算飲酒量;}

	@Length(max=255)
	@JsonProperty
	public String get病期(){return this.病期;}
	public void set病期(final String 病期){this.病期=病期;}

	@Length(max=255)
	@JsonProperty
	public String getHCC(){return this.HCC;}
	public void setHCC(final String HCC){this.HCC=HCC;}

	@Length(max=255)
	@JsonProperty
	public String get備考(){return this.備考;}
	public void set備考(final String 備考){this.備考=備考;}
	
	public FmFirstExam(){}
	
	public FmFirstExam(int rowID)
	{
		super(rowID);
	}
	
	@Id
	public Integer getRowID(){return this.rowID;}
}