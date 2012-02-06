package edu.hiro.converter.filemaker;

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
	protected String 治療履歴;
	protected String ifn履歴;
	protected String 日付;
	protected String hcvamt;//hcv-AM-T;
	protected String hcvgeno;//hcv-GENO; hcvジェノタイプ
	protected String hcvtaq;//hcv(Taq;
	protected String hcvモニタジェノタイプ;//hcvﾓﾆﾀｼﾞｪﾉﾀｲﾌﾟ;
	protected String hcvコアコウタイ;//hcvｺｱｺｳﾀｲ;
	protected String hcvコウゲン;//hcvｺｳｹﾞﾝ;
	protected String hcvテイセイ;//hcvﾃｲｾｲ;
	protected String wbc;
	protected String ne;//NE(%);
	protected String hgb;
	protected String plt;
	protected String ast;//got
	protected String alt;//gpt;
	protected String ggtp;//γ-GTP;
	protected String tbil;//T-Bil;
	protected String dbil;//D-Bil;
	protected String alph;
	protected String alb;
	protected String cre;
	protected String afp;
	protected String pt;
	protected String bs;
	protected String a1c;
	protected String hdlcho;//HDL-CHO;
	protected String コレステロール;//ｺﾚｽﾃﾛｰﾙ;
	protected String nonhdlc;//nonHDL-C;
	protected String ヒアルロン酸;//ﾋｱﾙﾛﾝ酸;
	protected String ana;
	protected String マイクロゾーム;//ﾏｲｸﾛｿﾞｰﾑ;
	protected String ft4;//F-T4;
	protected String ft3;//F-T3;
	protected String tsh;
	protected String fe;
	protected String ins;
	protected String icgr;//ICG-R;
	protected String kl6;//KL-6;
	protected String tg;
	protected String ferritin;
	
	// inconsistent fields - same as one of the above?
	protected String hba1c;
	protected String glu;
	protected String ptカッセイド;
	protected String hcvモニタジ;
	protected String hcvコアコウタ;
	protected String ヒアルロンサン;
	protected String hcvジェノタイプ;
	protected String tafp;
}