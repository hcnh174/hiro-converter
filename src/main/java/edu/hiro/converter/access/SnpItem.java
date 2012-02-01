package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tblSNP")
public class SnpItem extends AbstractPatientItem
{	
	protected String 肝研ID頭文字="";
	protected Integer 肝研IDNo=null;
	protected String 他院患者No="";
	protected String 担当医="";
	protected Float 採血年齢=null;
	protected Date 採血日=null;
	protected Date 承諾確認日=null;
	protected String 身長="";
	protected String 体重="";
	protected String 疾患名="";
	protected String コメント="";
	protected String 同意書="";
	protected String genotype="";
	protected String 最終HCV判定="";
	protected String 糖尿病="";
	protected String 高脂血症="";
	protected String 高血圧="";
	protected String 病態="";
	protected Integer DBNo=null;
	protected String 転機="";
	protected Date 転機年月日=null;
	protected String IFN治療歴="";
	protected String 発癌有無="";
	protected Date 発癌初回確認日=null;
	protected Date 最終受診日=null;
	protected Date 更新日=null;
	protected Integer 匿名化No=null;
	protected Integer 肝癌ID=null;

	@Length(max=255) @NotNull
	public String get肝研ID頭文字(){return this.肝研ID頭文字;}
	public void set肝研ID頭文字(final String 肝研ID頭文字){this.肝研ID頭文字=肝研ID頭文字;}

	public Integer get肝研IDNo(){return this.肝研IDNo;}
	public void set肝研IDNo(final Integer 肝研IDNo){this.肝研IDNo=肝研IDNo;}

	@Length(max=12) @NotNull
	public String get他院患者No(){return this.他院患者No;}
	public void set他院患者No(final String 他院患者No){this.他院患者No=他院患者No;}

	@Length(max=15) @NotNull
	public String get担当医(){return this.担当医;}
	public void set担当医(final String 担当医){this.担当医=担当医;}

	public Float get採血年齢(){return this.採血年齢;}
	public void set採血年齢(final Float 採血年齢){this.採血年齢=採血年齢;}

	public Date get採血日(){return this.採血日;}
	public void set採血日(final Date 採血日){this.採血日=採血日;}

	public Date get承諾確認日(){return this.承諾確認日;}
	public void set承諾確認日(final Date 承諾確認日){this.承諾確認日=承諾確認日;}

	@Length(max=50) @NotNull
	public String get身長(){return this.身長;}
	public void set身長(final String 身長){this.身長=身長;}

	@Length(max=50) @NotNull
	public String get体重(){return this.体重;}
	public void set体重(final String 体重){this.体重=体重;}

	@Length(max=255) @NotNull
	public String get疾患名(){return this.疾患名;}
	public void set疾患名(final String 疾患名){this.疾患名=疾患名;}

	@Length(max=150) @NotNull
	public String getコメント(){return this.コメント;}
	public void setコメント(final String コメント){this.コメント=コメント;}

	@Length(max=10) @NotNull
	public String get同意書(){return this.同意書;}
	public void set同意書(final String 同意書){this.同意書=同意書;}

	@Length(max=10) @NotNull
	public String getGenotype(){return this.genotype;}
	public void setGenotype(final String genotype){this.genotype=genotype;}

	@Length(max=10) @NotNull
	public String get最終HCV判定(){return this.最終HCV判定;}
	public void set最終HCV判定(final String 最終HCV判定){this.最終HCV判定=最終HCV判定;}

	@Length(max=20) @NotNull
	public String get糖尿病(){return this.糖尿病;}
	public void set糖尿病(final String 糖尿病){this.糖尿病=糖尿病;}

	@Length(max=20) @NotNull
	public String get高脂血症(){return this.高脂血症;}
	public void set高脂血症(final String 高脂血症){this.高脂血症=高脂血症;}

	@Length(max=50) @NotNull
	public String get高血圧(){return this.高血圧;}
	public void set高血圧(final String 高血圧){this.高血圧=高血圧;}

	@Length(max=50) @NotNull
	public String get病態(){return this.病態;}
	public void set病態(final String 病態){this.病態=病態;}

	public Integer getDBNo(){return this.DBNo;}
	public void setDBNo(final Integer DBNo){this.DBNo=DBNo;}

	@Length(max=50) @NotNull
	public String get転機(){return this.転機;}
	public void set転機(final String 転機){this.転機=転機;}

	public Date get転機年月日(){return this.転機年月日;}
	public void set転機年月日(final Date 転機年月日){this.転機年月日=転機年月日;}

	@Length(max=50) @NotNull
	public String getIFN治療歴(){return this.IFN治療歴;}
	public void setIFN治療歴(final String IFN治療歴){this.IFN治療歴=IFN治療歴;}

	@Length(max=50) @NotNull
	public String get発癌有無(){return this.発癌有無;}
	public void set発癌有無(final String 発癌有無){this.発癌有無=発癌有無;}

	public Date get発癌初回確認日(){return this.発癌初回確認日;}
	public void set発癌初回確認日(final Date 発癌初回確認日){this.発癌初回確認日=発癌初回確認日;}

	public Date get最終受診日(){return this.最終受診日;}
	public void set最終受診日(final Date 最終受診日){this.最終受診日=最終受診日;}

	public Date get更新日(){return this.更新日;}
	public void set更新日(final Date 更新日){this.更新日=更新日;}

	public Integer get匿名化No(){return this.匿名化No;}
	public void set匿名化No(final Integer 匿名化No){this.匿名化No=匿名化No;}

	public Integer get肝癌ID(){return this.肝癌ID;}
	public void set肝癌ID(final Integer 肝癌ID){this.肝癌ID=肝癌ID;}


	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}