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

	@Length(max=50)
	@JsonProperty
	public String get肝癌ID(){return this.肝癌ID;}
	public void set肝癌ID(final String 肝癌ID){this.肝癌ID=肝癌ID;}

	@Length(max=50)
	@JsonProperty
	public String get患者ID(){return this.患者ID;}
	public void set患者ID(final String 患者ID){this.患者ID=患者ID;}

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

	@Length(max=50)
	@JsonProperty
	public String get年齢(){return this.年齢;}
	public void set年齢(final String 年齢){this.年齢=年齢;}

	@Length(max=100)
	@JsonProperty
	public String get診断(){return this.診断;}
	public void set診断(final String 診断){this.診断=診断;}

	@Length(max=100)
	@JsonProperty
	public String get初発再発(){return this.初発再発;}
	public void set初発再発(final String 初発再発){this.初発再発=初発再発;}

	@Length(max=50)
	@JsonProperty
	public String get今回何回目治療(){return this.今回何回目治療;}
	public void set今回何回目治療(final String 今回何回目治療){this.今回何回目治療=今回何回目治療;}

	@Length(max=100)
	@JsonProperty
	public String getTNMstage(){return this.TNMstage;}
	public void setTNMstage(final String TNMstage){this.TNMstage=TNMstage;}

	@Length(max=100)
	@JsonProperty
	public String getGrade(){return this.grade;}
	public void setGrade(final String grade){this.grade=grade;}

	@Length(max=50)
	@JsonProperty
	public String getJISscore(){return this.JISscore;}
	public void setJISscore(final String JISscore){this.JISscore=JISscore;}

	@Length(max=100)
	@JsonProperty
	public String getHBsAg(){return this.HBsAg;}
	public void setHBsAg(final String HBsAg){this.HBsAg=HBsAg;}

	@Length(max=100)
	@JsonProperty
	public String getHCVAb(){return this.HCVAb;}
	public void setHCVAb(final String HCVAb){this.HCVAb=HCVAb;}

	@JsonProperty
	public String get治療法(){return this.治療法;}
	public void set治療法(final String 治療法){this.治療法=治療法;}

	@Length(max=50)
	@JsonProperty
	public String get初回治療開始日(){return this.初回治療開始日;}
	public void set初回治療開始日(final String 初回治療開始日){this.初回治療開始日=初回治療開始日;}

	@Length(max=50)
	@JsonProperty
	public String get最終予後確認日(){return this.最終予後確認日;}
	public void set最終予後確認日(final String 最終予後確認日){this.最終予後確認日=最終予後確認日;}

	@Length(max=100)
	@JsonProperty
	public String get生死(){return this.生死;}
	public void set生死(final String 生死){this.生死=生死;}

	@Length(max=100)
	@JsonProperty
	public String get死因(){return this.死因;}
	public void set死因(final String 死因){this.死因=死因;}

	@Length(max=100)
	@JsonProperty
	public String get入院主治医(){return this.入院主治医;}
	public void set入院主治医(final String 入院主治医){this.入院主治医=入院主治医;}

	@Length(max=50)
	@JsonProperty
	public String get主腫瘍径(){return this.主腫瘍径;}
	public void set主腫瘍径(final String 主腫瘍径){this.主腫瘍径=主腫瘍径;}

	@Length(max=50)
	@JsonProperty
	public String get腫瘍数(){return this.腫瘍数;}
	public void set腫瘍数(final String 腫瘍数){this.腫瘍数=腫瘍数;}

	@Length(max=100)
	@JsonProperty
	public String getリンパ節転移(){return this.リンパ節転移;}
	public void setリンパ節転移(final String リンパ節転移){this.リンパ節転移=リンパ節転移;}

	@Length(max=100)
	@JsonProperty
	public String get遠隔転移(){return this.遠隔転移;}
	public void set遠隔転移(final String 遠隔転移){this.遠隔転移=遠隔転移;}

	@Length(max=50)
	@JsonProperty
	public String getTBil(){return this.TBil;}
	public void setTBil(final String TBil){this.TBil=TBil;}

	@Length(max=50)
	@JsonProperty
	public String getAlb(){return this.Alb;}
	public void setAlb(final String Alb){this.Alb=Alb;}

	@Length(max=50)
	@JsonProperty
	public String getPT(){return this.PT;}
	public void setPT(final String PT){this.PT=PT;}

	@Length(max=50)
	@JsonProperty
	public String getICGR(){return this.ICGR;}
	public void setICGR(final String ICGR){this.ICGR=ICGR;}

	@Length(max=100)
	@JsonProperty
	public String get腹水(){return this.腹水;}
	public void set腹水(final String 腹水){this.腹水=腹水;}

	@Length(max=50)
	@JsonProperty
	public String get脳症(){return this.脳症;}
	public void set脳症(final String 脳症){this.脳症=脳症;}

	@Length(max=50)
	@JsonProperty
	public String getChildPugh点(){return this.ChildPugh点;}
	public void setChildPugh点(final String hildPugh点){this.ChildPugh点=ChildPugh点;}

	@Length(max=100)
	@JsonProperty
	public String getLiverdamage(){return this.Liverdamage;}
	public void setLiverdamage(final String Liverdamage){this.Liverdamage=Liverdamage;}

	@Length(max=50)
	@JsonProperty
	public String get切除治療日(){return this.切除治療日;}
	public void set切除治療日(final String 切除治療日){this.切除治療日=切除治療日;}

	@Length(max=50)
	@JsonProperty
	public String get入院日(){return this.入院日;}
	public void set入院日(final String 入院日){this.入院日=入院日;}

	@Length(max=50)
	@JsonProperty
	public String getOpenRFA治療日1(){return this.openRFA治療日1;}
	public void setOpenRFA治療日1(final String openRFA治療日1){this.openRFA治療日1=openRFA治療日1;}

	@Length(max=50)
	@JsonProperty
	public String getRFA治療日2(){return this.RFA治療日2;}
	public void setRFA治療日2(final String RFA治療日2){this.RFA治療日2=RFA治療日2;}

	@Length(max=50)
	@JsonProperty
	public String getPEI治療日3(){return this.PEI治療日3;}
	public void setPEI治療日3(final String PEI治療日3){this.PEI治療日3=PEI治療日3;}

	@Length(max=50)
	@JsonProperty
	public String getTACE治療日4(){return this.TACE治療日4;}
	public void setTACE治療日4(final String TACE治療日4){this.TACE治療日4=TACE治療日4;}

	@Length(max=50)
	@JsonProperty
	public String getHAI治療日5(){return this.HAI治療日5;}
	public void setHAI治療日5(final String HAI治療日5){this.HAI治療日5=HAI治療日5;}

	@Length(max=50)
	@JsonProperty
	public String getChemo治療日6(){return this.chemo治療日6;}
	public void setChemo治療日6(final String chemo治療日6){this.chemo治療日6=chemo治療日6;}

	@Length(max=50)
	@JsonProperty
	public String getVp(){return this.Vp;}
	public void setVp(final String Vp){this.Vp=Vp;}

	@Length(max=50)
	@JsonProperty
	public String getVv(){return this.Vv;}
	public void setVv(final String Vv){this.Vv=Vv;}

	@Length(max=50)
	@JsonProperty
	public String getB(){return this.B;}
	public void setB(final String B){this.B=B;}

	@Length(max=100)
	@JsonProperty
	public String get主腫瘍形態(){return this.主腫瘍形態;}
	public void set主腫瘍形態(final String 主腫瘍形態){this.主腫瘍形態=主腫瘍形態;}

	@Length(max=100)
	@JsonProperty
	public String get腫瘍占有率(){return this.腫瘍占有率;}
	public void set腫瘍占有率(final String 腫瘍占有率){this.腫瘍占有率=腫瘍占有率;}

	@Length(max=50)
	@JsonProperty
	public String getTAFP(){return this.TAFP;}
	public void setTAFP(final String TAFP){this.TAFP=TAFP;}

	@Length(max=50)
	@JsonProperty
	public String getL3(){return this.L3;}
	public void setL3(final String L3){this.L3=L3;}

	@Length(max=50)
	@JsonProperty
	public String getPIVKA(){return this.PIVKA;}
	public void setPIVKA(final String PIVKA){this.PIVKA=PIVKA;}

	@Length(max=100)
	@JsonProperty
	public String getグラケー内服(){return this.グラケー内服;}
	public void setグラケー内服(final String グラケー内服){this.グラケー内服=グラケー内服;}

	@Length(max=100)
	@JsonProperty
	public String get主腫瘍vascularity(){return this.主腫瘍vascularity;}
	public void set主腫瘍vascularity(final String 主腫瘍vascularity){this.主腫瘍vascularity=主腫瘍vascularity;}

	@JsonProperty
	public String get診断備考(){return this.診断備考;}
	public void set診断備考(final String 診断備考){this.診断備考=診断備考;}

	@Length(max=100)
	@JsonProperty
	public String get外来医follow先(){return this.外来医follow先;}
	public void set外来医follow先(final String 外来医follow先){this.外来医follow先=外来医follow先;}

	@JsonProperty
	public String getこれまでの経過(){return this.これまでの経過;}
	public void setこれまでの経過(final String これまでの経過){this.これまでの経過=これまでの経過;}

	@JsonProperty
	public String get転移備考(){return this.転移備考;}
	public void set転移備考(final String 転移備考){this.転移備考=転移備考;}

	@JsonProperty
	public String get画像診断備考(){return this.画像診断備考;}
	public void set画像診断備考(final String 画像診断備考){this.画像診断備考=画像診断備考;}

	@JsonProperty
	public String get腫瘍生検(){return this.腫瘍生検;}
	public void set腫瘍生検(final String 腫瘍生検){this.腫瘍生検=腫瘍生検;}

	@Length(max=50)
	@JsonProperty
	public String getPlt(){return this.Plt;}
	public void setPlt(final String Plt){this.Plt=Plt;}

	@Length(max=100)
	@JsonProperty
	public String getHBsAb(){return this.HBsAb;}
	public void setHBsAb(final String HBsAb){this.HBsAb=HBsAb;}

	@Length(max=100)
	@JsonProperty
	public String getHBeAg(){return this.HBeAg;}
	public void setHBeAg(final String HBeAg){this.HBeAg=HBeAg;}

	@Length(max=100)
	@JsonProperty
	public String getHBeAb(){return this.HBeAb;}
	public void setHBeAb(final String HBeAb){this.HBeAb=HBeAb;}

	@Length(max=100)
	@JsonProperty
	public String getHBcAb(){return this.HBcAb;}
	public void setHBcAb(final String HBcAb){this.HBcAb=HBcAb;}

	@Length(max=100)
	@JsonProperty
	public String getHBcAbx200(){return this.HBcAbx200;}
	public void setHBcAbx200(final String HBcAbx200){this.HBcAbx200=HBcAbx200;}

	@Length(max=50)
	@JsonProperty
	public String getHBVDNA(){return this.HBVDNA;}
	public void setHBVDNA(final String HBVDNA){this.HBVDNA=HBVDNA;}

	@Length(max=100)
	@JsonProperty
	public String getHCVgenotype(){return this.HCVgenotype;}
	public void setHCVgenotype(final String HCVgenotype){this.HCVgenotype=HCVgenotype;}

	@Length(max=100)
	@JsonProperty
	public String getHCVウイルス量(){return this.HCVウイルス量;}
	public void setHCVウイルス量(final String HCVウイルス量){this.HCVウイルス量=HCVウイルス量;}

	@Length(max=100)
	@JsonProperty
	public String getANA(){return this.ANA;}
	public void setANA(final String ANA){this.ANA=ANA;}

	@Length(max=100)
	@JsonProperty
	public String getAMA(){return this.AMA;}
	public void setAMA(final String AMA){this.AMA=AMA;}

	@Length(max=100)
	@JsonProperty
	public String getアルコール歴(){return this.アルコール歴;}
	public void setアルコール歴(final String アルコール歴){this.アルコール歴=アルコール歴;}

	@Length(max=100)
	@JsonProperty
	public String getDM(){return this.DM;}
	public void setDM(final String DM){this.DM=DM;}

	@Length(max=100)
	@JsonProperty
	public String getHBV測定法(){return this.HBV測定法;}
	public void setHBV測定法(final String HBV測定法){this.HBV測定法=HBV測定法;}

	@JsonProperty
	public String getウイルス治療備考(){return this.ウイルス治療備考;}
	public void setウイルス治療備考(final String ウイルス治療備考){this.ウイルス治療備考=ウイルス治療備考;}

	@JsonProperty
	public String get静脈瘤(){return this.静脈瘤;}
	public void set静脈瘤(final String 静脈瘤){this.静脈瘤=静脈瘤;}

	@Length(max=50)
	@JsonProperty
	public String getPS(){return this.PS;}
	public void setPS(final String PS){this.PS=PS;}

	@Length(max=50)
	@JsonProperty
	public String getDSA日(){return this.DSA日;}
	public void setDSA日(final String DSA日){this.DSA日=DSA日;}

	@JsonProperty
	public String get治療内容(){return this.治療内容;}
	public void set治療内容(final String 治療内容){this.治療内容=治療内容;}

	@JsonProperty
	public String get治療法選択の理由(){return this.治療法選択の理由;}
	public void set治療法選択の理由(final String 治療法選択の理由){this.治療法選択の理由=治療法選択の理由;}

	@Length(max=50)
	@JsonProperty
	public String get移植日(){return this.移植日;}
	public void set移植日(final String 移植日){this.移植日=移植日;}

	@Length(max=100)
	@JsonProperty
	public String get治療目的(){return this.治療目的;}
	public void set治療目的(final String 治療目的){this.治療目的=治療目的;}

	@Length(max=50)
	@JsonProperty
	public String getRT日(){return this.RT日;}
	public void setRT日(final String RT日){this.RT日=RT日;}

	@Length(max=50)
	@JsonProperty
	public String get直接治療効果判定TE(){return this.直接治療効果判定TE;}
	public void set直接治療効果判定TE(final String 直接治療効果判定TE){this.直接治療効果判定TE=直接治療効果判定TE;}

	@Length(max=100)
	@JsonProperty
	public String get総合評価(){return this.総合評価;}
	public void set総合評価(final String 総合評価){this.総合評価=総合評価;}

	@JsonProperty
	public String get再発備考(){return this.再発備考;}
	public void set再発備考(final String 再発備考){this.再発備考=再発備考;}

	@Length(max=100)
	@JsonProperty
	public String get辺縁(){return this.辺縁;}
	public void set辺縁(final String 辺縁){this.辺縁=辺縁;}

	@Length(max=100)
	@JsonProperty
	public String get重複癌(){return this.重複癌;}
	public void set重複癌(final String 重複癌){this.重複癌=重複癌;}

	@Length(max=100)
	@JsonProperty
	public String getSec有無(){return this.sec有無;}
	public void setSec有無(final String sec有無){this.sec有無=sec有無;}

	@Length(max=255)
	@JsonProperty
	public String getSec所見(){return this.sec所見;}
	public void setSec所見(final String sec所見){this.sec所見=sec所見;}

	@Length(max=100)
	@JsonProperty
	public String getEV(){return this.EV;}
	public void setEV(final String EV){this.EV=EV;}

	@Length(max=100)
	@JsonProperty
	public String getGF(){return this.GF;}
	public void setGF(final String GF){this.GF=GF;}

	@Length(max=50)
	@JsonProperty
	public String get局所効果判定日(){return this.局所効果判定日;}
	public void set局所効果判定日(final String 局所効果判定日){this.局所効果判定日=局所効果判定日;}

	@Length(max=50)
	@JsonProperty
	public String getCEA(){return this.CEA;}
	public void setCEA(final String EA){this.CEA=CEA;}

	@Length(max=50)
	@JsonProperty
	public String getCA199(){return this.CA199;}
	public void setCA199(final String A199){this.CA199=CA199;}

	@Length(max=255)
	@JsonProperty
	public String get合併疾患その他(){return this.合併疾患その他;}
	public void set合併疾患その他(final String 合併疾患その他){this.合併疾患その他=合併疾患その他;}

	@Length(max=50)
	@JsonProperty
	public String getグラケー開始日(){return this.グラケー開始日;}
	public void setグラケー開始日(final String グラケー開始日){this.グラケー開始日=グラケー開始日;}

	@Length(max=100)
	@JsonProperty
	public String get結節1(){return this.結節1;}
	public void set結節1(final String 結節1){this.結節1=結節1;}

	@Length(max=100)
	@JsonProperty
	public String get結節2(){return this.結節2;}
	public void set結節2(final String 結節2){this.結節2=結節2;}

	@Length(max=100)
	@JsonProperty
	public String get結節3(){return this.結節3;}
	public void set結節3(final String 結節3){this.結節3=結節3;}

	@JsonProperty
	public String get治療終了時効果判定(){return this.治療終了時効果判定;}
	public void set治療終了時効果判定(final String 治療終了時効果判定){this.治療終了時効果判定=治療終了時効果判定;}

	@Length(max=50)
	@JsonProperty
	public String get治療終了時効果判定日(){return this.治療終了時効果判定日;}
	public void set治療終了時効果判定日(final String 治療終了時効果判定日){this.治療終了時効果判定日=治療終了時効果判定日;}

	@Length(max=50)
	@JsonProperty
	public String get異所再発日(){return this.異所再発日;}
	public void set異所再発日(final String 異所再発日){this.異所再発日=異所再発日;}

	@Length(max=100)
	@JsonProperty
	public String get異所再発(){return this.異所再発;}
	public void set異所再発(final String 異所再発){this.異所再発=異所再発;}

	@JsonProperty
	public String get死因備考(){return this.死因備考;}
	public void set死因備考(final String 死因備考){this.死因備考=死因備考;}

	@Length(max=50)
	@JsonProperty
	public String get退院日(){return this.退院日;}
	public void set退院日(final String 退院日){this.退院日=退院日;}

	@Length(max=100)
	@JsonProperty
	public String get背景肝(){return this.背景肝;}
	public void set背景肝(final String 背景肝){this.背景肝=背景肝;}

	@Length(max=100)
	@JsonProperty
	public String getIFN既往(){return this.IFN既往;}
	public void setIFN既往(final String IFN既往){this.IFN既往=IFN既往;}

	@Length(max=100)
	@JsonProperty
	public String getIFN効果(){return this.IFN効果;}
	public void setIFN効果(final String IFN効果){this.IFN効果=IFN効果;}

	@Length(max=100)
	@JsonProperty
	public String get輸血歴(){return this.輸血歴;}
	public void set輸血歴(final String 輸血歴){this.輸血歴=輸血歴;}

	@Length(max=100)
	@JsonProperty
	public String get輸血時期(){return this.輸血時期;}
	public void set輸血時期(final String 輸血時期){this.輸血時期=輸血時期;}

	@Length(max=100)
	@JsonProperty
	public String get肝癌治療後IFN(){return this.肝癌治療後IFN;}
	public void set肝癌治療後IFN(final String 肝癌治療後IFN){this.肝癌治療後IFN=肝癌治療後IFN;}

	@Length(max=255)
	@JsonProperty
	public String getその効果と内容(){return this.その効果と内容;}
	public void setその効果と内容(final String その効果と内容){this.その効果と内容=その効果と内容;}

	@Length(max=100)
	@JsonProperty
	public String get合併疾患その他のコピー(){return this.合併疾患その他のコピー;}
	public void set合併疾患その他のコピー(final String 合併疾患その他のコピー){this.合併疾患その他のコピー=合併疾患その他のコピー;}

	@Length(max=100)
	@JsonProperty
	public String getEVRC(){return this.EVRC;}
	public void setEVRC(final String EVRC){this.EVRC=EVRC;}

	@Length(max=100)
	@JsonProperty
	public String getGVRC(){return this.GVRC;}
	public void setGVRC(final String GVRC){this.GVRC=GVRC;}

	@Length(max=100)
	@JsonProperty
	public String get腫瘍内部性状(){return this.腫瘍内部性状;}
	public void set腫瘍内部性状(final String 腫瘍内部性状){this.腫瘍内部性状=腫瘍内部性状;}

	@Length(max=50)
	@JsonProperty
	public String getHbA1C(){return this.HbA1C;}
	public void setHbA1C(final String HbA1C){this.HbA1C=HbA1C;}

	@Length(max=50)
	@JsonProperty
	public String getPMCT日(){return this.PMCT日;}
	public void setPMCT日(final String PMCT日){this.PMCT日=PMCT日;}

	@Length(max=100)
	@JsonProperty
	public String get担当者(){return this.担当者;}
	public void set担当者(final String 担当者){this.担当者=担当者;}

	@Length(max=50)
	@JsonProperty
	public String getBW(){return this.BW;}
	public void setBW(final String BW){this.BW=BW;}

	@Length(max=50)
	@JsonProperty
	public String getHeight(){return this.Height;}
	public void setHeight(final String Height){this.Height=Height;}

	@Length(max=100)
	@JsonProperty
	public String get高脂血症(){return this.高脂血症;}
	public void set高脂血症(final String 高脂血症){this.高脂血症=高脂血症;}

	@Length(max=100)
	@JsonProperty
	public String get高血圧(){return this.高血圧;}
	public void set高血圧(final String 高血圧){this.高血圧=高血圧;}

	@Length(max=100)
	@JsonProperty
	public String get脂肪肝(){return this.脂肪肝;}
	public void set脂肪肝(final String 脂肪肝){this.脂肪肝=脂肪肝;}

	@Length(max=50)
	@JsonProperty
	public String getGammaglb(){return this.gammaglb;}
	public void setGammaglb(final String gammaglb){this.gammaglb=gammaglb;}

	@Length(max=50)
	@JsonProperty
	public String getヒアルロン酸(){return this.ヒアルロン酸;}
	public void setヒアルロン酸(final String ヒアルロン酸){this.ヒアルロン酸=ヒアルロン酸;}

	@Length(max=50)
	@JsonProperty
	public String getAST(){return this.AST;}
	public void setAST(final String AST){this.AST=AST;}

	@Length(max=50)
	@JsonProperty
	public String getALT(){return this.ALT;}
	public void setALT(final String ALT){this.ALT=ALT;}

	@Length(max=50)
	@JsonProperty
	public String getBMI(){return this.BMI;}
	public void setBMI(final String BMI){this.BMI=BMI;}

	@Length(max=50)
	@JsonProperty
	public String getWBC(){return this.WBC;}
	public void setWBC(final String WBC){this.WBC=WBC;}

	@Length(max=50)
	@JsonProperty
	public String getRBC(){return this.RBC;}
	public void setRBC(final String RBC){this.RBC=RBC;}

	@Length(max=50)
	@JsonProperty
	public String getHb(){return this.Hb;}
	public void setHb(final String Hb){this.Hb=Hb;}

	@Length(max=50)
	@JsonProperty
	public String getLDH(){return this.LDH;}
	public void setLDH(final String LDH){this.LDH=LDH;}

	@Length(max=50)
	@JsonProperty
	public String getALP(){return this.ALP;}
	public void setALP(final String ALP){this.ALP=ALP;}

	@Length(max=50)
	@JsonProperty
	public String getGammaGTP(){return this.gammaGTP;}
	public void setGammaGTP(final String gammaGTP){this.gammaGTP=gammaGTP;}

	@Length(max=50)
	@JsonProperty
	public String getTprotein(){return this.Tprotein;}
	public void setTprotein(final String Tprotein){this.Tprotein=Tprotein;}

	@Length(max=50)
	@JsonProperty
	public String getChe(){return this.che;}
	public void setChe(final String che){this.che=che;}

	@Length(max=50)
	@JsonProperty
	public String getTcho(){return this.Tcho;}
	public void setTcho(final String Tcho){this.Tcho=Tcho;}

	@Length(max=50)
	@JsonProperty
	public String getTG(){return this.TG;}
	public void setTG(final String TG){this.TG=TG;}

	@Length(max=50)
	@JsonProperty
	public String getZTT(){return this.ZTT;}
	public void setZTT(final String ZTT){this.ZTT=ZTT;}

	@JsonProperty
	public String getワーファリン内服(){return this.ワーファリン内服;}
	public void setワーファリン内服(final String ワーファリン内服){this.ワーファリン内服=ワーファリン内服;}

	@JsonProperty
	public String get当院初回解析対象例(){return this.当院初回解析対象例;}
	public void set当院初回解析対象例(final String 当院初回解析対象例){this.当院初回解析対象例=当院初回解析対象例;}

	@JsonProperty
	public String get初回治療法(){return this.初回治療法;}
	public void set初回治療法(final String 初回治療法){this.初回治療法=初回治療法;}

	@JsonProperty
	public String get予後調査(){return this.予後調査;}
	public void set予後調査(final String 予後調査){this.予後調査=予後調査;}

	@JsonProperty
	public String get局在(){return this.局在;}
	public void set局在(final String 局在){this.局在=局在;}

	@Length(max=50)
	@JsonProperty
	public String getヘパプラスチン(){return this.ヘパプラスチン;}
	public void setヘパプラスチン(final String ヘパプラスチン){this.ヘパプラスチン=ヘパプラスチン;}

	@JsonProperty
	public String getインシュリン(){return this.インシュリン;}
	public void setインシュリン(final String インシュリン){this.インシュリン=インシュリン;}

	@JsonProperty
	public String get糖尿病内服薬有無(){return this.糖尿病内服薬有無;}
	public void set糖尿病内服薬有無(final String 糖尿病内服薬有無){this.糖尿病内服薬有無=糖尿病内服薬有無;}

	@JsonProperty
	public String get糖尿病内服薬種類(){return this.糖尿病内服薬種類;}
	public void set糖尿病内服薬種類(final String 糖尿病内服薬種類){this.糖尿病内服薬種類=糖尿病内服薬種類;}

	@JsonProperty
	public String get高血圧内服薬有無(){return this.高血圧内服薬有無;}
	public void set高血圧内服薬有無(final String 高血圧内服薬有無){this.高血圧内服薬有無=高血圧内服薬有無;}

	@JsonProperty
	public String get高血圧内服薬種類(){return this.高血圧内服薬種類;}
	public void set高血圧内服薬種類(final String 高血圧内服薬種類){this.高血圧内服薬種類=高血圧内服薬種類;}

	@JsonProperty
	public String get高脂血症内服薬有無(){return this.高脂血症内服薬有無;}
	public void set高脂血症内服薬有無(final String 高脂血症内服薬有無){this.高脂血症内服薬有無=高脂血症内服薬有無;}

	@JsonProperty
	public String get高脂血症内服薬種類(){return this.高脂血症内服薬種類;}
	public void set高脂血症内服薬種類(final String 高脂血症内服薬種類){this.高脂血症内服薬種類=高脂血症内服薬種類;}

	@Length(max=50)
	@JsonProperty
	public String getDBil(){return this.DBil;}
	public void setDBil(final String DBil){this.DBil=DBil;}

	@Length(max=50)
	@JsonProperty
	public String getHDLch(){return this.HDLch;}
	public void setHDLch(final String HDLch){this.HDLch=HDLch;}

	@Length(max=50)
	@JsonProperty
	public String getLDLch(){return this.LDLch;}
	public void setLDLch(final String LDLch){this.LDLch=LDLch;}

	@Length(max=50)
	@JsonProperty
	public String getINS(){return this.INS;}
	public void setINS(final String INS){this.INS=INS;}

	@Length(max=50)
	@JsonProperty
	public String getBun(){return this.Bun;}
	public void setBun(final String Bun){this.Bun=Bun;}

	@Length(max=50)
	@JsonProperty
	public String getCrn(){return this.crn;}
	public void setCrn(final String crn){this.crn=crn;}

	@Length(max=50)
	@JsonProperty
	public String getBTR(){return this.BTR;}
	public void setBTR(final String BTR){this.BTR=BTR;}

	@Length(max=50)
	@JsonProperty
	public String getFBS(){return this.FBS;}
	public void setFBS(final String FBS){this.FBS=FBS;}

	@Length(max=50)
	@JsonProperty
	public String get随時BS(){return this.随時BS;}
	public void set随時BS(final String 随時BS){this.随時BS=随時BS;}

	@Length(max=50)
	@JsonProperty
	public String getPTINR(){return this.PTINR;}
	public void setPTINR(final String PTINR){this.PTINR=PTINR;}

	@Length(max=50)
	@JsonProperty
	public String get前血糖(){return this.前血糖;}
	public void set前血糖(final String 前血糖){this.前血糖=前血糖;}

	@Length(max=50)
	@JsonProperty
	public String get血糖30分後(){return this.血糖30分後;}
	public void set血糖30分後(final String 血糖30分後){this.血糖30分後=血糖30分後;}

	@Length(max=50)
	@JsonProperty
	public String get血糖60分後(){return this.血糖60分後;}
	public void set血糖60分後(final String 血糖60分後){this.血糖60分後=血糖60分後;}

	@Length(max=50)
	@JsonProperty
	public String get血糖120分後(){return this.血糖120分後;}
	public void set血糖120分後(final String 血糖120分後){this.血糖120分後=血糖120分後;}

	@Length(max=50)
	@JsonProperty
	public String get血糖180分後(){return this.血糖180分後;}
	public void set血糖180分後(final String 血糖180分後){this.血糖180分後=血糖180分後;}

	@Length(max=50)
	@JsonProperty
	public String getINS前(){return this.INS前;}
	public void setINS前(final String INS前){this.INS前=INS前;}

	@Length(max=50)
	@JsonProperty
	public String getINS30分後(){return this.INS30分後;}
	public void setINS30分後(final String INS30分後){this.INS30分後=INS30分後;}

	@Length(max=50)
	@JsonProperty
	public String getINS60分後(){return this.INS60分後;}
	public void setINS60分後(final String INS60分後){this.INS60分後=INS60分後;}

	@Length(max=50)
	@JsonProperty
	public String getINS120分後(){return this.INS120分後;}
	public void setINS120分後(final String INS120分後){this.INS120分後=INS120分後;}

	@Length(max=50)
	@JsonProperty
	public String getINS180分後(){return this.INS180分後;}
	public void setINS180分後(final String INS180分後){this.INS180分後=INS180分後;}

	@Length(max=50)
	@JsonProperty
	public String getアディポネクチン(){return this.アディポネクチン;}
	public void setアディポネクチン(final String アディポネクチン){this.アディポネクチン=アディポネクチン;}

	@Length(max=50)
	@JsonProperty
	public String getHOMAIR(){return this.HOMAIR;}
	public void setHOMAIR(final String HOMAIR){this.HOMAIR=HOMAIR;}

	@Length(max=50)
	@JsonProperty
	public String get肝脾CT値(){return this.肝脾CT値;}
	public void set肝脾CT値(final String 肝脾CT値){this.肝脾CT値=肝脾CT値;}

	@Length(max=50)
	@JsonProperty
	public String get皮下脂肪内蔵脂肪面積(){return this.皮下脂肪内蔵脂肪面積;}
	public void set皮下脂肪内蔵脂肪面積(final String 皮下脂肪内蔵脂肪面積){this.皮下脂肪内蔵脂肪面積=皮下脂肪内蔵脂肪面積;}

	@Length(max=50)
	@JsonProperty
	public String getOGTT施行日(){return this.OGTT施行日;}
	public void setOGTT施行日(final String OGTT施行日){this.OGTT施行日=OGTT施行日;}

	@JsonProperty
	public String get初発はSVR後発癌例(){return this.初発はSVR後発癌例;}
	public void set初発はSVR後発癌例(final String 初発はSVR後発癌例){this.初発はSVR後発癌例=初発はSVR後発癌例;}

	@JsonProperty
	public String get腫瘍生検の有無(){return this.腫瘍生検の有無;}
	public void set腫瘍生検の有無(final String 腫瘍生検の有無){this.腫瘍生検の有無=腫瘍生検の有無;}

	@Length(max=50)
	@JsonProperty
	public String get腫瘍生検施行日(){return this.腫瘍生検施行日;}
	public void set腫瘍生検施行日(final String 腫瘍生検施行日){this.腫瘍生検施行日=腫瘍生検施行日;}

	@JsonProperty
	public String get背景肝診断法(){return this.背景肝診断法;}
	public void set背景肝診断法(final String 背景肝診断法){this.背景肝診断法=背景肝診断法;}

	@Length(max=50)
	@JsonProperty
	public String get背景肝病理診断日(){return this.背景肝病理診断日;}
	public void set背景肝病理診断日(final String 背景肝病理診断日){this.背景肝病理診断日=背景肝病理診断日;}

	@JsonProperty
	public String get背景肝病理所見(){return this.背景肝病理所見;}
	public void set背景肝病理所見(final String 背景肝病理所見){this.背景肝病理所見=背景肝病理所見;}

	@JsonProperty
	public String get過去の病理診断の有無(){return this.過去の病理診断の有無;}
	public void set過去の病理診断の有無(final String 過去の病理診断の有無){this.過去の病理診断の有無=過去の病理診断の有無;}

	@Length(max=50)
	@JsonProperty
	public String get過去の病理診断日(){return this.過去の病理診断日;}
	public void set過去の病理診断日(final String 過去の病理診断日){this.過去の病理診断日=過去の病理診断日;}

	@JsonProperty
	public String get過去の病理診断所見(){return this.過去の病理診断所見;}
	public void set過去の病理診断所見(final String 過去の病理診断所見){this.過去の病理診断所見=過去の病理診断所見;}

	@Length(max=50)
	@JsonProperty
	public String get糖尿病診断時年齢(){return this.糖尿病診断時年齢;}
	public void set糖尿病診断時年齢(final String 糖尿病診断時年齢){this.糖尿病診断時年齢=糖尿病診断時年齢;}

	@Length(max=50)
	@JsonProperty
	public String get高血圧診断時年齢(){return this.高血圧診断時年齢;}
	public void set高血圧診断時年齢(final String 高血圧診断時年齢){this.高血圧診断時年齢=高血圧診断時年齢;}

	@Length(max=50)
	@JsonProperty
	public String get高脂血症診断時年齢(){return this.高脂血症診断時年齢;}
	public void set高脂血症診断時年齢(final String 高脂血症診断時年齢){this.高脂血症診断時年齢=高脂血症診断時年齢;}

	@JsonProperty
	public String getHCV測定法(){return this.HCV測定法;}
	public void setHCV測定法(final String HCV測定法){this.HCV測定法=HCV測定法;}

	@Length(max=100)
	@JsonProperty
	public String get局在1(){return this.局在1;}
	public void set局在1(final String 局在1){this.局在1=局在1;}

	@Length(max=100)
	@JsonProperty
	public String get局在2(){return this.局在2;}
	public void set局在2(final String 局在2){this.局在2=局在2;}

	@Length(max=100)
	@JsonProperty
	public String get局在3(){return this.局在3;}
	public void set局在3(final String 局在3){this.局在3=局在3;}

	@Length(max=100)
	@JsonProperty
	public String get局在4(){return this.局在4;}
	public void set局在4(final String 局在4){this.局在4=局在4;}

	@Length(max=100)
	@JsonProperty
	public String get局在5(){return this.局在5;}
	public void set局在5(final String 局在5){this.局在5=局在5;}

	@Length(max=100)
	@JsonProperty
	public String getUS1(){return this.US1;}
	public void setUS1(final String US1){this.US1=US1;}

	@Length(max=100)
	@JsonProperty
	public String getUS2(){return this.US2;}
	public void setUS2(final String US2){this.US2=US2;}

	@Length(max=100)
	@JsonProperty
	public String getUS3(){return this.US3;}
	public void setUS3(final String US3){this.US3=US3;}

	@Length(max=100)
	@JsonProperty
	public String getUS4(){return this.US4;}
	public void setUS4(final String US4){this.US4=US4;}

	@Length(max=100)
	@JsonProperty
	public String getUS5(){return this.US5;}
	public void setUS5(final String US5){this.US5=US5;}

	@Length(max=100)
	@JsonProperty
	public String getCT1(){return this.CT1;}
	public void setCT1(final String T1){this.CT1=CT1;}

	@Length(max=100)
	@JsonProperty
	public String getCT2(){return this.CT2;}
	public void setCT2(final String T2){this.CT2=CT2;}

	@Length(max=100)
	@JsonProperty
	public String getCT3(){return this.CT3;}
	public void setCT3(final String T3){this.CT3=CT3;}

	@Length(max=100)
	@JsonProperty
	public String getCT4(){return this.CT4;}
	public void setCT4(final String T4){this.CT4=CT4;}

	@Length(max=100)
	@JsonProperty
	public String getCT5(){return this.CT5;}
	public void setCT5(final String T5){this.CT5=CT5;}

	@Length(max=255)
	@JsonProperty
	public String getMR1(){return this.MR1;}
	public void setMR1(final String MR1){this.MR1=MR1;}

	@Length(max=255)
	@JsonProperty
	public String getMR2(){return this.MR2;}
	public void setMR2(final String MR2){this.MR2=MR2;}

	@Length(max=255)
	@JsonProperty
	public String getMR3(){return this.MR3;}
	public void setMR3(final String MR3){this.MR3=MR3;}

	@Length(max=255)
	@JsonProperty
	public String getMR4(){return this.MR4;}
	public void setMR4(final String MR4){this.MR4=MR4;}

	@Length(max=255)
	@JsonProperty
	public String getMR5(){return this.MR5;}
	public void setMR5(final String MR5){this.MR5=MR5;}

	@Length(max=100)
	@JsonProperty
	public String getDSA1(){return this.DSA1;}
	public void setDSA1(final String DSA1){this.DSA1=DSA1;}

	@Length(max=100)
	@JsonProperty
	public String getDSA2(){return this.DSA2;}
	public void setDSA2(final String DSA2){this.DSA2=DSA2;}

	@Length(max=100)
	@JsonProperty
	public String getDSA3(){return this.DSA3;}
	public void setDSA3(final String DSA3){this.DSA3=DSA3;}

	@Length(max=100)
	@JsonProperty
	public String getDSA4(){return this.DSA4;}
	public void setDSA4(final String DSA4){this.DSA4=DSA4;}

	@Length(max=100)
	@JsonProperty
	public String getDSA5(){return this.DSA5;}
	public void setDSA5(final String DSA5){this.DSA5=DSA5;}

	@Length(max=100)
	@JsonProperty
	public String getCTA1(){return this.CTA1;}
	public void setCTA1(final String TA1){this.CTA1=CTA1;}

	@Length(max=100)
	@JsonProperty
	public String getCTA2(){return this.CTA2;}
	public void setCTA2(final String TA2){this.CTA2=CTA2;}

	@Length(max=100)
	@JsonProperty
	public String getCTA3(){return this.CTA3;}
	public void setCTA3(final String TA3){this.CTA3=CTA3;}

	@Length(max=100)
	@JsonProperty
	public String getCTA4(){return this.CTA4;}
	public void setCTA4(final String TA4){this.CTA4=CTA4;}

	@Length(max=100)
	@JsonProperty
	public String getCTA5(){return this.CTA5;}
	public void setCTA5(final String TA5){this.CTA5=CTA5;}

	@Length(max=100)
	@JsonProperty
	public String getCTAP1(){return this.CTAP1;}
	public void setCTAP1(final String TAP1){this.CTAP1=CTAP1;}

	@Length(max=100)
	@JsonProperty
	public String getCTAP2(){return this.CTAP2;}
	public void setCTAP2(final String TAP2){this.CTAP2=CTAP2;}

	@Length(max=100)
	@JsonProperty
	public String getCTAP3(){return this.CTAP3;}
	public void setCTAP3(final String TAP3){this.CTAP3=CTAP3;}

	@Length(max=100)
	@JsonProperty
	public String getCTAP4(){return this.CTAP4;}
	public void setCTAP4(final String TAP4){this.CTAP4=CTAP4;}

	@Length(max=100)
	@JsonProperty
	public String getCTAP5(){return this.CTAP5;}
	public void setCTAP5(final String TAP5){this.CTAP5=CTAP5;}

	@Length(max=100)
	@JsonProperty
	public String getCO2US1(){return this.CO2US1;}
	public void setCO2US1(final String O2US1){this.CO2US1=CO2US1;}

	@Length(max=100)
	@JsonProperty
	public String getCO2US2(){return this.CO2US2;}
	public void setCO2US2(final String O2US2){this.CO2US2=CO2US2;}

	@Length(max=100)
	@JsonProperty
	public String getCO2US3(){return this.CO2US3;}
	public void setCO2US3(final String O2US3){this.CO2US3=CO2US3;}

	@Length(max=100)
	@JsonProperty
	public String getCO2US4(){return this.CO2US4;}
	public void setCO2US4(final String O2US4){this.CO2US4=CO2US4;}

	@Length(max=100)
	@JsonProperty
	public String getCO2US5(){return this.CO2US5;}
	public void setCO2US5(final String O2US5){this.CO2US5=CO2US5;}

	@Length(max=100)
	@JsonProperty
	public String getSize1(){return this.size1;}
	public void setSize1(final String size1){this.size1=size1;}

	@Length(max=100)
	@JsonProperty
	public String getSize2(){return this.size2;}
	public void setSize2(final String size2){this.size2=size2;}

	@Length(max=100)
	@JsonProperty
	public String getSize3(){return this.size3;}
	public void setSize3(final String size3){this.size3=size3;}

	@Length(max=100)
	@JsonProperty
	public String getSize4(){return this.size4;}
	public void setSize4(final String size4){this.size4=size4;}

	@Length(max=100)
	@JsonProperty
	public String getSize5(){return this.size5;}
	public void setSize5(final String size5){this.size5=size5;}
	
	public FmHccPatient(){}
	
	public FmHccPatient(int rowID)
	{
		super(rowID);
	}
	
	@Id
	public Integer getRowID(){return this.rowID;}
}