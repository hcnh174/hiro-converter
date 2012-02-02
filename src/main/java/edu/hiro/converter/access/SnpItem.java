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
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
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
}