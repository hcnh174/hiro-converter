package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl個人IFN")
@Access(value=AccessType.FIELD)
public class InterferonItem extends AbstractPatientItem
{
	protected @Column(columnDefinition="TEXT") String 投与回数="";
	protected @Column(columnDefinition="TEXT") String IFN名="";
	protected Date 投与開始日=null;
	protected Date 投与終了日=null;
	protected @Column(columnDefinition="TEXT") String 投与法="";
	protected @Column(columnDefinition="TEXT") String 副作用="";
	protected @Column(columnDefinition="TEXT") String 中止時期理由="";
	protected Date GPT正常化日=null;
	protected Date HBeAg陰性化日=null;
	protected Date HBeAb陽性化日=null;
	protected Date HBVDNATMA陰性化日=null;
	protected @Column(columnDefinition="TEXT") String 投与施設="";
	protected @Column(columnDefinition="TEXT") String HCVRNA定性投与時="";
	protected @Column(columnDefinition="TEXT") String GPT投与時="";
	protected @Column(columnDefinition="TEXT") String HCVRNA投与終了日="";
	protected Integer GPTHCV投与終了日=null;
	protected @Column(columnDefinition="TEXT") String HCVRNA終了6ヵ月後="";
	protected Integer GPTHCV投与終了6ヵ月後=null;
	protected @Column(columnDefinition="TEXT") String 備考="";
	protected @Column(columnDefinition="TEXT") String HCVRNA投与前="";
	protected Float Hb=null;
	protected Integer AST=null;
	protected Integer GPT投与前=null;
	protected Float Plt投与前=null;
	protected Float Alb投与前=null;
	protected Float Plt投与終了時=null;
	protected Float Alb投与終了時=null;
	protected Float Plt投与6ヶ月以降=null;
	protected Float Alb投与6ヶ月以降=null;
	protected @Column(columnDefinition="TEXT") String 効果判定投与終了時BiochemicalResponse="";
	protected @Column(columnDefinition="TEXT") String 効果判定投与終了時VirologicalResponse="";
	protected @Column(columnDefinition="TEXT") String 効果判定投与6ヵ月後BiochemicalResponse="";
	protected @Column(columnDefinition="TEXT") String 効果判定投与6ヶ月後VirologicalResponse="";
	protected @Column(columnDefinition="TEXT") String HCVRNA投与前の単位="";
	protected @Column(columnDefinition="TEXT") String HCVRNA投与終了時の単位="";
	protected @Column(columnDefinition="TEXT") String HCVRNA投与6ヶ月後の単位="";
	protected Date 投与6ヶ月後の効果判定日=null;
	protected @Column(columnDefinition="TEXT") String Trial="";
	protected Integer No=null;
	protected @Column(columnDefinition="TEXT") String ﾚﾍﾞﾄｰﾙ="";
	protected Float PT初診時=null;
	protected Integer 治療2W目HCVRNA=null;
	protected @Column(columnDefinition="TEXT") String 治療2W目HCVRNAの単位="";
	protected Float 治療2W目Plt=null;
	protected Integer 治療4W目HCVRNA=null;
	protected @Column(columnDefinition="TEXT") String 治療4W目HCVRNAの単位="";
	protected Float 治療4W目Plt=null;
	protected @Column(columnDefinition="TEXT") String ﾍﾟｸﾞﾘﾊﾞ施設名="";
	protected Integer ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo=null;
	protected @Column(columnDefinition="TEXT") String ﾍﾟｶﾞｼｽ施設名="";
	protected Integer ﾍﾟｶﾞｼｽｼｰﾄNo=null;
	protected @Column(columnDefinition="TEXT") String Trial施設名="";
	protected @Column(columnDefinition="TEXT") String Trial施設ID="";
	protected @Column(columnDefinition="TEXT") String ﾍﾟｸﾞﾘﾊﾞ施設ID="";
	protected @Column(columnDefinition="TEXT") String ﾍﾟｶﾞｼｽ施設ID="";
	protected Integer gammaGTP治療前=null;
}