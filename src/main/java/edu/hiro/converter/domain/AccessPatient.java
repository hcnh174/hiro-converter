package edu.hiro.converter.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="access")
@Access(value=AccessType.FIELD)
public class AccessPatient extends AbstractPatient
{	
	protected String id;
	protected String 広大no;
	protected String 姓;
	protected String 名;
	protected String 生年月日;
	protected String 性別;
	protected String 肝研患者基本データシート_fp7;
	protected String 診断名;
	protected String hbvファイル_fp7;
	protected String hcvファイル_fp7;
	protected String snps肝研no;
	protected String ペグリバ通し番号;
	protected String ペグリバ通し番号2;//ﾍﾟｸﾞﾘﾊﾞ通し番号②
	protected String ペガシスシートno;
	protected String ペガシスシートno2;//ﾍﾟｶﾞｼｽｼｰﾄNo②
	protected String ペガシスシートno3;//ﾍﾟｶﾞｼｽｼｰﾄNo③
	protected String c型エクセル;
	protected String c型エクセル未作成;
	protected String 肝癌id;	 
}