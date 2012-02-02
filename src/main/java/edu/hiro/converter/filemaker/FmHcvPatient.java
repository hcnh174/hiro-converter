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

	public FmHcvPatient(){}
	
	public FmHcvPatient(int rowID)
	{
		super(rowID);
	}
	
	@Id
	public Integer getRowID(){return this.rowID;}
}