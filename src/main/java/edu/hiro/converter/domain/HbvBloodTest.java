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
@Table(name="hbvbloodtests")
@Access(value=AccessType.FIELD)
public class HbvBloodTest extends AbstractEntity
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
	
	protected String mutant;//mutant
	protected String hbsag;//HBsAg
	protected String hbsab;//HBsAb
	protected String hbeag;//HBeAg
	protected String hbeab;//HBeAb
	protected String hbcrag;//HBcrAg
	protected String probe;//probe
	protected String dnap;//DNA-p
	protected String tma;//TMA
	protected String pcr;//PCR
	protected String ast;//GOT
	protected String alt;//GPT;
	protected String ggtp;//γ-GTP
	protected String tbil;//T-Bil
	protected String alb;//ALB
	protected String plt;//PLT
	protected String pt;//PT
	protected String cre;//Cre
	protected String bun;//BUN
	protected String afp;//AFP
	protected String pivka;//PIVKA

	// inconsistent fields
	protected String icg;//icg(r15)
	protected String pc;//pc
	//pc
}