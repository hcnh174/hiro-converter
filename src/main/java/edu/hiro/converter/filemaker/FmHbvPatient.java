package edu.hiro.converter.filemaker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="fmhbv")
public class FmHbvPatient extends AbstractFmPatient
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
	protected Float BMI=null;
	protected String 輸血時年齢=null;
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
	protected String 初診時年齢=null;
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
	protected String CyA有無="";
	protected String genoAB="";
	protected String HBcAbx200="";
	protected String HBeAb="";
	protected String HBeAg="";
	protected String HBVDVA="";
	protected String HCV有無="";
	protected String IFN核酸アナログ併用="";
	protected String IgMHBcAb="";
	protected String NA種類="";
	protected String ヘモクロマトーシス有無="";
	protected String 再発時核酸アナログの投与有無="";
	protected String 各ファイルAH="";
	protected String 各ファイルHCC="";
	protected String 各ファイル核酸アナログ="";
	protected String 各ファイル移植・肝不全="";
	protected String 急性増悪="";
	protected String 核アBreakthroughHepatitis年月日=null;
	protected String 核アBreakthroughHepatitis有無="";
	protected String 核アBreakthrough年月日=null;
	protected String 核アBreakthrough有無="";
	protected String 核アYMDDmutant測定年月日=null;
	protected String 核アYMDDmutant結果="";
	protected String 核ア治療継続有無="";
	protected String 核ア終了年月日=null;
	protected String 核ア開始年月日=null;
	protected String 核ア開始目的="";
	protected String 核酸アナログ有無="";
	protected String 核酸アナログ開始時HCC有無="";
	protected String 核酸アナログ開始時HCC無の場合="";
	protected String 核酸短期有無="";
	protected String 核酸短期有無NA種類="";
	protected String 核酸長期有無="";
	protected String 核酸長期有無NA種類="";
	protected String 検査法="";
	protected String 治療因子="";
	protected String 治療歴No1="";
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
	protected String Tx種類11="";
	protected String Tx種類12="";
	protected String Tx種類13="";
	protected String Tx種類14="";
	protected String Tx種類15="";
	protected String 治療容量1="";
	protected String 治療容量2="";
	protected String 治療容量3="";
	protected String 治療容量4="";
	protected String 治療容量5="";
	protected String 治療容量6="";
	protected String 治療容量7="";
	protected String 治療容量8="";
	protected String 治療容量9="";
	protected String 治療容量10="";
	protected String 治療容量11="";
	protected String 治療容量12="";
	protected String 治療容量13="";
	protected String 治療容量14="";
	protected String 治療容量15="";
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
	protected String 治療開始日11="";
	protected String 治療開始日12="";
	protected String 治療開始日13="";
	protected String 治療開始日14="";
	protected String 治療開始日15="";
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
	protected String 治療終了日11="";
	protected String 治療終了日12="";
	protected String 治療終了日13="";
	protected String 治療終了日14="";
	protected String 治療終了日15="";
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
	protected String 治療効果11="";
	protected String 治療効果12="";
	protected String 治療効果13="";
	protected String 治療効果14="";
	protected String 治療効果15="";
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
	protected String 治療備考11="";
	protected String 治療備考12="";
	protected String 治療備考13="";
	protected String 治療備考14="";
	protected String 治療備考15="";
	protected String 肝生検試行日Bx1="";
	protected String 肝生検試行日Bx2="";
	protected String 肝生検試行日Bx3="";
	protected String 肝生検備考Bx1="";
	protected String 肝生検備考Bx2="";
	protected String 肝生検備考Bx3="";
	protected String fibrosisBx1="";
	protected String fibrosisBx2="";
	protected String fibrosisBx3="";
	protected String activityBx1="";
	protected String activityBx2="";
	protected String activityBx3="";
	protected String HAIscoreBx1="";
	protected String HAIscoreBx2="";
	protected String HAIscoreBx3="";

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

	@JsonProperty
	public Float getBMI(){return this.BMI;}
	public void setBMI(final Float BMI){this.BMI=BMI;}

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
	public String getCyA有無(){return this.CyA有無;}
	public void setCyA有無(final String yA有無){this.CyA有無=CyA有無;}

	@Length(max=100)
	@JsonProperty
	public String getGenoAB(){return this.genoAB;}
	public void setGenoAB(final String genoAB){this.genoAB=genoAB;}

	@Length(max=100)
	@JsonProperty
	public String getHBcAbx200(){return this.HBcAbx200;}
	public void setHBcAbx200(final String HBcAbx200){this.HBcAbx200=HBcAbx200;}

	@Length(max=100)
	@JsonProperty
	public String getHBeAb(){return this.HBeAb;}
	public void setHBeAb(final String HBeAb){this.HBeAb=HBeAb;}

	@Length(max=100)
	@JsonProperty
	public String getHBeAg(){return this.HBeAg;}
	public void setHBeAg(final String HBeAg){this.HBeAg=HBeAg;}

	@Length(max=100)
	@JsonProperty
	public String getHBVDVA(){return this.HBVDVA;}
	public void setHBVDVA(final String HBVDVA){this.HBVDVA=HBVDVA;}

	@Length(max=100)
	@JsonProperty
	public String getHCV有無(){return this.HCV有無;}
	public void setHCV有無(final String HCV有無){this.HCV有無=HCV有無;}

	@Length(max=100)
	@JsonProperty
	public String getIFN核酸アナログ併用(){return this.IFN核酸アナログ併用;}
	public void setIFN核酸アナログ併用(final String IFN核酸アナログ併用){this.IFN核酸アナログ併用=IFN核酸アナログ併用;}

	@Length(max=100)
	@JsonProperty
	public String getIgMHBcAb(){return this.IgMHBcAb;}
	public void setIgMHBcAb(final String IgMHBcAb){this.IgMHBcAb=IgMHBcAb;}

	@Length(max=100)
	@JsonProperty
	public String getNA種類(){return this.NA種類;}
	public void setNA種類(final String NA種類){this.NA種類=NA種類;}

	@Length(max=100)
	@JsonProperty
	public String getヘモクロマトーシス有無(){return this.ヘモクロマトーシス有無;}
	public void setヘモクロマトーシス有無(final String ヘモクロマトーシス有無){this.ヘモクロマトーシス有無=ヘモクロマトーシス有無;}

	@Length(max=100)
	@JsonProperty
	public String get再発時核酸アナログの投与有無(){return this.再発時核酸アナログの投与有無;}
	public void set再発時核酸アナログの投与有無(final String 再発時核酸アナログの投与有無){this.再発時核酸アナログの投与有無=再発時核酸アナログの投与有無;}

	@Length(max=100)
	@JsonProperty
	public String get各ファイルAH(){return this.各ファイルAH;}
	public void set各ファイルAH(final String 各ファイルAH){this.各ファイルAH=各ファイルAH;}

	@Length(max=100)
	@JsonProperty
	public String get各ファイルHCC(){return this.各ファイルHCC;}
	public void set各ファイルHCC(final String 各ファイルHCC){this.各ファイルHCC=各ファイルHCC;}

	@Length(max=100)
	@JsonProperty
	public String get各ファイル核酸アナログ(){return this.各ファイル核酸アナログ;}
	public void set各ファイル核酸アナログ(final String 各ファイル核酸アナログ){this.各ファイル核酸アナログ=各ファイル核酸アナログ;}

	@Length(max=100)
	@JsonProperty
	public String get各ファイル移植・肝不全(){return this.各ファイル移植・肝不全;}
	public void set各ファイル移植・肝不全(final String 各ファイル移植・肝不全){this.各ファイル移植・肝不全=各ファイル移植・肝不全;}

	@Length(max=100)
	@JsonProperty
	public String get急性増悪(){return this.急性増悪;}
	public void set急性増悪(final String 急性増悪){this.急性増悪=急性増悪;}

	@Length(max=50)
	@JsonProperty
	public String get核アBreakthroughHepatitis年月日(){return this.核アBreakthroughHepatitis年月日;}
	public void set核アBreakthroughHepatitis年月日(final String 核アBreakthroughHepatitis年月日){this.核アBreakthroughHepatitis年月日=核アBreakthroughHepatitis年月日;}

	@Length(max=100)
	@JsonProperty
	public String get核アBreakthroughHepatitis有無(){return this.核アBreakthroughHepatitis有無;}
	public void set核アBreakthroughHepatitis有無(final String 核アBreakthroughHepatitis有無){this.核アBreakthroughHepatitis有無=核アBreakthroughHepatitis有無;}

	@Length(max=50)
	@JsonProperty
	public String get核アBreakthrough年月日(){return this.核アBreakthrough年月日;}
	public void set核アBreakthrough年月日(final String 核アBreakthrough年月日){this.核アBreakthrough年月日=核アBreakthrough年月日;}

	@Length(max=100)
	@JsonProperty
	public String get核アBreakthrough有無(){return this.核アBreakthrough有無;}
	public void set核アBreakthrough有無(final String 核アBreakthrough有無){this.核アBreakthrough有無=核アBreakthrough有無;}

	@Length(max=50)
	@JsonProperty
	public String get核アYMDDmutant測定年月日(){return this.核アYMDDmutant測定年月日;}
	public void set核アYMDDmutant測定年月日(final String 核アYMDDmutant測定年月日){this.核アYMDDmutant測定年月日=核アYMDDmutant測定年月日;}

	@Length(max=100)
	@JsonProperty
	public String get核アYMDDmutant結果(){return this.核アYMDDmutant結果;}
	public void set核アYMDDmutant結果(final String 核アYMDDmutant結果){this.核アYMDDmutant結果=核アYMDDmutant結果;}

	@Length(max=100)
	@JsonProperty
	public String get核ア治療継続有無(){return this.核ア治療継続有無;}
	public void set核ア治療継続有無(final String 核ア治療継続有無){this.核ア治療継続有無=核ア治療継続有無;}

	@Length(max=50)
	@JsonProperty
	public String get核ア終了年月日(){return this.核ア終了年月日;}
	public void set核ア終了年月日(final String 核ア終了年月日){this.核ア終了年月日=核ア終了年月日;}

	@Length(max=50)
	@JsonProperty
	public String get核ア開始年月日(){return this.核ア開始年月日;}
	public void set核ア開始年月日(final String 核ア開始年月日){this.核ア開始年月日=核ア開始年月日;}

	@Length(max=100)
	@JsonProperty
	public String get核ア開始目的(){return this.核ア開始目的;}
	public void set核ア開始目的(final String 核ア開始目的){this.核ア開始目的=核ア開始目的;}

	@Length(max=100)
	@JsonProperty
	public String get核酸アナログ有無(){return this.核酸アナログ有無;}
	public void set核酸アナログ有無(final String 核酸アナログ有無){this.核酸アナログ有無=核酸アナログ有無;}

	@Length(max=100)
	@JsonProperty
	public String get核酸アナログ開始時HCC有無(){return this.核酸アナログ開始時HCC有無;}
	public void set核酸アナログ開始時HCC有無(final String 核酸アナログ開始時HCC有無){this.核酸アナログ開始時HCC有無=核酸アナログ開始時HCC有無;}

	@Length(max=100)
	@JsonProperty
	public String get核酸アナログ開始時HCC無の場合(){return this.核酸アナログ開始時HCC無の場合;}
	public void set核酸アナログ開始時HCC無の場合(final String 核酸アナログ開始時HCC無の場合){this.核酸アナログ開始時HCC無の場合=核酸アナログ開始時HCC無の場合;}

	@Length(max=100)
	@JsonProperty
	public String get核酸短期有無(){return this.核酸短期有無;}
	public void set核酸短期有無(final String 核酸短期有無){this.核酸短期有無=核酸短期有無;}

	@Length(max=100)
	@JsonProperty
	public String get核酸短期有無NA種類(){return this.核酸短期有無NA種類;}
	public void set核酸短期有無NA種類(final String 核酸短期有無NA種類){this.核酸短期有無NA種類=核酸短期有無NA種類;}

	@Length(max=100)
	@JsonProperty
	public String get核酸長期有無(){return this.核酸長期有無;}
	public void set核酸長期有無(final String 核酸長期有無){this.核酸長期有無=核酸長期有無;}

	@Length(max=100)
	@JsonProperty
	public String get核酸長期有無NA種類(){return this.核酸長期有無NA種類;}
	public void set核酸長期有無NA種類(final String 核酸長期有無NA種類){this.核酸長期有無NA種類=核酸長期有無NA種類;}

	@Length(max=100)
	@JsonProperty
	public String get検査法(){return this.検査法;}
	public void set検査法(final String 検査法){this.検査法=検査法;}

	@Length(max=100)
	@JsonProperty
	public String get治療因子(){return this.治療因子;}
	public void set治療因子(final String 治療因子){this.治療因子=治療因子;}

	@Length(max=100)
	@JsonProperty
	public String get治療歴No1(){return this.治療歴No1;}
	public void set治療歴No1(final String 治療歴No1){this.治療歴No1=治療歴No1;}

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
	public String getTx種類11(){return this.Tx種類11;}
	public void setTx種類11(final String Tx種類11){this.Tx種類11=Tx種類11;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類12(){return this.Tx種類12;}
	public void setTx種類12(final String Tx種類12){this.Tx種類12=Tx種類12;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類13(){return this.Tx種類13;}
	public void setTx種類13(final String Tx種類13){this.Tx種類13=Tx種類13;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類14(){return this.Tx種類14;}
	public void setTx種類14(final String Tx種類14){this.Tx種類14=Tx種類14;}

	@Length(max=100)
	@JsonProperty
	public String getTx種類15(){return this.Tx種類15;}
	public void setTx種類15(final String Tx種類15){this.Tx種類15=Tx種類15;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量1(){return this.治療容量1;}
	public void set治療容量1(final String 治療容量1){this.治療容量1=治療容量1;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量2(){return this.治療容量2;}
	public void set治療容量2(final String 治療容量2){this.治療容量2=治療容量2;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量3(){return this.治療容量3;}
	public void set治療容量3(final String 治療容量3){this.治療容量3=治療容量3;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量4(){return this.治療容量4;}
	public void set治療容量4(final String 治療容量4){this.治療容量4=治療容量4;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量5(){return this.治療容量5;}
	public void set治療容量5(final String 治療容量5){this.治療容量5=治療容量5;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量6(){return this.治療容量6;}
	public void set治療容量6(final String 治療容量6){this.治療容量6=治療容量6;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量7(){return this.治療容量7;}
	public void set治療容量7(final String 治療容量7){this.治療容量7=治療容量7;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量8(){return this.治療容量8;}
	public void set治療容量8(final String 治療容量8){this.治療容量8=治療容量8;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量9(){return this.治療容量9;}
	public void set治療容量9(final String 治療容量9){this.治療容量9=治療容量9;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量10(){return this.治療容量10;}
	public void set治療容量10(final String 治療容量10){this.治療容量10=治療容量10;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量11(){return this.治療容量11;}
	public void set治療容量11(final String 治療容量11){this.治療容量11=治療容量11;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量12(){return this.治療容量12;}
	public void set治療容量12(final String 治療容量12){this.治療容量12=治療容量12;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量13(){return this.治療容量13;}
	public void set治療容量13(final String 治療容量13){this.治療容量13=治療容量13;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量14(){return this.治療容量14;}
	public void set治療容量14(final String 治療容量14){this.治療容量14=治療容量14;}

	@Length(max=100)
	@JsonProperty
	public String get治療容量15(){return this.治療容量15;}
	public void set治療容量15(final String 治療容量15){this.治療容量15=治療容量15;}

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
	public String get治療開始日11(){return this.治療開始日11;}
	public void set治療開始日11(final String 治療開始日11){this.治療開始日11=治療開始日11;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日12(){return this.治療開始日12;}
	public void set治療開始日12(final String 治療開始日12){this.治療開始日12=治療開始日12;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日13(){return this.治療開始日13;}
	public void set治療開始日13(final String 治療開始日13){this.治療開始日13=治療開始日13;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日14(){return this.治療開始日14;}
	public void set治療開始日14(final String 治療開始日14){this.治療開始日14=治療開始日14;}

	@Length(max=100)
	@JsonProperty
	public String get治療開始日15(){return this.治療開始日15;}
	public void set治療開始日15(final String 治療開始日15){this.治療開始日15=治療開始日15;}

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
	public String get治療終了日11(){return this.治療終了日11;}
	public void set治療終了日11(final String 治療終了日11){this.治療終了日11=治療終了日11;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日12(){return this.治療終了日12;}
	public void set治療終了日12(final String 治療終了日12){this.治療終了日12=治療終了日12;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日13(){return this.治療終了日13;}
	public void set治療終了日13(final String 治療終了日13){this.治療終了日13=治療終了日13;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日14(){return this.治療終了日14;}
	public void set治療終了日14(final String 治療終了日14){this.治療終了日14=治療終了日14;}

	@Length(max=100)
	@JsonProperty
	public String get治療終了日15(){return this.治療終了日15;}
	public void set治療終了日15(final String 治療終了日15){this.治療終了日15=治療終了日15;}

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

	@Length(max=100)
	@JsonProperty
	public String get治療効果11(){return this.治療効果11;}
	public void set治療効果11(final String 治療効果11){this.治療効果11=治療効果11;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果12(){return this.治療効果12;}
	public void set治療効果12(final String 治療効果12){this.治療効果12=治療効果12;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果13(){return this.治療効果13;}
	public void set治療効果13(final String 治療効果13){this.治療効果13=治療効果13;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果14(){return this.治療効果14;}
	public void set治療効果14(final String 治療効果14){this.治療効果14=治療効果14;}

	@Length(max=100)
	@JsonProperty
	public String get治療効果15(){return this.治療効果15;}
	public void set治療効果15(final String 治療効果15){this.治療効果15=治療効果15;}

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

	@Length(max=1000)
	@JsonProperty
	public String get治療備考11(){return this.治療備考11;}
	public void set治療備考11(final String 治療備考11){this.治療備考11=治療備考11;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考12(){return this.治療備考12;}
	public void set治療備考12(final String 治療備考12){this.治療備考12=治療備考12;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考13(){return this.治療備考13;}
	public void set治療備考13(final String 治療備考13){this.治療備考13=治療備考13;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考14(){return this.治療備考14;}
	public void set治療備考14(final String 治療備考14){this.治療備考14=治療備考14;}

	@Length(max=1000)
	@JsonProperty
	public String get治療備考15(){return this.治療備考15;}
	public void set治療備考15(final String 治療備考15){this.治療備考15=治療備考15;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検試行日Bx1(){return this.肝生検試行日Bx1;}
	public void set肝生検試行日Bx1(final String 肝生検試行日Bx1){this.肝生検試行日Bx1=肝生検試行日Bx1;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検試行日Bx2(){return this.肝生検試行日Bx2;}
	public void set肝生検試行日Bx2(final String 肝生検試行日Bx2){this.肝生検試行日Bx2=肝生検試行日Bx2;}

	@Length(max=50)
	@JsonProperty
	public String get肝生検試行日Bx3(){return this.肝生検試行日Bx3;}
	public void set肝生検試行日Bx3(final String 肝生検試行日Bx3){this.肝生検試行日Bx3=肝生検試行日Bx3;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx1(){return this.肝生検備考Bx1;}
	public void set肝生検備考Bx1(final String 肝生検備考Bx1){this.肝生検備考Bx1=肝生検備考Bx1;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx2(){return this.肝生検備考Bx2;}
	public void set肝生検備考Bx2(final String 肝生検備考Bx2){this.肝生検備考Bx2=肝生検備考Bx2;}

	@Length(max=1000)
	@JsonProperty
	public String get肝生検備考Bx3(){return this.肝生検備考Bx3;}
	public void set肝生検備考Bx3(final String 肝生検備考Bx3){this.肝生検備考Bx3=肝生検備考Bx3;}

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
	
	public FmHbvPatient(){}
	
	public FmHbvPatient(int rowID)
	{
		super(rowID);
	}
	
	@Id
	public Integer getRowID(){return this.rowID;}
}