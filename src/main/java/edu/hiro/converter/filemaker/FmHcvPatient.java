package edu.hiro.converter.filemaker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="fmhcv")
public class FmHcvPatient extends AbstractFmPatient
{
	protected String 患者ID="";
	protected Integer DBno=null;
	protected String 患者名="";
	protected String フリガナ="";
	protected String 生年月日=null;
	protected String 性別="";
	protected String 旧姓="";
	protected String 初診日=null;
	protected String 主治療施設="";
	protected String 外来主治医="";
	protected String 副治療施設="";
	protected String 副治療施設ID="";
	protected String 紹介先="";
	protected String 最終更新日=null;
	protected Float BH=null;
	protected Float BW=null;
	protected String BMI="";
	protected String 輸血時年齢="";
	protected String 既往歴備考="";
	protected String FattyLiver="";
	protected String 紹介元="";
	protected String 家族歴有無="";
	protected String 飲酒歴有無="";
	protected String 輸血歴有無="";
	protected String 針治療歴有無="";
	protected String 刺青有無="";
	protected String 針刺し年月日=null;
	protected String 診断="";
	protected String 検査施設="";
	protected String HBsAg="";
	protected String HBsAb="";
	protected String HBcAb="";
	protected String genotype="";
	protected String 検査年月日=null;
	protected String HCC有無="";
	protected String 初発HCC治療日付=null;
	protected String 病歴備考="";
	protected String 転機年月日=null;
	protected String 死亡年月日=null;
	protected String 転機="";
	protected String 死因="";
	protected String 家族歴備考="";
	protected String 針刺し事故有無="";
	protected String 既往歴有無="";
	protected String DM="";
	protected String HT="";
	protected String HL="";
	protected String 死亡詳細備考="";
	protected String 各ファイルIFN="";
	protected String 家族歴詳細父有無="";
	protected String 家族歴詳細母有無="";
	protected String 家族歴詳細兄弟・姉妹有無="";
	protected String 家族歴詳細他有無="";
	protected String 観察の継続="";
	protected String 肝生検有無="";
	protected String 初診時年齢="";
	protected String IFN有無="";
	protected String 移植有無="";
	protected String Alcoholic有無="";
	protected String AIH有無="";
	protected String PBC有無="";
	protected String 併発肝疾患備考="";
	protected String NASH有無="";
	protected String HIV有無="";
	protected String 更新終了="";
	protected String 治療目的="";
	protected String 再発HCC="";
	protected String 再発日付=null;
	protected String 針治療時年齢="";
	protected String 刺青年齢=null;
	protected String 飲酒分類="";
	protected String 飲酒内容="";
	protected String 飲酒歴詳細="";
	protected String 副外来主治医="";
	protected String 副観察開始日=null;
	protected String 輸血歴備考="";
	protected String HCVAb="";
	protected String 転機備考="";
	protected String chemo種類="";
	protected String HCC治療備考="";
	protected String 最終更新日における診断="";
	protected String 診断変更日1=null;
	protected String 診断変更日2=null;
	protected String 変更後の診断1="";
	protected String 変更後の診断2="";
	protected String 最終更新日におけるHCCの有無="";
	protected String SNP有check="";
	protected Integer SNP匿名化No=null;
	protected String SNP採血日=null;
	protected String Plt="";
	protected String AST="";
	protected String ALT="";
	protected String HBV有無="";
	protected String HCC治療因子="";
	protected String DMｺﾝﾄﾛｰﾙ="";
	protected String type="";
	protected String wbc="";
	protected String Hb="";
	protected String PT="";
	protected String TB="";
	protected String Alb="";
	protected String Cr="";
	protected String ﾋｱﾙﾛﾝ酸="";
	protected String gammagloblin="";
	protected String gammaGTP="";
	protected String Fe="";
	protected String UIBC="";
	protected String AFP="";
	protected String ﾌｪﾘﾁﾝ="";
	protected String ANA="";
	protected String M2分画="";
	protected String HCVRNA量="";
	protected String HbA1C="";
	protected String FBS="";
	protected String IRI="";
	protected String TC="";
	protected String TG="";
	protected String HDL="";
	protected String HCVRNA検査法="";
	protected String HCCファイルNo="";
	protected String IFN以外の治療有無="";
	protected String IFN以外の治療詳細="";
	protected String 脾摘有無="";
	protected String Varix有無="";
	protected String 腹水有無="";
	protected String 二度の肝性脳症有無="";
	protected String 肝硬変の簡易式の値="";
	protected String HCVcoreAb="";
	protected String HOMAIRscore="";
	protected String ｱﾙｺｰﾙ積算量="";
	protected String 初診時合併症Varix診断日=null;
	protected String 初診時合併症腹水診断日=null;
	protected String 初診時合併症2度の肝性脳症診断日=null;
	protected String 合併症Varix出現の有無="";
	protected String 合併症腹水出現の有無="";
	protected String 合併症2度の肝性脳症出現の有無="";
	protected String 合併症出現Varix診断日=null;
	protected String 合併症出現腹水診断日=null;
	protected String 合併症出現2度の肝性脳症診断日=null;
	protected String 初診時合併症移植診断日=null;
	protected String 初診時合併症脾摘診断日=null;
	protected String 合併症出現移植診断日=null;
	protected String 合併症出現脾摘診断日=null;
	protected String 合併症移植出現の有無="";
	protected String 合併症脾摘出現の有無="";
	protected String HCVcore70="";
	protected String HCVcore90="";
	protected String HCVcoreISDR="";
	protected String HCVcore検査日=null;
	protected String Tx種類1="";
	protected String Tx種類2="";
	protected String Tx種類3="";
	protected String Tx種類4="";
	protected String Tx種類5="";
	protected String Tx種類6="";
	protected String Tx種類7="";
	protected String Tx種類8="";
	protected String Tx種類9="";
	protected String Tx種類10="";
	protected String 治療開始日1="";
	protected String 治療開始日2="";
	protected String 治療開始日3="";
	protected String 治療開始日4="";
	protected String 治療開始日5="";
	protected String 治療開始日6="";
	protected String 治療開始日7="";
	protected String 治療開始日8="";
	protected String 治療開始日9="";
	protected String 治療開始日10="";
	protected String 治療終了日1="";
	protected String 治療終了日2="";
	protected String 治療終了日3="";
	protected String 治療終了日4="";
	protected String 治療終了日5="";
	protected String 治療終了日6="";
	protected String 治療終了日7="";
	protected String 治療終了日8="";
	protected String 治療終了日9="";
	protected String 治療終了日10="";
	protected String 治療効果1="";
	protected String 治療効果2="";
	protected String 治療効果3="";
	protected String 治療効果4="";
	protected String 治療効果5="";
	protected String 治療効果6="";
	protected String 治療効果7="";
	protected String 治療効果8="";
	protected String 治療効果9="";
	protected String 治療効果10="";
	protected String 治療備考1="";
	protected String 治療備考2="";
	protected String 治療備考3="";
	protected String 治療備考4="";
	protected String 治療備考5="";
	protected String 治療備考6="";
	protected String 治療備考7="";
	protected String 治療備考8="";
	protected String 治療備考9="";
	protected String 治療備考10="";
	protected String 治療容量IFN1="";
	protected String 治療容量IFN2="";
	protected String 治療容量IFN3="";
	protected String 治療容量IFN4="";
	protected String 治療容量IFN5="";
	protected String 治療容量IFN6="";
	protected String 治療容量IFN7="";
	protected String 治療容量IFN8="";
	protected String 治療容量IFN9="";
	protected String 治療容量IFN10="";
	protected String 治療容量RBV1="";
	protected String 治療容量RBV2="";
	protected String 治療容量RBV3="";
	protected String 治療容量RBV4="";
	protected String 治療容量RBV5="";
	protected String 治療容量RBV6="";
	protected String 治療容量RBV7="";
	protected String 治療容量RBV8="";
	protected String 治療容量RBV9="";
	protected String 治療容量RBV10="";
	protected String IFN期間1="";
	protected String IFN期間2="";
	protected String IFN期間3="";
	protected String IFN期間4="";
	protected String IFN期間5="";
	protected String IFN期間6="";
	protected String IFN期間7="";
	protected String IFN期間8="";
	protected String IFN期間9="";
	protected String IFN期間10="";
	protected String 肝生検施行日Bx1="";
	protected String 肝生検施行日Bx2="";
	protected String 肝生検施行日Bx3="";
	protected String 肝生検施行日Bx4="";
	protected String 肝生検施行日Bx5="";
	protected String 肝生検施行日Bx6="";
	protected String 肝生検施行日Bx7="";
	protected String 肝生検施行日Bx8="";
	protected String 肝生検施行日Bx9="";
	protected String 肝生検施行日Bx10="";
	protected String 肝生検備考Bx1="";
	protected String 肝生検備考Bx3="";
	protected String 肝生検備考Bx2="";
	protected String 肝生検備考Bx4="";
	protected String 肝生検備考Bx5="";
	protected String 肝生検備考Bx6="";
	protected String 肝生検備考Bx7="";
	protected String 肝生検備考Bx8="";
	protected String 肝生検備考Bx9="";
	protected String 肝生検備考Bx10="";
	protected String fibrosisBx1="";
	protected String fibrosisBx2="";
	protected String fibrosisBx3="";
	protected String fibrosisBx4="";
	protected String fibrosisBx5="";
	protected String fibrosisBx6="";
	protected String fibrosisBx7="";
	protected String fibrosisBx8="";
	protected String fibrosisBx9="";
	protected String fibrosisBx10="";
	protected String activityBx1="";
	protected String activityBx2="";
	protected String activityBx3="";
	protected String activityBx4="";
	protected String activityBx5="";
	protected String activityBx6="";
	protected String activityBx7="";
	protected String activityBx8="";
	protected String activityBx9="";
	protected String activityBx10="";
	protected String HAIscoreBx1="";
	protected String HAIscoreBx2="";
	protected String HAIscoreBx3="";
	protected String HAIscoreBx4="";
	protected String HAIscoreBx5="";
	protected String HAIscoreBx6="";
	protected String HAIscoreBx7="";
	protected String HAIscoreBx8="";
	protected String HAIscoreBx9="";
	protected String HAIscoreBx10="";

	@Length(max=50)
	@JsonProperty
	public String get患者ID(){return this.患者ID;}
	public void set患者ID(final String 患者ID){this.患者ID=患者ID;}

	@JsonProperty
	public Integer getDBno(){return this.DBno;}
	public void setDBno(final Integer DBno){this.DBno=DBno;}

	@Length(max=100)
	@JsonProperty
	public String get患者名(){return this.患者名;}
	public void set患者名(final String 患者名){this.患者名=患者名;}

	@Length(max=100)
	@JsonProperty
	public String getフリガナ(){return this.フリガナ;}
	public void setフリガナ(final String フリガナ){this.フリガナ=フリガナ;}

	@Length(max=50)
	@JsonProperty
	public String get生年月日(){return this.生年月日;}
	public void set生年月日(final String 生年月日){this.生年月日=生年月日;}

	@Length(max=100)
	@JsonProperty
	public String get性別(){return this.性別;}
	public void set性別(final String 性別){this.性別=性別;}

	@Length(max=100)
	@JsonProperty
	public String get旧姓(){return this.旧姓;}
	public void set旧姓(final String 旧姓){this.旧姓=旧姓;}

	@Length(max=50)
	@JsonProperty
	public String get初診日(){return this.初診日;}
	public void set初診日(final String 初診日){this.初診日=初診日;}

	@Length(max=100)
	@JsonProperty
	public String get主治療施設(){return this.主治療施設;}
	public void set主治療施設(final String 主治療施設){this.主治療施設=主治療施設;}

	@Length(max=100)
	@JsonProperty
	public String get外来主治医(){return this.外来主治医;}
	public void set外来主治医(final String 外来主治医){this.外来主治医=外来主治医;}

	@Length(max=100)
	@JsonProperty
	public String get副治療施設(){return this.副治療施設;}
	public void set副治療施設(final String 副治療施設){this.副治療施設=副治療施設;}

	@Length(max=100)
	@JsonProperty
	public String get副治療施設ID(){return this.副治療施設ID;}
	public void set副治療施設ID(final String 副治療施設ID){this.副治療施設ID=副治療施設ID;}

	@Length(max=100)
	@JsonProperty
	public String get紹介先(){return this.紹介先;}
	public void set紹介先(final String 紹介先){this.紹介先=紹介先;}

	@Length(max=50)
	@JsonProperty
	public String get最終更新日(){return this.最終更新日;}
	public void set最終更新日(final String 最終更新日){this.最終更新日=最終更新日;}

	@JsonProperty
	public Float getBH(){return this.BH;}
	public void setBH(final Float BH){this.BH=BH;}

	@JsonProperty
	public Float getBW(){return this.BW;}
	public void setBW(final Float BW){this.BW=BW;}

	@Length(max=50)
	@JsonProperty
	public String getBMI(){return this.BMI;}
	public void setBMI(final String BMI){this.BMI=BMI;}

	@Length(max=50)
	@JsonProperty
	public String get輸血時年齢(){return this.輸血時年齢;}
	public void set輸血時年齢(final String 輸血時年齢){this.輸血時年齢=輸血時年齢;}

	@Length(max=1000)
	@JsonProperty
	public String get既往歴備考(){return this.既往歴備考;}
	public void set既往歴備考(final String 既往歴備考){this.既往歴備考=既往歴備考;}

	@Length(max=100)
	@JsonProperty
	public String getFattyLiver(){return this.FattyLiver;}
	public void setFattyLiver(final String FattyLiver){this.FattyLiver=FattyLiver;}

	@Length(max=100)
	@JsonProperty
	public String get紹介元(){return this.紹介元;}
	public void set紹介元(final String 紹介元){this.紹介元=紹介元;}

	@Length(max=100)
	@JsonProperty
	public String get家族歴有無(){return this.家族歴有無;}
	public void set家族歴有無(final String 家族歴有無){this.家族歴有無=家族歴有無;}

	@Length(max=100)
	@JsonProperty
	public String get飲酒歴有無(){return this.飲酒歴有無;}
	public void set飲酒歴有無(final String 飲酒歴有無){this.飲酒歴有無=飲酒歴有無;}

	@Length(max=100)
	@JsonProperty
	public String get輸血歴有無(){return this.輸血歴有無;}
	public void set輸血歴有無(final String 輸血歴有無){this.輸血歴有無=輸血歴有無;}

	@Length(max=100)
	@JsonProperty
	public String get針治療歴有無(){return this.針治療歴有無;}
	public void set針治療歴有無(final String 針治療歴有無){this.針治療歴有無=針治療歴有無;}

	@Length(max=100)
	@JsonProperty
	public String get刺青有無(){return this.刺青有無;}
	public void set刺青有無(final String 刺青有無){this.刺青有無=刺青有無;}

	@Length(max=50)
	@JsonProperty
	public String get針刺し年月日(){return this.針刺し年月日;}
	public void set針刺し年月日(final String 針刺し年月日){this.針刺し年月日=針刺し年月日;}

	@Length(max=100)
	@JsonProperty
	public String get診断(){return this.診断;}
	public void set診断(final String 診断){this.診断=診断;}

	@Length(max=100)
	@JsonProperty
	public String get検査施設(){return this.検査施設;}
	public void set検査施設(final String 検査施設){this.検査施設=検査施設;}

	@Length(max=100)
	@JsonProperty
	public String getHBsAg(){return this.HBsAg;}
	public void setHBsAg(final String HBsAg){this.HBsAg=HBsAg;}

	@Length(max=100)
	@JsonProperty
	public String getHBsAb(){return this.HBsAb;}
	public void setHBsAb(final String HBsAb){this.HBsAb=HBsAb;}

	@Length(max=100)
	@JsonProperty
	public String getHBcAb(){return this.HBcAb;}
	public void setHBcAb(final String HBcAb){this.HBcAb=HBcAb;}

	@Length(max=100)
	@JsonProperty
	public String getGenotype(){return this.genotype;}
	public void setGenotype(final String genotype){this.genotype=genotype;}

	@Length(max=50)
	@JsonProperty
	public String get検査年月日(){return this.検査年月日;}
	public void set検査年月日(final String 検査年月日){this.検査年月日=検査年月日;}

	@Length(max=100)
	@JsonProperty
	public String getHCC有無(){return this.HCC有無;}
	public void setHCC有無(final String HCC有無){this.HCC有無=HCC有無;}

	@Length(max=50)
	@JsonProperty
	public String get初発HCC治療日付(){return this.初発HCC治療日付;}
	public void set初発HCC治療日付(final String 初発HCC治療日付){this.初発HCC治療日付=初発HCC治療日付;}

	@Length(max=1000)
	@JsonProperty
	public String get病歴備考(){return this.病歴備考;}
	public void set病歴備考(final String 病歴備考){this.病歴備考=病歴備考;}

	@Length(max=50)
	@JsonProperty
	public String get転機年月日(){return this.転機年月日;}
	public void set転機年月日(final String 転機年月日){this.転機年月日=転機年月日;}

	@Length(max=50)
	@JsonProperty
	public String get死亡年月日(){return this.死亡年月日;}
	public void set死亡年月日(final String 死亡年月日){this.死亡年月日=死亡年月日;}

	@Length(max=100)
	@JsonProperty
	public String get転機(){return this.転機;}
	public void set転機(final String 転機){this.転機=転機;}

	@Length(max=100)
	@JsonProperty
	public String get死因(){return this.死因;}
	public void set死因(final String 死因){this.死因=死因;}

	@Length(max=1000)
	@JsonProperty
	public String get家族歴備考(){return this.家族歴備考;}
	public void set家族歴備考(final String 家族歴備考){this.家族歴備考=家族歴備考;}

	@Length(max=100)
	@JsonProperty
	public String get針刺し事故有無(){return this.針刺し事故有無;}
	public void set針刺し事故有無(final String 針刺し事故有無){this.針刺し事故有無=針刺し事故有無;}

	@Length(max=100)
	@JsonProperty
	public String get既往歴有無(){return this.既往歴有無;}
	public void set既往歴有無(final String 既往歴有無){this.既往歴有無=既往歴有無;}

	@Length(max=100)
	@JsonProperty
	public String getDM(){return this.DM;}
	public void setDM(final String DM){this.DM=DM;}

	@Length(max=100)
	@JsonProperty
	public String getHT(){return this.HT;}
	public void setHT(final String HT){this.HT=HT;}

	@Length(max=100)
	@JsonProperty
	public String getHL(){return this.HL;}
	public void setHL(final String HL){this.HL=HL;}

	@Length(max=1000)
	@JsonProperty
	public String get死亡詳細備考(){return this.死亡詳細備考;}
	public void set死亡詳細備考(final String 死亡詳細備考){this.死亡詳細備考=死亡詳細備考;}

	@Length(max=100)
	@JsonProperty
	public String get各ファイルIFN(){return this.各ファイルIFN;}
	public void set各ファイルIFN(final String 各ファイルIFN){this.各ファイルIFN=各ファイルIFN;}

	@Length(max=100)
	@JsonProperty
	public String get家族歴詳細父有無(){return this.家族歴詳細父有無;}
	public void set家族歴詳細父有無(final String 家族歴詳細父有無){this.家族歴詳細父有無=家族歴詳細父有無;}

	@Length(max=100)
	@JsonProperty
	public String get家族歴詳細母有無(){return this.家族歴詳細母有無;}
	public void set家族歴詳細母有無(final String 家族歴詳細母有無){this.家族歴詳細母有無=家族歴詳細母有無;}

	@Length(max=100)
	@JsonProperty
	public String get家族歴詳細兄弟・姉妹有無(){return this.家族歴詳細兄弟・姉妹有無;}
	public void set家族歴詳細兄弟・姉妹有無(final String 家族歴詳細兄弟・姉妹有無){this.家族歴詳細兄弟・姉妹有無=家族歴詳細兄弟・姉妹有無;}

	@Length(max=100)
	@JsonProperty
	public String get家族歴詳細他有無(){return this.家族歴詳細他有無;}
	public void set家族歴詳細他有無(final String 家族歴詳細他有無){this.家族歴詳細他有無=家族歴詳細他有無;}

	@Length(max=100)
	@JsonProperty
	public String get観察の継続(){return this.観察の継続;}
	public void set観察の継続(final String 観察の継続){this.観察の継続=観察の継続;}

	@Length(max=100)
	@JsonProperty
	public String get肝生検有無(){return this.肝生検有無;}
	public void set肝生検有無(final String 肝生検有無){this.肝生検有無=肝生検有無;}

	@Length(max=50)
	@JsonProperty
	public String get初診時年齢(){return this.初診時年齢;}
	public void set初診時年齢(final String 初診時年齢){this.初診時年齢=初診時年齢;}

	@Length(max=100)
	@JsonProperty
	public String getIFN有無(){return this.IFN有無;}
	public void setIFN有無(final String IFN有無){this.IFN有無=IFN有無;}

	@Length(max=100)
	@JsonProperty
	public String get移植有無(){return this.移植有無;}
	public void set移植有無(final String 移植有無){this.移植有無=移植有無;}

	@Length(max=100)
	@JsonProperty
	public String getAlcoholic有無(){return this.Alcoholic有無;}
	public void setAlcoholic有無(final String Alcoholic有無){this.Alcoholic有無=Alcoholic有無;}

	@Length(max=100)
	@JsonProperty
	public String getAIH有無(){return this.AIH有無;}
	public void setAIH有無(final String AIH有無){this.AIH有無=AIH有無;}

	@Length(max=100)
	@JsonProperty
	public String getPBC有無(){return this.PBC有無;}
	public void setPBC有無(final String PBC有無){this.PBC有無=PBC有無;}

	@Length(max=1000)
	@JsonProperty
	public String get併発肝疾患備考(){return this.併発肝疾患備考;}
	public void set併発肝疾患備考(final String 併発肝疾患備考){this.併発肝疾患備考=併発肝疾患備考;}

	@Length(max=100)
	@JsonProperty
	public String getNASH有無(){return this.NASH有無;}
	public void setNASH有無(final String NASH有無){this.NASH有無=NASH有無;}

	@Length(max=100)
	@JsonProperty
	public String getHIV有無(){return this.HIV有無;}
	public void setHIV有無(final String HIV有無){this.HIV有無=HIV有無;}

	@Length(max=100)
	@JsonProperty
	public String get更新終了(){return this.更新終了;}
	public void set更新終了(final String 更新終了){this.更新終了=更新終了;}

	@Length(max=100)
	@JsonProperty
	public String get治療目的(){return this.治療目的;}
	public void set治療目的(final String 治療目的){this.治療目的=治療目的;}

	@Length(max=100)
	@JsonProperty
	public String get再発HCC(){return this.再発HCC;}
	public void set再発HCC(final String 再発HCC){this.再発HCC=再発HCC;}

	@Length(max=50)
	@JsonProperty
	public String get再発日付(){return this.再発日付;}
	public void set再発日付(final String 再発日付){this.再発日付=再発日付;}

	@Length(max=100)
	@JsonProperty
	public String get針治療時年齢(){return this.針治療時年齢;}
	public void set針治療時年齢(final String 針治療時年齢){this.針治療時年齢=針治療時年齢;}

	@Length(max=50)
	@JsonProperty
	public String get刺青年齢(){return this.刺青年齢;}
	public void set刺青年齢(final String 刺青年齢){this.刺青年齢=刺青年齢;}

	@Length(max=100)
	@JsonProperty
	public String get飲酒分類(){return this.飲酒分類;}
	public void set飲酒分類(final String 飲酒分類){this.飲酒分類=飲酒分類;}

	@Length(max=100)
	@JsonProperty
	public String get飲酒内容(){return this.飲酒内容;}
	public void set飲酒内容(final String 飲酒内容){this.飲酒内容=飲酒内容;}

	@Length(max=100)
	@JsonProperty
	public String get飲酒歴詳細(){return this.飲酒歴詳細;}
	public void set飲酒歴詳細(final String 飲酒歴詳細){this.飲酒歴詳細=飲酒歴詳細;}

	@Length(max=100)
	@JsonProperty
	public String get副外来主治医(){return this.副外来主治医;}
	public void set副外来主治医(final String 副外来主治医){this.副外来主治医=副外来主治医;}

	@Length(max=50)
	@JsonProperty
	public String get副観察開始日(){return this.副観察開始日;}
	public void set副観察開始日(final String 副観察開始日){this.副観察開始日=副観察開始日;}

	@Length(max=1000)
	@JsonProperty
	public String get輸血歴備考(){return this.輸血歴備考;}
	public void set輸血歴備考(final String 輸血歴備考){this.輸血歴備考=輸血歴備考;}

	@Length(max=100)
	@JsonProperty
	public String getHCVAb(){return this.HCVAb;}
	public void setHCVAb(final String HCVAb){this.HCVAb=HCVAb;}

	@Length(max=1000)
	@JsonProperty
	public String get転機備考(){return this.転機備考;}
	public void set転機備考(final String 転機備考){this.転機備考=転機備考;}

	@Length(max=100)
	@JsonProperty
	public String getChemo種類(){return this.chemo種類;}
	public void setChemo種類(final String chemo種類){this.chemo種類=chemo種類;}

	@Length(max=1000)
	@JsonProperty
	public String getHCC治療備考(){return this.HCC治療備考;}
	public void setHCC治療備考(final String HCC治療備考){this.HCC治療備考=HCC治療備考;}

	@Length(max=100)
	@JsonProperty
	public String get最終更新日における診断(){return this.最終更新日における診断;}
	public void set最終更新日における診断(final String 最終更新日における診断){this.最終更新日における診断=最終更新日における診断;}

	@Length(max=50)
	@JsonProperty
	public String get診断変更日1(){return this.診断変更日1;}
	public void set診断変更日1(final String 診断変更日1){this.診断変更日1=診断変更日1;}

	@Length(max=50)
	@JsonProperty
	public String get診断変更日2(){return this.診断変更日2;}
	public void set診断変更日2(final String 診断変更日2){this.診断変更日2=診断変更日2;}

	@Length(max=100)
	@JsonProperty
	public String get変更後の診断1(){return this.変更後の診断1;}
	public void set変更後の診断1(final String 変更後の診断1){this.変更後の診断1=変更後の診断1;}

	@Length(max=100)
	@JsonProperty
	public String get変更後の診断2(){return this.変更後の診断2;}
	public void set変更後の診断2(final String 変更後の診断2){this.変更後の診断2=変更後の診断2;}

	@Length(max=100)
	@JsonProperty
	public String get最終更新日におけるHCCの有無(){return this.最終更新日におけるHCCの有無;}
	public void set最終更新日におけるHCCの有無(final String 最終更新日におけるHCCの有無){this.最終更新日におけるHCCの有無=最終更新日におけるHCCの有無;}

	@Length(max=100)
	@JsonProperty
	public String getSNP有check(){return this.SNP有check;}
	public void setSNP有check(final String SNP有check){this.SNP有check=SNP有check;}

	@JsonProperty
	public Integer getSNP匿名化No(){return this.SNP匿名化No;}
	public void setSNP匿名化No(final Integer SNP匿名化No){this.SNP匿名化No=SNP匿名化No;}

	@Length(max=50)
	@JsonProperty
	public String getSNP採血日(){return this.SNP採血日;}
	public void setSNP採血日(final String SNP採血日){this.SNP採血日=SNP採血日;}

	@Length(max=100)
	@JsonProperty
	public String getPlt(){return this.Plt;}
	public void setPlt(final String Plt){this.Plt=Plt;}

	@Length(max=100)
	@JsonProperty
	public String getAST(){return this.AST;}
	public void setAST(final String AST){this.AST=AST;}

	@Length(max=100)
	@JsonProperty
	public String getALT(){return this.ALT;}
	public void setALT(final String ALT){this.ALT=ALT;}

	@Length(max=100)
	@JsonProperty
	public String getHBV有無(){return this.HBV有無;}
	public void setHBV有無(final String HBV有無){this.HBV有無=HBV有無;}

	@Length(max=100)
	@JsonProperty
	public String getHCC治療因子(){return this.HCC治療因子;}
	public void setHCC治療因子(final String HCC治療因子){this.HCC治療因子=HCC治療因子;}

	@Length(max=100)
	@JsonProperty
	public String getDMｺﾝﾄﾛｰﾙ(){return this.DMｺﾝﾄﾛｰﾙ;}
	public void setDMｺﾝﾄﾛｰﾙ(final String DMｺﾝﾄﾛｰﾙ){this.DMｺﾝﾄﾛｰﾙ=DMｺﾝﾄﾛｰﾙ;}

	@Length(max=100)
	@JsonProperty
	public String getType(){return this.type;}
	public void setType(final String type){this.type=type;}

	@Length(max=100)
	@JsonProperty
	public String getWbc(){return this.wbc;}
	public void setWbc(final String wbc){this.wbc=wbc;}

	@Length(max=100)
	@JsonProperty
	public String getHb(){return this.Hb;}
	public void setHb(final String Hb){this.Hb=Hb;}

	@Length(max=100)
	@JsonProperty
	public String getPT(){return this.PT;}
	public void setPT(final String PT){this.PT=PT;}

	@Length(max=100)
	@JsonProperty
	public String getTB(){return this.TB;}
	public void setTB(final String TB){this.TB=TB;}

	@Length(max=100)
	@JsonProperty
	public String getAlb(){return this.Alb;}
	public void setAlb(final String Alb){this.Alb=Alb;}

	@Length(max=100)
	@JsonProperty
	public String getCr(){return this.Cr;}
	public void setCr(final String Cr){this.Cr=Cr;}

	@Length(max=100)
	@JsonProperty
	public String getﾋｱﾙﾛﾝ酸(){return this.ﾋｱﾙﾛﾝ酸;}
	public void setﾋｱﾙﾛﾝ酸(final String ﾋｱﾙﾛﾝ酸){this.ﾋｱﾙﾛﾝ酸=ﾋｱﾙﾛﾝ酸;}

	@Length(max=100)
	@JsonProperty
	public String getGammagloblin(){return this.gammagloblin;}
	public void setGammagloblin(final String gammagloblin){this.gammagloblin=gammagloblin;}

	@Length(max=100)
	@JsonProperty
	public String getGammaGTP(){return this.gammaGTP;}
	public void setGammaGTP(final String gammaGTP){this.gammaGTP=gammaGTP;}

	@Length(max=100)
	@JsonProperty
	public String getFe(){return this.Fe;}
	public void setFe(final String Fe){this.Fe=Fe;}

	@Length(max=100)
	@JsonProperty
	public String getUIBC(){return this.UIBC;}
	public void setUIBC(final String UIBC){this.UIBC=UIBC;}

	@Length(max=100)
	@JsonProperty
	public String getAFP(){return this.AFP;}
	public void setAFP(final String AFP){this.AFP=AFP;}

	@Length(max=100)
	@JsonProperty
	public String getﾌｪﾘﾁﾝ(){return this.ﾌｪﾘﾁﾝ;}
	public void setﾌｪﾘﾁﾝ(final String ﾌｪﾘﾁﾝ){this.ﾌｪﾘﾁﾝ=ﾌｪﾘﾁﾝ;}

	@Length(max=100)
	@JsonProperty
	public String getANA(){return this.ANA;}
	public void setANA(final String ANA){this.ANA=ANA;}

	@Length(max=100)
	@JsonProperty
	public String getM2分画(){return this.M2分画;}
	public void setM2分画(final String M2分画){this.M2分画=M2分画;}

	@Length(max=100)
	@JsonProperty
	public String getHCVRNA量(){return this.HCVRNA量;}
	public void setHCVRNA量(final String HCVRNA量){this.HCVRNA量=HCVRNA量;}

	@Length(max=100)
	@JsonProperty
	public String getHbA1C(){return this.HbA1C;}
	public void setHbA1C(final String HbA1C){this.HbA1C=HbA1C;}

	@Length(max=100)
	@JsonProperty
	public String getFBS(){return this.FBS;}
	public void setFBS(final String FBS){this.FBS=FBS;}

	@Length(max=100)
	@JsonProperty
	public String getIRI(){return this.IRI;}
	public void setIRI(final String IRI){this.IRI=IRI;}

	@Length(max=100)
	@JsonProperty
	public String getTC(){return this.TC;}
	public void setTC(final String TC){this.TC=TC;}

	@Length(max=100)
	@JsonProperty
	public String getTG(){return this.TG;}
	public void setTG(final String TG){this.TG=TG;}

	@Length(max=100)
	@JsonProperty
	public String getHDL(){return this.HDL;}
	public void setHDL(final String HDL){this.HDL=HDL;}

	@Length(max=100)
	@JsonProperty
	public String getHCVRNA検査法(){return this.HCVRNA検査法;}
	public void setHCVRNA検査法(final String HCVRNA検査法){this.HCVRNA検査法=HCVRNA検査法;}

	@Length(max=100)
	@JsonProperty
	public String getHCCファイルNo(){return this.HCCファイルNo;}
	public void setHCCファイルNo(final String HCCファイルNo){this.HCCファイルNo=HCCファイルNo;}

	@Length(max=100)
	@JsonProperty
	public String getIFN以外の治療有無(){return this.IFN以外の治療有無;}
	public void setIFN以外の治療有無(final String IFN以外の治療有無){this.IFN以外の治療有無=IFN以外の治療有無;}

	@Length(max=100)
	@JsonProperty
	public String getIFN以外の治療詳細(){return this.IFN以外の治療詳細;}
	public void setIFN以外の治療詳細(final String IFN以外の治療詳細){this.IFN以外の治療詳細=IFN以外の治療詳細;}

	@Length(max=100)
	@JsonProperty
	public String get脾摘有無(){return this.脾摘有無;}
	public void set脾摘有無(final String 脾摘有無){this.脾摘有無=脾摘有無;}

	@Length(max=100)
	@JsonProperty
	public String getVarix有無(){return this.Varix有無;}
	public void setVarix有無(final String Varix有無){this.Varix有無=Varix有無;}

	@Length(max=100)
	@JsonProperty
	public String get腹水有無(){return this.腹水有無;}
	public void set腹水有無(final String 腹水有無){this.腹水有無=腹水有無;}

	@Length(max=100)
	@JsonProperty
	public String get二度の肝性脳症有無(){return this.二度の肝性脳症有無;}
	public void set二度の肝性脳症有無(final String 二度の肝性脳症有無){this.二度の肝性脳症有無=二度の肝性脳症有無;}

	@Length(max=100)
	@JsonProperty
	public String get肝硬変の簡易式の値(){return this.肝硬変の簡易式の値;}
	public void set肝硬変の簡易式の値(final String 肝硬変の簡易式の値){this.肝硬変の簡易式の値=肝硬変の簡易式の値;}

	@Length(max=100)
	@JsonProperty
	public String getHCVcoreAb(){return this.HCVcoreAb;}
	public void setHCVcoreAb(final String HCVcoreAb){this.HCVcoreAb=HCVcoreAb;}

	@Length(max=100)
	@JsonProperty
	public String getHOMAIRscore(){return this.HOMAIRscore;}
	public void setHOMAIRscore(final String HOMAIRscore){this.HOMAIRscore=HOMAIRscore;}

	@Length(max=100)
	@JsonProperty
	public String getｱﾙｺｰﾙ積算量(){return this.ｱﾙｺｰﾙ積算量;}
	public void setｱﾙｺｰﾙ積算量(final String ｱﾙｺｰﾙ積算量){this.ｱﾙｺｰﾙ積算量=ｱﾙｺｰﾙ積算量;}

	@Length(max=50)
	@JsonProperty
	public String get初診時合併症Varix診断日(){return this.初診時合併症Varix診断日;}
	public void set初診時合併症Varix診断日(final String 初診時合併症Varix診断日){this.初診時合併症Varix診断日=初診時合併症Varix診断日;}

	@Length(max=50)
	@JsonProperty
	public String get初診時合併症腹水診断日(){return this.初診時合併症腹水診断日;}
	public void set初診時合併症腹水診断日(final String 初診時合併症腹水診断日){this.初診時合併症腹水診断日=初診時合併症腹水診断日;}

	@Length(max=50)
	@JsonProperty
	public String get初診時合併症2度の肝性脳症診断日(){return this.初診時合併症2度の肝性脳症診断日;}
	public void set初診時合併症2度の肝性脳症診断日(final String 初診時合併症2度の肝性脳症診断日){this.初診時合併症2度の肝性脳症診断日=初診時合併症2度の肝性脳症診断日;}

	@Length(max=100)
	@JsonProperty
	public String get合併症Varix出現の有無(){return this.合併症Varix出現の有無;}
	public void set合併症Varix出現の有無(final String 合併症Varix出現の有無){this.合併症Varix出現の有無=合併症Varix出現の有無;}

	@Length(max=100)
	@JsonProperty
	public String get合併症腹水出現の有無(){return this.合併症腹水出現の有無;}
	public void set合併症腹水出現の有無(final String 合併症腹水出現の有無){this.合併症腹水出現の有無=合併症腹水出現の有無;}

	@Length(max=100)
	@JsonProperty
	public String get合併症2度の肝性脳症出現の有無(){return this.合併症2度の肝性脳症出現の有無;}
	public void set合併症2度の肝性脳症出現の有無(final String 合併症2度の肝性脳症出現の有無){this.合併症2度の肝性脳症出現の有無=合併症2度の肝性脳症出現の有無;}

	@Length(max=50)
	@JsonProperty
	public String get合併症出現Varix診断日(){return this.合併症出現Varix診断日;}
	public void set合併症出現Varix診断日(final String 合併症出現Varix診断日){this.合併症出現Varix診断日=合併症出現Varix診断日;}

	@Length(max=50)
	@JsonProperty
	public String get合併症出現腹水診断日(){return this.合併症出現腹水診断日;}
	public void set合併症出現腹水診断日(final String 合併症出現腹水診断日){this.合併症出現腹水診断日=合併症出現腹水診断日;}

	@Length(max=50)
	@JsonProperty
	public String get合併症出現2度の肝性脳症診断日(){return this.合併症出現2度の肝性脳症診断日;}
	public void set合併症出現2度の肝性脳症診断日(final String 合併症出現2度の肝性脳症診断日){this.合併症出現2度の肝性脳症診断日=合併症出現2度の肝性脳症診断日;}

	@Length(max=50)
	@JsonProperty
	public String get初診時合併症移植診断日(){return this.初診時合併症移植診断日;}
	public void set初診時合併症移植診断日(final String 初診時合併症移植診断日){this.初診時合併症移植診断日=初診時合併症移植診断日;}

	@Length(max=50)
	@JsonProperty
	public String get初診時合併症脾摘診断日(){return this.初診時合併症脾摘診断日;}
	public void set初診時合併症脾摘診断日(final String 初診時合併症脾摘診断日){this.初診時合併症脾摘診断日=初診時合併症脾摘診断日;}

	@Length(max=50)
	@JsonProperty
	public String get合併症出現移植診断日(){return this.合併症出現移植診断日;}
	public void set合併症出現移植診断日(final String 合併症出現移植診断日){this.合併症出現移植診断日=合併症出現移植診断日;}

	@Length(max=50)
	@JsonProperty
	public String get合併症出現脾摘診断日(){return this.合併症出現脾摘診断日;}
	public void set合併症出現脾摘診断日(final String 合併症出現脾摘診断日){this.合併症出現脾摘診断日=合併症出現脾摘診断日;}

	@Length(max=100)
	@JsonProperty
	public String get合併症移植出現の有無(){return this.合併症移植出現の有無;}
	public void set合併症移植出現の有無(final String 合併症移植出現の有無){this.合併症移植出現の有無=合併症移植出現の有無;}

	@Length(max=100)
	@JsonProperty
	public String get合併症脾摘出現の有無(){return this.合併症脾摘出現の有無;}
	public void set合併症脾摘出現の有無(final String 合併症脾摘出現の有無){this.合併症脾摘出現の有無=合併症脾摘出現の有無;}

	@Length(max=100)
	@JsonProperty
	public String getHCVcore70(){return this.HCVcore70;}
	public void setHCVcore70(final String HCVcore70){this.HCVcore70=HCVcore70;}

	@Length(max=100)
	@JsonProperty
	public String getHCVcore90(){return this.HCVcore90;}
	public void setHCVcore90(final String HCVcore90){this.HCVcore90=HCVcore90;}

	@Length(max=100)
	@JsonProperty
	public String getHCVcoreISDR(){return this.HCVcoreISDR;}
	public void setHCVcoreISDR(final String HCVcoreISDR){this.HCVcoreISDR=HCVcoreISDR;}

	@Length(max=50)
	@JsonProperty
	public String getHCVcore検査日(){return this.HCVcore検査日;}
	public void setHCVcore検査日(final String HCVcore検査日){this.HCVcore検査日=HCVcore検査日;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類1(){return this.Tx種類1;}
	public void setTx種類1(final String Tx種類1){this.Tx種類1=Tx種類1;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類2(){return this.Tx種類2;}
	public void setTx種類2(final String Tx種類2){this.Tx種類2=Tx種類2;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類3(){return this.Tx種類3;}
	public void setTx種類3(final String Tx種類3){this.Tx種類3=Tx種類3;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類4(){return this.Tx種類4;}
	public void setTx種類4(final String Tx種類4){this.Tx種類4=Tx種類4;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類5(){return this.Tx種類5;}
	public void setTx種類5(final String Tx種類5){this.Tx種類5=Tx種類5;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類6(){return this.Tx種類6;}
	public void setTx種類6(final String Tx種類6){this.Tx種類6=Tx種類6;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類7(){return this.Tx種類7;}
	public void setTx種類7(final String Tx種類7){this.Tx種類7=Tx種類7;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類8(){return this.Tx種類8;}
	public void setTx種類8(final String Tx種類8){this.Tx種類8=Tx種類8;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類9(){return this.Tx種類9;}
	public void setTx種類9(final String Tx種類9){this.Tx種類9=Tx種類9;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類10(){return this.Tx種類10;}
	public void setTx種類10(final String Tx種類10){this.Tx種類10=Tx種類10;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日1(){return this.治療開始日1;}
	public void set治療開始日1(final String 治療開始日1){this.治療開始日1=治療開始日1;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日2(){return this.治療開始日2;}
	public void set治療開始日2(final String 治療開始日2){this.治療開始日2=治療開始日2;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日3(){return this.治療開始日3;}
	public void set治療開始日3(final String 治療開始日3){this.治療開始日3=治療開始日3;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日4(){return this.治療開始日4;}
	public void set治療開始日4(final String 治療開始日4){this.治療開始日4=治療開始日4;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日5(){return this.治療開始日5;}
	public void set治療開始日5(final String 治療開始日5){this.治療開始日5=治療開始日5;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日6(){return this.治療開始日6;}
	public void set治療開始日6(final String 治療開始日6){this.治療開始日6=治療開始日6;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日7(){return this.治療開始日7;}
	public void set治療開始日7(final String 治療開始日7){this.治療開始日7=治療開始日7;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日8(){return this.治療開始日8;}
	public void set治療開始日8(final String 治療開始日8){this.治療開始日8=治療開始日8;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日9(){return this.治療開始日9;}
	public void set治療開始日9(final String 治療開始日9){this.治療開始日9=治療開始日9;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日10(){return this.治療開始日10;}
	public void set治療開始日10(final String 治療開始日10){this.治療開始日10=治療開始日10;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日1(){return this.治療終了日1;}
	public void set治療終了日1(final String 治療終了日1){this.治療終了日1=治療終了日1;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日2(){return this.治療終了日2;}
	public void set治療終了日2(final String 治療終了日2){this.治療終了日2=治療終了日2;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日3(){return this.治療終了日3;}
	public void set治療終了日3(final String 治療終了日3){this.治療終了日3=治療終了日3;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日4(){return this.治療終了日4;}
	public void set治療終了日4(final String 治療終了日4){this.治療終了日4=治療終了日4;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日5(){return this.治療終了日5;}
	public void set治療終了日5(final String 治療終了日5){this.治療終了日5=治療終了日5;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日6(){return this.治療終了日6;}
	public void set治療終了日6(final String 治療終了日6){this.治療終了日6=治療終了日6;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日7(){return this.治療終了日7;}
	public void set治療終了日7(final String 治療終了日7){this.治療終了日7=治療終了日7;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日8(){return this.治療終了日8;}
	public void set治療終了日8(final String 治療終了日8){this.治療終了日8=治療終了日8;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日9(){return this.治療終了日9;}
	public void set治療終了日9(final String 治療終了日9){this.治療終了日9=治療終了日9;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日10(){return this.治療終了日10;}
	public void set治療終了日10(final String 治療終了日10){this.治療終了日10=治療終了日10;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果1(){return this.治療効果1;}
	public void set治療効果1(final String 治療効果1){this.治療効果1=治療効果1;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果2(){return this.治療効果2;}
	public void set治療効果2(final String 治療効果2){this.治療効果2=治療効果2;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果3(){return this.治療効果3;}
	public void set治療効果3(final String 治療効果3){this.治療効果3=治療効果3;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果4(){return this.治療効果4;}
	public void set治療効果4(final String 治療効果4){this.治療効果4=治療効果4;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果5(){return this.治療効果5;}
	public void set治療効果5(final String 治療効果5){this.治療効果5=治療効果5;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果6(){return this.治療効果6;}
	public void set治療効果6(final String 治療効果6){this.治療効果6=治療効果6;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果7(){return this.治療効果7;}
	public void set治療効果7(final String 治療効果7){this.治療効果7=治療効果7;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果8(){return this.治療効果8;}
	public void set治療効果8(final String 治療効果8){this.治療効果8=治療効果8;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果9(){return this.治療効果9;}
	public void set治療効果9(final String 治療効果9){this.治療効果9=治療効果9;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果10(){return this.治療効果10;}
	public void set治療効果10(final String 治療効果10){this.治療効果10=治療効果10;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考1(){return this.治療備考1;}
	public void set治療備考1(final String 治療備考1){this.治療備考1=治療備考1;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考2(){return this.治療備考2;}
	public void set治療備考2(final String 治療備考2){this.治療備考2=治療備考2;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考3(){return this.治療備考3;}
	public void set治療備考3(final String 治療備考3){this.治療備考3=治療備考3;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考4(){return this.治療備考4;}
	public void set治療備考4(final String 治療備考4){this.治療備考4=治療備考4;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考5(){return this.治療備考5;}
	public void set治療備考5(final String 治療備考5){this.治療備考5=治療備考5;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考6(){return this.治療備考6;}
	public void set治療備考6(final String 治療備考6){this.治療備考6=治療備考6;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考7(){return this.治療備考7;}
	public void set治療備考7(final String 治療備考7){this.治療備考7=治療備考7;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考8(){return this.治療備考8;}
	public void set治療備考8(final String 治療備考8){this.治療備考8=治療備考8;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考9(){return this.治療備考9;}
	public void set治療備考9(final String 治療備考9){this.治療備考9=治療備考9;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考10(){return this.治療備考10;}
	public void set治療備考10(final String 治療備考10){this.治療備考10=治療備考10;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN1(){return this.治療容量IFN1;}
	public void set治療容量IFN1(final String 治療容量IFN1){this.治療容量IFN1=治療容量IFN1;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN2(){return this.治療容量IFN2;}
	public void set治療容量IFN2(final String 治療容量IFN2){this.治療容量IFN2=治療容量IFN2;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN3(){return this.治療容量IFN3;}
	public void set治療容量IFN3(final String 治療容量IFN3){this.治療容量IFN3=治療容量IFN3;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN4(){return this.治療容量IFN4;}
	public void set治療容量IFN4(final String 治療容量IFN4){this.治療容量IFN4=治療容量IFN4;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN5(){return this.治療容量IFN5;}
	public void set治療容量IFN5(final String 治療容量IFN5){this.治療容量IFN5=治療容量IFN5;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN6(){return this.治療容量IFN6;}
	public void set治療容量IFN6(final String 治療容量IFN6){this.治療容量IFN6=治療容量IFN6;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN7(){return this.治療容量IFN7;}
	public void set治療容量IFN7(final String 治療容量IFN7){this.治療容量IFN7=治療容量IFN7;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN8(){return this.治療容量IFN8;}
	public void set治療容量IFN8(final String 治療容量IFN8){this.治療容量IFN8=治療容量IFN8;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN9(){return this.治療容量IFN9;}
	public void set治療容量IFN9(final String 治療容量IFN9){this.治療容量IFN9=治療容量IFN9;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量IFN10(){return this.治療容量IFN10;}
	public void set治療容量IFN10(final String 治療容量IFN10){this.治療容量IFN10=治療容量IFN10;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV1(){return this.治療容量RBV1;}
	public void set治療容量RBV1(final String 治療容量RBV1){this.治療容量RBV1=治療容量RBV1;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV2(){return this.治療容量RBV2;}
	public void set治療容量RBV2(final String 治療容量RBV2){this.治療容量RBV2=治療容量RBV2;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV3(){return this.治療容量RBV3;}
	public void set治療容量RBV3(final String 治療容量RBV3){this.治療容量RBV3=治療容量RBV3;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV4(){return this.治療容量RBV4;}
	public void set治療容量RBV4(final String 治療容量RBV4){this.治療容量RBV4=治療容量RBV4;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV5(){return this.治療容量RBV5;}
	public void set治療容量RBV5(final String 治療容量RBV5){this.治療容量RBV5=治療容量RBV5;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV6(){return this.治療容量RBV6;}
	public void set治療容量RBV6(final String 治療容量RBV6){this.治療容量RBV6=治療容量RBV6;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV7(){return this.治療容量RBV7;}
	public void set治療容量RBV7(final String 治療容量RBV7){this.治療容量RBV7=治療容量RBV7;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV8(){return this.治療容量RBV8;}
	public void set治療容量RBV8(final String 治療容量RBV8){this.治療容量RBV8=治療容量RBV8;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV9(){return this.治療容量RBV9;}
	public void set治療容量RBV9(final String 治療容量RBV9){this.治療容量RBV9=治療容量RBV9;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量RBV10(){return this.治療容量RBV10;}
	public void set治療容量RBV10(final String 治療容量RBV10){this.治療容量RBV10=治療容量RBV10;}

	@Length(max=101)
	@JsonProperty
	public String getIFN期間1(){return this.IFN期間1;}
	public void setIFN期間1(final String IFN期間1){this.IFN期間1=IFN期間1;}

	@Length(max=102)
	@JsonProperty
	public String getIFN期間2(){return this.IFN期間2;}
	public void setIFN期間2(final String IFN期間2){this.IFN期間2=IFN期間2;}

	@Length(max=103)
	@JsonProperty
	public String getIFN期間3(){return this.IFN期間3;}
	public void setIFN期間3(final String IFN期間3){this.IFN期間3=IFN期間3;}

	@Length(max=104)
	@JsonProperty
	public String getIFN期間4(){return this.IFN期間4;}
	public void setIFN期間4(final String IFN期間4){this.IFN期間4=IFN期間4;}

	@Length(max=105)
	@JsonProperty
	public String getIFN期間5(){return this.IFN期間5;}
	public void setIFN期間5(final String IFN期間5){this.IFN期間5=IFN期間5;}

	@Length(max=106)
	@JsonProperty
	public String getIFN期間6(){return this.IFN期間6;}
	public void setIFN期間6(final String IFN期間6){this.IFN期間6=IFN期間6;}

	@Length(max=107)
	@JsonProperty
	public String getIFN期間7(){return this.IFN期間7;}
	public void setIFN期間7(final String IFN期間7){this.IFN期間7=IFN期間7;}

	@Length(max=108)
	@JsonProperty
	public String getIFN期間8(){return this.IFN期間8;}
	public void setIFN期間8(final String IFN期間8){this.IFN期間8=IFN期間8;}

	@Length(max=109)
	@JsonProperty
	public String getIFN期間9(){return this.IFN期間9;}
	public void setIFN期間9(final String IFN期間9){this.IFN期間9=IFN期間9;}

	@Length(max=110)
	@JsonProperty
	public String getIFN期間10(){return this.IFN期間10;}
	public void setIFN期間10(final String IFN期間10){this.IFN期間10=IFN期間10;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx1(){return this.肝生検施行日Bx1;}
	public void set肝生検施行日Bx1(final String 肝生検施行日Bx1){this.肝生検施行日Bx1=肝生検施行日Bx1;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx2(){return this.肝生検施行日Bx2;}
	public void set肝生検施行日Bx2(final String 肝生検施行日Bx2){this.肝生検施行日Bx2=肝生検施行日Bx2;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx3(){return this.肝生検施行日Bx3;}
	public void set肝生検施行日Bx3(final String 肝生検施行日Bx3){this.肝生検施行日Bx3=肝生検施行日Bx3;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx4(){return this.肝生検施行日Bx4;}
	public void set肝生検施行日Bx4(final String 肝生検施行日Bx4){this.肝生検施行日Bx4=肝生検施行日Bx4;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx5(){return this.肝生検施行日Bx5;}
	public void set肝生検施行日Bx5(final String 肝生検施行日Bx5){this.肝生検施行日Bx5=肝生検施行日Bx5;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx6(){return this.肝生検施行日Bx6;}
	public void set肝生検施行日Bx6(final String 肝生検施行日Bx6){this.肝生検施行日Bx6=肝生検施行日Bx6;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx7(){return this.肝生検施行日Bx7;}
	public void set肝生検施行日Bx7(final String 肝生検施行日Bx7){this.肝生検施行日Bx7=肝生検施行日Bx7;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx8(){return this.肝生検施行日Bx8;}
	public void set肝生検施行日Bx8(final String 肝生検施行日Bx8){this.肝生検施行日Bx8=肝生検施行日Bx8;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx9(){return this.肝生検施行日Bx9;}
	public void set肝生検施行日Bx9(final String 肝生検施行日Bx9){this.肝生検施行日Bx9=肝生検施行日Bx9;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検施行日Bx10(){return this.肝生検施行日Bx10;}
	public void set肝生検施行日Bx10(final String 肝生検施行日Bx10){this.肝生検施行日Bx10=肝生検施行日Bx10;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx1(){return this.肝生検備考Bx1;}
	public void set肝生検備考Bx1(final String 肝生検備考Bx1){this.肝生検備考Bx1=肝生検備考Bx1;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx3(){return this.肝生検備考Bx3;}
	public void set肝生検備考Bx3(final String 肝生検備考Bx3){this.肝生検備考Bx3=肝生検備考Bx3;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx2(){return this.肝生検備考Bx2;}
	public void set肝生検備考Bx2(final String 肝生検備考Bx2){this.肝生検備考Bx2=肝生検備考Bx2;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx4(){return this.肝生検備考Bx4;}
	public void set肝生検備考Bx4(final String 肝生検備考Bx4){this.肝生検備考Bx4=肝生検備考Bx4;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx5(){return this.肝生検備考Bx5;}
	public void set肝生検備考Bx5(final String 肝生検備考Bx5){this.肝生検備考Bx5=肝生検備考Bx5;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx6(){return this.肝生検備考Bx6;}
	public void set肝生検備考Bx6(final String 肝生検備考Bx6){this.肝生検備考Bx6=肝生検備考Bx6;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx7(){return this.肝生検備考Bx7;}
	public void set肝生検備考Bx7(final String 肝生検備考Bx7){this.肝生検備考Bx7=肝生検備考Bx7;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx8(){return this.肝生検備考Bx8;}
	public void set肝生検備考Bx8(final String 肝生検備考Bx8){this.肝生検備考Bx8=肝生検備考Bx8;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx9(){return this.肝生検備考Bx9;}
	public void set肝生検備考Bx9(final String 肝生検備考Bx9){this.肝生検備考Bx9=肝生検備考Bx9;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx10(){return this.肝生検備考Bx10;}
	public void set肝生検備考Bx10(final String 肝生検備考Bx10){this.肝生検備考Bx10=肝生検備考Bx10;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx1(){return this.fibrosisBx1;}
	public void setFibrosisBx1(final String fibrosisBx1){this.fibrosisBx1=fibrosisBx1;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx2(){return this.fibrosisBx2;}
	public void setFibrosisBx2(final String fibrosisBx2){this.fibrosisBx2=fibrosisBx2;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx3(){return this.fibrosisBx3;}
	public void setFibrosisBx3(final String fibrosisBx3){this.fibrosisBx3=fibrosisBx3;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx4(){return this.fibrosisBx4;}
	public void setFibrosisBx4(final String fibrosisBx4){this.fibrosisBx4=fibrosisBx4;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx5(){return this.fibrosisBx5;}
	public void setFibrosisBx5(final String fibrosisBx5){this.fibrosisBx5=fibrosisBx5;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx6(){return this.fibrosisBx6;}
	public void setFibrosisBx6(final String fibrosisBx6){this.fibrosisBx6=fibrosisBx6;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx7(){return this.fibrosisBx7;}
	public void setFibrosisBx7(final String fibrosisBx7){this.fibrosisBx7=fibrosisBx7;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx8(){return this.fibrosisBx8;}
	public void setFibrosisBx8(final String fibrosisBx8){this.fibrosisBx8=fibrosisBx8;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx9(){return this.fibrosisBx9;}
	public void setFibrosisBx9(final String fibrosisBx9){this.fibrosisBx9=fibrosisBx9;}

	@Length(max=100)
	@JsonProperty
	public String getFibrosisBx10(){return this.fibrosisBx10;}
	public void setFibrosisBx10(final String fibrosisBx10){this.fibrosisBx10=fibrosisBx10;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx1(){return this.activityBx1;}
	public void setActivityBx1(final String activityBx1){this.activityBx1=activityBx1;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx2(){return this.activityBx2;}
	public void setActivityBx2(final String activityBx2){this.activityBx2=activityBx2;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx3(){return this.activityBx3;}
	public void setActivityBx3(final String activityBx3){this.activityBx3=activityBx3;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx4(){return this.activityBx4;}
	public void setActivityBx4(final String activityBx4){this.activityBx4=activityBx4;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx5(){return this.activityBx5;}
	public void setActivityBx5(final String activityBx5){this.activityBx5=activityBx5;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx6(){return this.activityBx6;}
	public void setActivityBx6(final String activityBx6){this.activityBx6=activityBx6;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx7(){return this.activityBx7;}
	public void setActivityBx7(final String activityBx7){this.activityBx7=activityBx7;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx8(){return this.activityBx8;}
	public void setActivityBx8(final String activityBx8){this.activityBx8=activityBx8;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx9(){return this.activityBx9;}
	public void setActivityBx9(final String activityBx9){this.activityBx9=activityBx9;}

	@Length(max=100)
	@JsonProperty
	public String getActivityBx10(){return this.activityBx10;}
	public void setActivityBx10(final String activityBx10){this.activityBx10=activityBx10;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx1(){return this.HAIscoreBx1;}
	public void setHAIscoreBx1(final String HAIscoreBx1){this.HAIscoreBx1=HAIscoreBx1;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx2(){return this.HAIscoreBx2;}
	public void setHAIscoreBx2(final String HAIscoreBx2){this.HAIscoreBx2=HAIscoreBx2;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx3(){return this.HAIscoreBx3;}
	public void setHAIscoreBx3(final String HAIscoreBx3){this.HAIscoreBx3=HAIscoreBx3;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx4(){return this.HAIscoreBx4;}
	public void setHAIscoreBx4(final String HAIscoreBx4){this.HAIscoreBx4=HAIscoreBx4;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx5(){return this.HAIscoreBx5;}
	public void setHAIscoreBx5(final String HAIscoreBx5){this.HAIscoreBx5=HAIscoreBx5;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx6(){return this.HAIscoreBx6;}
	public void setHAIscoreBx6(final String HAIscoreBx6){this.HAIscoreBx6=HAIscoreBx6;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx7(){return this.HAIscoreBx7;}
	public void setHAIscoreBx7(final String HAIscoreBx7){this.HAIscoreBx7=HAIscoreBx7;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx8(){return this.HAIscoreBx8;}
	public void setHAIscoreBx8(final String HAIscoreBx8){this.HAIscoreBx8=HAIscoreBx8;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx9(){return this.HAIscoreBx9;}
	public void setHAIscoreBx9(final String HAIscoreBx9){this.HAIscoreBx9=HAIscoreBx9;}

	@Length(max=100)
	@JsonProperty
	public String getHAIscoreBx10(){return this.HAIscoreBx10;}
	public void setHAIscoreBx10(final String HAIscoreBx10){this.HAIscoreBx10=HAIscoreBx10;}

	public FmHcvPatient(){}
	
	public FmHcvPatient(int rowID)
	{
		super(rowID);
	}
	
	@Id
	public Integer getRowID(){return this.rowID;}
}