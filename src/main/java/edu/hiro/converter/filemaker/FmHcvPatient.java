package edu.hiro.converter.filemaker;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fmhcv")
@Access(value=AccessType.FIELD)
public class FmHcvPatient extends AbstractFmPatient
{
	protected @Column(columnDefinition="TEXT") String 患者ID;
	protected @Column(columnDefinition="TEXT") String 患者名;
	protected @Column(columnDefinition="TEXT") String フリガナ;
	protected @Column(columnDefinition="TEXT") String 初診日;
	protected @Column(columnDefinition="TEXT") String 生年月日;
	protected @Column(columnDefinition="TEXT") String 主治療施設;
	protected @Column(columnDefinition="TEXT") String 外来主治医;
	protected @Column(columnDefinition="TEXT") String IFN有無;
	protected @Column(columnDefinition="TEXT") String Tx種類1;
	protected @Column(columnDefinition="TEXT") String 治療開始日1;
	protected @Column(columnDefinition="TEXT") String 治療終了日1;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN1;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV1;
	protected @Column(columnDefinition="TEXT") String 治療効果1;
	protected @Column(columnDefinition="TEXT") String 治療備考1;
	protected @Column(columnDefinition="TEXT") String Tx種類2;
	protected @Column(columnDefinition="TEXT") String 治療開始日2;
	protected @Column(columnDefinition="TEXT") String 治療終了日2;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN2;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV2;
	protected @Column(columnDefinition="TEXT") String 治療効果2;
	protected @Column(columnDefinition="TEXT") String 治療備考2;
	protected @Column(columnDefinition="TEXT") String Tx種類3;
	protected @Column(columnDefinition="TEXT") String 治療開始日3;
	protected @Column(columnDefinition="TEXT") String 治療終了日3;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN3;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV3;
	protected @Column(columnDefinition="TEXT") String 治療効果3;
	protected @Column(columnDefinition="TEXT") String 治療備考3;
	protected @Column(columnDefinition="TEXT") String Tx種類4;
	protected @Column(columnDefinition="TEXT") String 治療開始日4;
	protected @Column(columnDefinition="TEXT") String 治療終了日4;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN4;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV4;
	protected @Column(columnDefinition="TEXT") String 治療効果4;
	protected @Column(columnDefinition="TEXT") String 治療備考4;
	protected @Column(columnDefinition="TEXT") String Tx種類5;
	protected @Column(columnDefinition="TEXT") String 治療開始日5;
	protected @Column(columnDefinition="TEXT") String 治療終了日5;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN5;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV5;
	protected @Column(columnDefinition="TEXT") String 治療効果5;
	protected @Column(columnDefinition="TEXT") String 治療備考5;
	protected @Column(columnDefinition="TEXT") String Tx種類6;
	protected @Column(columnDefinition="TEXT") String 治療開始日6;
	protected @Column(columnDefinition="TEXT") String 治療終了日6;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN6;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV6;
	protected @Column(columnDefinition="TEXT") String 治療効果6;
	protected @Column(columnDefinition="TEXT") String 治療備考6;
	protected @Column(columnDefinition="TEXT") String Tx種類7;
	protected @Column(columnDefinition="TEXT") String 治療開始日7;
	protected @Column(columnDefinition="TEXT") String 治療終了日7;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN7;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV7;
	protected @Column(columnDefinition="TEXT") String 治療効果7;
	protected @Column(columnDefinition="TEXT") String 治療備考7;
	protected @Column(columnDefinition="TEXT") String Tx種類8;
	protected @Column(columnDefinition="TEXT") String 治療開始日8;
	protected @Column(columnDefinition="TEXT") String 治療終了日8;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN8;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV8;
	protected @Column(columnDefinition="TEXT") String 治療効果8;
	protected @Column(columnDefinition="TEXT") String 治療備考8;
	protected @Column(columnDefinition="TEXT") String Tx種類9;
	protected @Column(columnDefinition="TEXT") String 治療開始日9;
	protected @Column(columnDefinition="TEXT") String 治療終了日9;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN9;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV9;
	protected @Column(columnDefinition="TEXT") String 治療効果9;
	protected @Column(columnDefinition="TEXT") String 治療備考9;
	protected @Column(columnDefinition="TEXT") String Tx種類10;
	protected @Column(columnDefinition="TEXT") String 治療開始日10;
	protected @Column(columnDefinition="TEXT") String 治療終了日10;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN10;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV10;
	protected @Column(columnDefinition="TEXT") String 治療効果10;
	protected @Column(columnDefinition="TEXT") String 治療備考10;
	protected @Column(columnDefinition="TEXT") String 診断;
	protected @Column(columnDefinition="TEXT") String DBno;
	protected @Column(columnDefinition="TEXT") String genotype;

	public FmHcvPatient(){}
	
	public FmHcvPatient(int rowID)
	{
		super(rowID);
	}
}