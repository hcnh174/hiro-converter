package edu.hiro.converter.access;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import edu.hiro.util.AbstractEntity;
import edu.hiro.util.CException;

@Entity
@Table(name="tbl個人")
public class AccessPatient extends AbstractEntity
{
	@Id @NotNull protected Integer 個人ID=null;
	protected String 患者ID=null;
	protected String 患者名="";
	protected String フリガナ="";
	protected Date 生年月日=null;
	protected String 性別=null;
	protected String 旧姓="";
	
//	protected Set<BasicInfoItem> basicInfoItems=new LinkedHashSet<BasicInfoItem>(); //個人基本
//	protected Set<SnpItem> snps=new LinkedHashSet<SnpItem>(); //SNP
//	protected Set<SnpAnonymizationItem> snpAnonymizations=new LinkedHashSet<SnpAnonymizationItem>(); //SNP匿名化番号
//	protected Set<InterferonItem> interferonItems=new LinkedHashSet<InterferonItem>(); //個人IFN
//	protected Set<PrimaryDiseaseItem> diseases=new LinkedHashSet<PrimaryDiseaseItem>(); //個人主病名
//	protected Set<BiopsyItem> biopsies=new LinkedHashSet<BiopsyItem>(); //個人肝生検
//	protected Set<HospitalizationItem> hospitalizations=new LinkedHashSet<HospitalizationItem>(); //入院台帳
//	protected Set<BiopsyAnonymizationItem> biopsyAnonymizations=new LinkedHashSet<BiopsyAnonymizationItem>(); //肝生検匿名化番号	
	
	public Integer get個人ID(){return this.個人ID;}


	/*
	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CBasicInfoItem> getBasicInfoItems(){return this.basicInfoItems;}
	public void setBasicInfoItems(final Set<CBasicInfoItem> basicInfoItems){this.basicInfoItems=basicInfoItems;}
	
	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CSnpItem> getSnps(){return this.snps;}
	public void setSnps(final Set<CSnpItem> snps){this.snps=snps;}

	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CSnpAnonymizationItem> getSnpAnonymizations(){return this.snpAnonymizations;}
	public void setSnpAnonymizations(final Set<CSnpAnonymizationItem> snpAnonymizations){this.snpAnonymizations=snpAnonymizations;}
	
	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CInterferonItem> getInterferonItems(){return this.interferonItems;}
	public void setInterferonItems(final Set<CInterferonItem> interferonItems){this.interferonItems=interferonItems;}

	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CPrimaryDiseaseItem> getDiseases(){return this.diseases;}
	public void setDiseases(final Set<CPrimaryDiseaseItem> diseases){this.diseases=diseases;}

	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CBiopsyItem> getBiopsies(){return this.biopsies;}
	public void setBiopsies(final Set<CBiopsyItem> biopsies){this.biopsies=biopsies;}

	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CHospitalizationItem> getHospitalizations(){return this.hospitalizations;}
	public void setHospitalizations(final Set<CHospitalizationItem> hospitalizations){this.hospitalizations=hospitalizations;}

	@OneToMany(mappedBy="個人ID",cascade=CascadeType.ALL)
	@OrderBy("id")
	public Set<CBiopsyAnonymizationItem> getBiopsyAnonymizations(){return this.biopsyAnonymizations;}
	public void setBiopsyAnonymizations(final Set<CBiopsyAnonymizationItem> biopsyAnonymizations){this.biopsyAnonymizations=biopsyAnonymizations;}
	*/
	
	public AccessPatient() {}

	public AccessPatient(int 個人ID)
	{
		this.個人ID=個人ID;
	}
	
	public void initialize()
	{
		/*
		Hibernate.initialize(this.basicInfoItems);
		Hibernate.initialize(this.snps);
		Hibernate.initialize(this.snpAnonymizations);
		Hibernate.initialize(this.interferonItems);
		Hibernate.initialize(this.diseases);
		Hibernate.initialize(this.biopsies);
		Hibernate.initialize(this.hospitalizations);
		Hibernate.initialize(this.biopsyAnonymizations);
		*/
	}
	
	//@Transient
	//public Integer getId(){return this.個人ID;}
//
//	@SuppressWarnings("unchecked")
//	public void addItem(AbstractPatientItem item)
//	{
//		Set<AbstractPatientItem> items=(Set<AbstractPatientItem>)getItems(item);
//		item.setPatient(this);
//		items.add((AbstractPatientItem)item);
//	}
//
//	public Set<? extends AbstractPatientItem> getItems(AbstractPatientItem item)
//	{
//		if (item instanceof BasicInfoItem)
//			return this.basicInfoItems;
//		else if (item instanceof SnpItem)
//			return this.snps;
//		else if (item instanceof SnpAnonymizationItem)
//			return this.snpAnonymizations;
//		else if (item instanceof InterferonItem)
//			return this.interferonItems;
//		else if (item instanceof PrimaryDiseaseItem)
//			return this.diseases;
//		else if (item instanceof BiopsyItem)
//			return this.biopsies;
//		else if (item instanceof HospitalizationItem)
//			return this.hospitalizations;
//		else if (item instanceof BiopsyAnonymizationItem)
//			return this.biopsyAnonymizations;
//		throw new CException("No handler for item type: "+item.getClass().getName());
//	}
}