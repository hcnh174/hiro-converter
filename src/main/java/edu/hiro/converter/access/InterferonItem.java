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

	
	@Length(max=5)
	public String get投与回数(){return this.投与回数;}
	public void set投与回数(final String 投与回数){this.投与回数=投与回数;}

	@Length(max=50)
	public String getIFN名(){return this.IFN名;}
	public void setIFN名(final String IFN名){this.IFN名=IFN名;}

	public Date get投与開始日(){return this.投与開始日;}
	public void set投与開始日(final Date 投与開始日){this.投与開始日=投与開始日;}

	public Date get投与終了日(){return this.投与終了日;}
	public void set投与終了日(final Date 投与終了日){this.投与終了日=投与終了日;}

	@Length(max=50)
	public String get投与法(){return this.投与法;}
	public void set投与法(final String 投与法){this.投与法=投与法;}

	@Length(max=200)
	public String get副作用(){return this.副作用;}
	public void set副作用(final String 副作用){this.副作用=副作用;}

	public String get中止時期理由(){return this.中止時期理由;}
	public void set中止時期理由(final String 中止時期理由){this.中止時期理由=中止時期理由;}

	public Date getGPT正常化日(){return this.GPT正常化日;}
	public void setGPT正常化日(final Date GPT正常化日){this.GPT正常化日=GPT正常化日;}

	public Date getHBeAg陰性化日(){return this.HBeAg陰性化日;}
	public void setHBeAg陰性化日(final Date HBeAg陰性化日){this.HBeAg陰性化日=HBeAg陰性化日;}

	public Date getHBeAb陽性化日(){return this.HBeAb陽性化日;}
	public void setHBeAb陽性化日(final Date HBeAb陽性化日){this.HBeAb陽性化日=HBeAb陽性化日;}

	public Date getHBVDNATMA陰性化日(){return this.HBVDNATMA陰性化日;}
	public void setHBVDNATMA陰性化日(final Date HBVDNATMA陰性化日){this.HBVDNATMA陰性化日=HBVDNATMA陰性化日;}

	@Length(max=20)
	public String get投与施設(){return this.投与施設;}
	public void set投与施設(final String 投与施設){this.投与施設=投与施設;}

	@Length(max=6)
	public String getHCVRNA定性投与時(){return this.HCVRNA定性投与時;}
	public void setHCVRNA定性投与時(final String HCVRNA定性投与時){this.HCVRNA定性投与時=HCVRNA定性投与時;}

	@Length(max=6)
	public String getGPT投与時(){return this.GPT投与時;}
	public void setGPT投与時(final String GPT投与時){this.GPT投与時=GPT投与時;}

	@Length(max=50)
	public String getHCVRNA投与終了日(){return this.HCVRNA投与終了日;}
	public void setHCVRNA投与終了日(final String HCVRNA投与終了日){this.HCVRNA投与終了日=HCVRNA投与終了日;}

	public Integer getGPTHCV投与終了日(){return this.GPTHCV投与終了日;}
	public void setGPTHCV投与終了日(final Integer GPTHCV投与終了日){this.GPTHCV投与終了日=GPTHCV投与終了日;}

	@Length(max=50)
	public String getHCVRNA終了6ヵ月後(){return this.HCVRNA終了6ヵ月後;}
	public void setHCVRNA終了6ヵ月後(final String HCVRNA終了6ヵ月後){this.HCVRNA終了6ヵ月後=HCVRNA終了6ヵ月後;}

	public Integer getGPTHCV投与終了6ヵ月後(){return this.GPTHCV投与終了6ヵ月後;}
	public void setGPTHCV投与終了6ヵ月後(final Integer GPTHCV投与終了6ヵ月後){this.GPTHCV投与終了6ヵ月後=GPTHCV投与終了6ヵ月後;}

	@Length(max=100)
	public String get備考(){return this.備考;}
	public void set備考(final String 備考){this.備考=備考;}

	@Length(max=20)
	public String getHCVRNA投与前(){return this.HCVRNA投与前;}
	public void setHCVRNA投与前(final String HCVRNA投与前){this.HCVRNA投与前=HCVRNA投与前;}

	public Float getHb(){return this.Hb;}
	public void setHb(final Float Hb){this.Hb=Hb;}

	public Integer getAST(){return this.AST;}
	public void setAST(final Integer AST){this.AST=AST;}

	public Integer getGPT投与前(){return this.GPT投与前;}
	public void setGPT投与前(final Integer GPT投与前){this.GPT投与前=GPT投与前;}

	public Float getPlt投与前(){return this.Plt投与前;}
	public void setPlt投与前(final Float Plt投与前){this.Plt投与前=Plt投与前;}

	public Float getAlb投与前(){return this.Alb投与前;}
	public void setAlb投与前(final Float Alb投与前){this.Alb投与前=Alb投与前;}

	public Float getPlt投与終了時(){return this.Plt投与終了時;}
	public void setPlt投与終了時(final Float Plt投与終了時){this.Plt投与終了時=Plt投与終了時;}

	public Float getAlb投与終了時(){return this.Alb投与終了時;}
	public void setAlb投与終了時(final Float Alb投与終了時){this.Alb投与終了時=Alb投与終了時;}

	public Float getPlt投与6ヶ月以降(){return this.Plt投与6ヶ月以降;}
	public void setPlt投与6ヶ月以降(final Float Plt投与6ヶ月以降){this.Plt投与6ヶ月以降=Plt投与6ヶ月以降;}

	public Float getAlb投与6ヶ月以降(){return this.Alb投与6ヶ月以降;}
	public void setAlb投与6ヶ月以降(final Float Alb投与6ヶ月以降){this.Alb投与6ヶ月以降=Alb投与6ヶ月以降;}

	@Length(max=10)
	public String get効果判定投与終了時BiochemicalResponse(){return this.効果判定投与終了時BiochemicalResponse;}
	public void set効果判定投与終了時BiochemicalResponse(final String 効果判定投与終了時BiochemicalResponse){this.効果判定投与終了時BiochemicalResponse=効果判定投与終了時BiochemicalResponse;}

	@Length(max=10)
	public String get効果判定投与終了時VirologicalResponse(){return this.効果判定投与終了時VirologicalResponse;}
	public void set効果判定投与終了時VirologicalResponse(final String 効果判定投与終了時VirologicalResponse){this.効果判定投与終了時VirologicalResponse=効果判定投与終了時VirologicalResponse;}

	@Length(max=10)
	public String get効果判定投与6ヵ月後BiochemicalResponse(){return this.効果判定投与6ヵ月後BiochemicalResponse;}
	public void set効果判定投与6ヵ月後BiochemicalResponse(final String 効果判定投与6ヵ月後BiochemicalResponse){this.効果判定投与6ヵ月後BiochemicalResponse=効果判定投与6ヵ月後BiochemicalResponse;}

	@Length(max=10)
	public String get効果判定投与6ヶ月後VirologicalResponse(){return this.効果判定投与6ヶ月後VirologicalResponse;}
	public void set効果判定投与6ヶ月後VirologicalResponse(final String 効果判定投与6ヶ月後VirologicalResponse){this.効果判定投与6ヶ月後VirologicalResponse=効果判定投与6ヶ月後VirologicalResponse;}

	@Length(max=10)
	public String getHCVRNA投与前の単位(){return this.HCVRNA投与前の単位;}
	public void setHCVRNA投与前の単位(final String HCVRNA投与前の単位){this.HCVRNA投与前の単位=HCVRNA投与前の単位;}

	@Length(max=10)
	public String getHCVRNA投与終了時の単位(){return this.HCVRNA投与終了時の単位;}
	public void setHCVRNA投与終了時の単位(final String HCVRNA投与終了時の単位){this.HCVRNA投与終了時の単位=HCVRNA投与終了時の単位;}

	@Length(max=10)
	public String getHCVRNA投与6ヶ月後の単位(){return this.HCVRNA投与6ヶ月後の単位;}
	public void setHCVRNA投与6ヶ月後の単位(final String HCVRNA投与6ヶ月後の単位){this.HCVRNA投与6ヶ月後の単位=HCVRNA投与6ヶ月後の単位;}

	public Date get投与6ヶ月後の効果判定日(){return this.投与6ヶ月後の効果判定日;}
	public void set投与6ヶ月後の効果判定日(final Date 投与6ヶ月後の効果判定日){this.投与6ヶ月後の効果判定日=投与6ヶ月後の効果判定日;}

	@Length(max=10)
	public String getTrial(){return this.Trial;}
	public void setTrial(final String Trial){this.Trial=Trial;}

	public Integer getNo(){return this.No;}
	public void setNo(final Integer No){this.No=No;}

	@Length(max=30)
	public String getﾚﾍﾞﾄｰﾙ(){return this.ﾚﾍﾞﾄｰﾙ;}
	public void setﾚﾍﾞﾄｰﾙ(final String ﾚﾍﾞﾄｰﾙ){this.ﾚﾍﾞﾄｰﾙ=ﾚﾍﾞﾄｰﾙ;}

	public Float getPT初診時(){return this.PT初診時;}
	public void setPT初診時(final Float PT初診時){this.PT初診時=PT初診時;}

	public Integer get治療2W目HCVRNA(){return this.治療2W目HCVRNA;}
	public void set治療2W目HCVRNA(final Integer 治療2W目HCVRNA){this.治療2W目HCVRNA=治療2W目HCVRNA;}

	@Length(max=50)
	public String get治療2W目HCVRNAの単位(){return this.治療2W目HCVRNAの単位;}
	public void set治療2W目HCVRNAの単位(final String 治療2W目HCVRNAの単位){this.治療2W目HCVRNAの単位=治療2W目HCVRNAの単位;}

	public Float get治療2W目Plt(){return this.治療2W目Plt;}
	public void set治療2W目Plt(final Float 治療2W目Plt){this.治療2W目Plt=治療2W目Plt;}

	public Integer get治療4W目HCVRNA(){return this.治療4W目HCVRNA;}
	public void set治療4W目HCVRNA(final Integer 治療4W目HCVRNA){this.治療4W目HCVRNA=治療4W目HCVRNA;}

	@Length(max=50)
	public String get治療4W目HCVRNAの単位(){return this.治療4W目HCVRNAの単位;}
	public void set治療4W目HCVRNAの単位(final String 治療4W目HCVRNAの単位){this.治療4W目HCVRNAの単位=治療4W目HCVRNAの単位;}

	public Float get治療4W目Plt(){return this.治療4W目Plt;}
	public void set治療4W目Plt(final Float 治療4W目Plt){this.治療4W目Plt=治療4W目Plt;}

	@Length(max=50)
	public String getﾍﾟｸﾞﾘﾊﾞ施設名(){return this.ﾍﾟｸﾞﾘﾊﾞ施設名;}
	public void setﾍﾟｸﾞﾘﾊﾞ施設名(final String ﾍﾟｸﾞﾘﾊﾞ施設名){this.ﾍﾟｸﾞﾘﾊﾞ施設名=ﾍﾟｸﾞﾘﾊﾞ施設名;}

	public Integer getﾍﾟｸﾞﾘﾊﾞｼｰﾄNo(){return this.ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo;}
	public void setﾍﾟｸﾞﾘﾊﾞｼｰﾄNo(final Integer ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo){this.ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo=ﾍﾟｸﾞﾘﾊﾞｼｰﾄNo;}

	@Length(max=50)
	public String getﾍﾟｶﾞｼｽ施設名(){return this.ﾍﾟｶﾞｼｽ施設名;}
	public void setﾍﾟｶﾞｼｽ施設名(final String ﾍﾟｶﾞｼｽ施設名){this.ﾍﾟｶﾞｼｽ施設名=ﾍﾟｶﾞｼｽ施設名;}

	public Integer getﾍﾟｶﾞｼｽｼｰﾄNo(){return this.ﾍﾟｶﾞｼｽｼｰﾄNo;}
	public void setﾍﾟｶﾞｼｽｼｰﾄNo(final Integer ﾍﾟｶﾞｼｽｼｰﾄNo){this.ﾍﾟｶﾞｼｽｼｰﾄNo=ﾍﾟｶﾞｼｽｼｰﾄNo;}

	@Length(max=50)
	public String getTrial施設名(){return this.Trial施設名;}
	public void setTrial施設名(final String Trial施設名){this.Trial施設名=Trial施設名;}

	@Length(max=50)
	public String getTrial施設ID(){return this.Trial施設ID;}
	public void setTrial施設ID(final String Trial施設ID){this.Trial施設ID=Trial施設ID;}

	@Length(max=50)
	public String getﾍﾟｸﾞﾘﾊﾞ施設ID(){return this.ﾍﾟｸﾞﾘﾊﾞ施設ID;}
	public void setﾍﾟｸﾞﾘﾊﾞ施設ID(final String ﾍﾟｸﾞﾘﾊﾞ施設ID){this.ﾍﾟｸﾞﾘﾊﾞ施設ID=ﾍﾟｸﾞﾘﾊﾞ施設ID;}

	@Length(max=50)
	public String getﾍﾟｶﾞｼｽ施設ID(){return this.ﾍﾟｶﾞｼｽ施設ID;}
	public void setﾍﾟｶﾞｼｽ施設ID(final String ﾍﾟｶﾞｼｽ施設ID){this.ﾍﾟｶﾞｼｽ施設ID=ﾍﾟｶﾞｼｽ施設ID;}

	public Integer getGammaGTP治療前(){return this.gammaGTP治療前;}
	public void setGammaGTP治療前(final Integer gammaGTP治療前){this.gammaGTP治療前=gammaGTP治療前;}
	
	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}