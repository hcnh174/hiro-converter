package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl個人IFN")
public class InterferonItem extends AbstractPatientItem
{	
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected String 投与回数="";
	protected String IFN名="";
	protected Date 投与開始日=null;
	protected Date 投与終了日=null;
	protected String 投与法="";
	protected String 副作用="";
	protected String 中止時期理由="";
	protected Date GPT正常化日=null;
	protected Date HBeAg陰性化日=null;
	protected Date HBeAb陽性化日=null;
	protected Date HBVDNATMA陰性化日=null;
	protected String 投与施設="";
	protected String HCVRNA定性投与時="";
	protected String GPT投与時="";
	protected String HCVRNA投与終了日="";
	protected Integer GPTHCV投与終了日=null;
	protected String HCVRNA終了6ヵ月後="";
	protected Integer GPTHCV投与終了6ヵ月後=null;
	protected String 備考="";
	protected String HCVRNA投与前="";
	protected Float Hb=null;
	protected Integer AST=null;
	protected Integer GPT投与前=null;
	protected Float Plt投与前=null;
	protected Float Alb投与前=null;
	protected Float Plt投与終了時=null;
	protected Float Alb投与終了時=null;
	protected Float Plt投与6ヶ月以降=null;
	protected Float Alb投与6ヶ月以降=null;
	protected String 効果判定投与終了時BiochemicalResponse="";
	protected String 効果判定投与終了時VirologicalResponse="";
	protected String 効果判定投与6ヵ月後BiochemicalResponse="";
	protected String 効果判定投与6ヶ月後VirologicalResponse="";
	protected String HCVRNA投与前の単位="";
	protected String HCVRNA投与終了時の単位="";
	protected String HCVRNA投与6ヶ月後の単位="";
	protected Date 投与6ヶ月後の効果判定日=null;
	protected String Trial="";
	protected Integer No=null;
	protected String ﾚﾍﾞﾄｰﾙ="";
	protected Float PT初診時=null;
	protected Integer 治療2W目HCVRNA=null;
	protected String 治療2W目HCVRNAの単位="";
	protected Float 治療2W目Plt=null;
	protected Integer 治療4W目HCVRNA=null;
	protected String 治療4W目HCVRNAの単位="";
	protected Float 治療4W目Plt=null;
	protected String ﾍﾟｸﾞﾘﾊﾞ施設名="";
	protected Integer ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo=null;
	protected String ﾍﾟｶﾞｼｽ施設名="";
	protected Integer ﾍﾟｶﾞｼｽｼｰﾄNo=null;
	protected String Trial施設名="";
	protected String Trial施設ID="";
	protected String ﾍﾟｸﾞﾘﾊﾞ施設ID="";
	protected String ﾍﾟｶﾞｼｽ施設ID="";
	protected Integer gammaGTP治療前=null;
}