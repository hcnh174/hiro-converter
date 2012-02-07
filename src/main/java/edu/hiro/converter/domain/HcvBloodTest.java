package edu.hiro.converter.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.hiro.util.AbstractEntity;

@Entity
@Table(name="hcvbloodtests")
@Access(value=AccessType.FIELD)
public class HcvBloodTest extends AbstractEntity
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="SERIAL NOT NULL")
	protected Integer rowID=null;

	public Integer getRowID(){return this.rowID;}
	
	protected String idnum;
	protected String sheetname;
	protected String num; // some identifying number
	protected String 患者名;
	protected String status;
	protected String tx;
	protected String 治療履歴;
	protected String ifn履歴;
	protected String 日付;
	
	@Column(name="hcvamt") protected String hcvAMT; //hcv-AM-T
	@Column(name="hcvgeno") protected String hcvGENO; //hcv-GENO hcvジェノタイプ
	@Column(name="hcvtaq") protected String hcvtaq; //hcv(Taq
	
	@Column(name="hcvモニタジェノタイプ") protected String hcvモニタジェノタイプ;	                                                   
	@Column(name="hcvコアコウタイ") protected String hcvコアコウタイ;
	@Column(name="hcvコウゲン") protected String hcvコウゲン;
	@Column(name="hcvテイセイ") protected String hcvテイセイ; //hcvﾃｲｾｲ
	@Column(name="wbc") protected String WBC; //
	@Column(name="ne") protected String NE; //NE(%)
	@Column(name="hgb") protected String hgb; //
	@Column(name="plt") protected String plt; //
	@Column(name="ast") protected String AST; //GOT
	@Column(name="alt") protected String ALT; //GPT
	@Column(name="ggtp") protected String gGTP; //γ-GTP
	@Column(name="tbil") protected String TBil; //T-Bil
	@Column(name="dbil") protected String DBil; //D-Bil
	@Column(name="alph") protected String alph; //
	@Column(name="alb") protected String alb; //
	@Column(name="cre") protected String cre; //
	@Column(name="afp") protected String afp; //
	@Column(name="pt") protected String pt; //
	@Column(name="bs") protected String bs; //
	@Column(name="a1c") protected String a1c; //
	@Column(name="hdlcho") protected String HDLCHO; //HDL-CHO
	@Column(name="コレステロール") protected String コレステロール; //ｺﾚｽﾃﾛｰﾙ
	@Column(name="nonhdlc") protected String nonHDLC; //nonHDL-C
	@Column(name="ヒアルロン酸") protected String ヒアルロン酸; //ﾋｱﾙﾛﾝ酸
	@Column(name="ana") protected String ana; //
	@Column(name="マイクロゾーム") protected String マイクロゾーム;
	@Column(name="ft4") protected String FT4; //F-T4
	@Column(name="ft3") protected String FT3; //F-T3
	@Column(name="tsh") protected String tsh; //
	@Column(name="fe") protected String fe; //
	@Column(name="ins") protected String ins; //
	@Column(name="icgr") protected String ICGR; //ICG-R
	@Column(name="kl6") protected String KL6; //KL-6
	@Column(name="tg") protected String tg; //
	@Column(name="ferritin") protected String ferritin; //

	
	// inconsistent fields - same as one of the above?
//	protected String hba1c;
//	protected String glu;
//	protected String ptカッセイド;
//	protected String hcvモニタジ;
//	protected String hcvコアコウタ;
	protected String ヒアルロンサン;
//	protected String hcvジェノタイプ;
//	protected String tafp;
}