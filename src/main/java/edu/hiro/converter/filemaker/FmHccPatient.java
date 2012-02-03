package edu.hiro.converter.filemaker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="fmhcc")
public class FmHccPatient extends AbstractFmPatient
{
	protected String 肝癌ID=null;
	protected String 患者ID="";
	protected String 患者名="";
	protected String フリガナ="";
	protected String 生年月日=null;
	protected String 性別="";
	protected String 年齢=null;
	protected String 診断="";
	protected String 初発再発="";
	protected String 今回何回目治療=null;
	protected String TNMstage="";
	protected String grade="";
	protected String JISscore=null;
	protected String HBsAg="";
	protected String HCVAb="";
	protected String 治療法="";
	protected String 初回治療開始日=null;
	protected String 最終予後確認日=null;
	protected String 生死="";
	protected String 死因="";
	protected String 入院主治医="";
	protected String 主腫瘍径=null;
	protected String 腫瘍数=null;
	protected String リンパ節転移="";
	protected String 遠隔転移="";
	protected String TBil=null;
	protected String Alb=null;
	protected String PT=null;
	protected String ICGR=null;
	protected String 腹水="";
	protected String 脳症=null;
	protected String ChildPugh点=null;
	protected String Liverdamage="";
	protected String 切除治療日=null;
	protected String 入院日=null;
	protected String openRFA治療日1=null;
	protected String RFA治療日2=null;
	protected String PEI治療日3=null;
	protected String TACE治療日4=null;
	protected String HAI治療日5=null;
	protected String chemo治療日6=null;
	protected String Vp=null;
	protected String Vv=null;
	protected String B=null;
	protected String 主腫瘍形態="";
	protected String 腫瘍占有率="";
	protected String TAFP=null;
	protected String L3=null;
	protected String PIVKA=null;
	protected String グラケー内服="";
	protected String 主腫瘍vascularity="";
	protected String 診断備考="";
	protected String 外来医follow先="";
	protected String これまでの経過="";
	protected String 転移備考="";
	protected String 画像診断備考="";
	protected String 腫瘍生検="";
	protected String Plt=null;
	protected String HBsAb="";
	protected String HBeAg="";
	protected String HBeAb="";
	protected String HBcAb="";
	protected String HBcAbx200="";
	protected String HBVDNA=null;
	protected String HCVgenotype="";
	protected String HCVウイルス量="";
	protected String ANA="";
	protected String AMA="";
	protected String アルコール歴="";
	protected String DM="";
	protected String HBV測定法="";
	protected String ウイルス治療備考="";
	protected String 静脈瘤="";
	protected String PS=null;
	protected String DSA日=null;
	protected String 治療内容="";
	protected String 治療法選択の理由="";
	protected String 移植日=null;
	protected String 治療目的="";
	protected String RT日=null;
	protected String 直接治療効果判定TE=null;
	protected String 総合評価="";
	protected String 再発備考="";
	protected String 辺縁="";
	protected String 重複癌="";
	protected String sec有無="";
	protected String sec所見="";
	protected String EV="";
	protected String GF="";
	protected String 局所効果判定日=null;
	protected String CEA=null;
	protected String CA199=null;
	protected String 合併疾患その他="";
	protected String グラケー開始日=null;
	protected String 結節1="";
	protected String 結節2="";
	protected String 結節3="";
	protected String 治療終了時効果判定="";
	protected String 治療終了時効果判定日=null;
	protected String 異所再発日=null;
	protected String 異所再発="";
	protected String 死因備考="";
	protected String 退院日=null;
	protected String 背景肝="";
	protected String IFN既往="";
	protected String IFN効果="";
	protected String 輸血歴="";
	protected String 輸血時期="";
	protected String 肝癌治療後IFN="";
	protected String その効果と内容="";
	protected String 合併疾患その他のコピー="";
	protected String EVRC="";
	protected String GVRC="";
	protected String 腫瘍内部性状="";
	protected String HbA1C=null;
	protected String PMCT日=null;
	protected String 担当者="";
	protected String BW=null;
	protected String Height=null;
	protected String 高脂血症="";
	protected String 高血圧="";
	protected String 脂肪肝="";
	protected String gammaglb=null;
	protected String ヒアルロン酸=null;
	protected String AST=null;
	protected String ALT=null;
	protected String BMI=null;
	protected String WBC=null;
	protected String RBC=null;
	protected String Hb=null;
	protected String LDH=null;
	protected String ALP=null;
	protected String gammaGTP=null;
	protected String Tprotein=null;
	protected String che=null;
	protected String Tcho=null;
	protected String TG=null;
	protected String ZTT=null;
	protected String ワーファリン内服="";
	protected String 当院初回解析対象例="";
	protected String 初回治療法="";
	protected String 予後調査="";
	protected String 局在="";
	protected String ヘパプラスチン=null;
	protected String インシュリン="";
	protected String 糖尿病内服薬有無="";
	protected String 糖尿病内服薬種類="";
	protected String 高血圧内服薬有無="";
	protected String 高血圧内服薬種類="";
	protected String 高脂血症内服薬有無="";
	protected String 高脂血症内服薬種類="";
	protected String DBil=null;
	protected String HDLch=null;
	protected String LDLch=null;
	protected String INS=null;
	protected String Bun=null;
	protected String crn=null;
	protected String BTR=null;
	protected String FBS=null;
	protected String 随時BS=null;
	protected String PTINR=null;
	protected String 前血糖=null;
	protected String 血糖30分後=null;
	protected String 血糖60分後=null;
	protected String 血糖120分後=null;
	protected String 血糖180分後=null;
	protected String INS前=null;
	protected String INS30分後=null;
	protected String INS60分後=null;
	protected String INS120分後=null;
	protected String INS180分後=null;
	protected String アディポネクチン=null;
	protected String HOMAIR=null;
	protected String 肝脾CT値=null;
	protected String 皮下脂肪内蔵脂肪面積=null;
	protected String OGTT施行日=null;
	protected String 初発はSVR後発癌例="";
	protected String 腫瘍生検の有無="";
	protected String 腫瘍生検施行日=null;
	protected String 背景肝診断法="";
	protected String 背景肝病理診断日=null;
	protected String 背景肝病理所見="";
	protected String 過去の病理診断の有無="";
	protected String 過去の病理診断日=null;
	protected String 過去の病理診断所見="";
	protected String 糖尿病診断時年齢=null;
	protected String 高血圧診断時年齢=null;
	protected String 高脂血症診断時年齢=null;
	protected String HCV測定法="";
	protected String 局在1="";
	protected String 局在2="";
	protected String 局在3="";
	protected String 局在4="";
	protected String 局在5="";
	protected String US1="";
	protected String US2="";
	protected String US3="";
	protected String US4="";
	protected String US5="";
	protected String CT1="";
	protected String CT2="";
	protected String CT3="";
	protected String CT4="";
	protected String CT5="";
	protected String MR1="";
	protected String MR2="";
	protected String MR3="";
	protected String MR4="";
	protected String MR5="";
	protected String DSA1="";
	protected String DSA2="";
	protected String DSA3="";
	protected String DSA4="";
	protected String DSA5="";
	protected String CTA1="";
	protected String CTA2="";
	protected String CTA3="";
	protected String CTA4="";
	protected String CTA5="";
	protected String CTAP1="";
	protected String CTAP2="";
	protected String CTAP3="";
	protected String CTAP4="";
	protected String CTAP5="";
	protected String CO2US1="";
	protected String CO2US2="";
	protected String CO2US3="";
	protected String CO2US4="";
	protected String CO2US5="";
	protected String size1="";
	protected String size2="";
	protected String size3="";
	protected String size4="";
	protected String size5="";

	public FmHccPatient(){}
	
	public FmHccPatient(int rowID)
	{
		super(rowID);
	}
}