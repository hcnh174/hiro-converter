package edu.hiro.converter.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	protected String sheetname;
	protected String num; // some identifying number
	protected String 患者名;
	protected String フリガナ;
	protected String 主治療施設;
	protected String status;
	protected String tx;
	protected String 治療履歴;
	protected String ifn履歴;
	protected String 日付;
	
	protected String mutant;//mutant
	@Column(name="hbsag") protected String HBsAg;//HBsAg
	@Column(name="hbsab") protected String HBsAb;//HBsAb
	@Column(name="hbeag") protected String HBeAg;//HBeAg
	@Column(name="hbeab") protected String HBeAb;//HBeAb
	@Column(name="hbcrag") protected String HBcrAg;//HBcrAg
	protected String probe;//probe
	@Column(name="dnap") protected String DNAp;//DNA-p
	@Column(name="tma") protected String TMA;//TMA
	@Column(name="pcr") protected String PCR;//PCR
	@Column(name="ast") protected String AST;//GOT
	@Column(name="alt") protected String ALT;//GPT;
	@Column(name="ggtp") protected String gGTP;//γ-GTP
	@Column(name="tbil") protected String TBil;//T-Bil
	@Column(name="alb") protected String ALB;//ALB
	@Column(name="plt") protected String PLT;//PLT
	@Column(name="pt") protected String PT;//PT
	@Column(name="cre") protected String Cre;//Cre
	@Column(name="bun") protected String BUN;//BUN
	@Column(name="afp") protected String AFP;//AFP
	@Column(name="pivka") protected String PIVKA;//PIVKA
}