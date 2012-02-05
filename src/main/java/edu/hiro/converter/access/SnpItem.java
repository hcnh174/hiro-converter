package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblSNP")
@Access(value=AccessType.FIELD)
public class SnpItem extends AbstractPatientItem
{	
	protected @Column(columnDefinition="TEXT") String 肝研ID頭文字="";
	protected Integer 肝研IDNo=null;
	protected @Column(columnDefinition="TEXT") String 他院患者No="";
	protected @Column(columnDefinition="TEXT") String 担当医="";
	protected Float 採血年齢=null;
	protected Date 採血日=null;
	protected Date 承諾確認日=null;
	protected @Column(columnDefinition="TEXT") String 身長="";
	protected @Column(columnDefinition="TEXT") String 体重="";
	protected @Column(columnDefinition="TEXT") String 疾患名="";
	protected @Column(columnDefinition="TEXT") String コメント="";
	protected @Column(columnDefinition="TEXT") String 同意書="";
	protected @Column(columnDefinition="TEXT") String genotype="";
	protected @Column(columnDefinition="TEXT") String 最終HCV判定="";
	protected @Column(columnDefinition="TEXT") String 糖尿病="";
	protected @Column(columnDefinition="TEXT") String 高脂血症="";
	protected @Column(columnDefinition="TEXT") String 高血圧="";
	protected @Column(columnDefinition="TEXT") String 病態="";
	protected Integer DBNo=null;
	protected @Column(columnDefinition="TEXT") String 転機="";
	protected Date 転機年月日=null;
	protected @Column(columnDefinition="TEXT") String IFN治療歴="";
	protected @Column(columnDefinition="TEXT") String 発癌有無="";
	protected Date 発癌初回確認日=null;
	protected Date 最終受診日=null;
	protected Date 更新日=null;
	protected Integer 匿名化No=null;
	protected Integer 肝癌ID=null;
}