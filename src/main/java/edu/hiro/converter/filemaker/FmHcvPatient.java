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
	protected @Column(columnDefinition="TEXT") String 患者ID=null;
	protected @Column(columnDefinition="TEXT") String 患者名=null;
	protected @Column(columnDefinition="TEXT") String フリガナ=null;
	protected @Column(columnDefinition="TEXT") String 初診日=null;
	protected @Column(columnDefinition="TEXT") String 生年月日=null;
	protected @Column(columnDefinition="TEXT") String 主治療施設=null;
	protected @Column(columnDefinition="TEXT") String 外来主治医=null;
	protected @Column(columnDefinition="TEXT") String IFN有無=null;
	protected @Column(columnDefinition="TEXT") String Tx種類1=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日1=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日1=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN1=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV1=null;
	protected @Column(columnDefinition="TEXT") String 治療効果1=null;
	protected @Column(columnDefinition="TEXT") String 治療備考1=null;
	protected @Column(columnDefinition="TEXT") String Tx種類2=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日2=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日2=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN2=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV2=null;
	protected @Column(columnDefinition="TEXT") String 治療効果2=null;
	protected @Column(columnDefinition="TEXT") String 治療備考2=null;
	protected @Column(columnDefinition="TEXT") String Tx種類3=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日3=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日3=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN3=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV3=null;
	protected @Column(columnDefinition="TEXT") String 治療効果3=null;
	protected @Column(columnDefinition="TEXT") String 治療備考3=null;
	protected @Column(columnDefinition="TEXT") String Tx種類4=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日4=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日4=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN4=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV4=null;
	protected @Column(columnDefinition="TEXT") String 治療効果4=null;
	protected @Column(columnDefinition="TEXT") String 治療備考4=null;
	protected @Column(columnDefinition="TEXT") String Tx種類5=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日5=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日5=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN5=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV5=null;
	protected @Column(columnDefinition="TEXT") String 治療効果5=null;
	protected @Column(columnDefinition="TEXT") String 治療備考5=null;
	protected @Column(columnDefinition="TEXT") String Tx種類6=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日6=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日6=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN6=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV6=null;
	protected @Column(columnDefinition="TEXT") String 治療効果6=null;
	protected @Column(columnDefinition="TEXT") String 治療備考6=null;
	protected @Column(columnDefinition="TEXT") String Tx種類7=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日7=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日7=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN7=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV7=null;
	protected @Column(columnDefinition="TEXT") String 治療効果7=null;
	protected @Column(columnDefinition="TEXT") String 治療備考7=null;
	protected @Column(columnDefinition="TEXT") String Tx種類8=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日8=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日8=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN8=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV8=null;
	protected @Column(columnDefinition="TEXT") String 治療効果8=null;
	protected @Column(columnDefinition="TEXT") String 治療備考8=null;
	protected @Column(columnDefinition="TEXT") String Tx種類9=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日9=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日9=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN9=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV9=null;
	protected @Column(columnDefinition="TEXT") String 治療効果9=null;
	protected @Column(columnDefinition="TEXT") String 治療備考9=null;
	protected @Column(columnDefinition="TEXT") String Tx種類10=null;
	protected @Column(columnDefinition="TEXT") String 治療開始日10=null;
	protected @Column(columnDefinition="TEXT") String 治療終了日10=null;
	protected @Column(columnDefinition="TEXT") String 治療容量IFN10=null;
	protected @Column(columnDefinition="TEXT") String 治療容量RBV10=null;
	protected @Column(columnDefinition="TEXT") String 治療効果10=null;
	protected @Column(columnDefinition="TEXT") String 治療備考10=null;
	protected @Column(columnDefinition="TEXT") String 診断=null;
	protected @Column(columnDefinition="TEXT") String DBno=null;
	protected @Column(columnDefinition="TEXT") String genotype=null;

	public FmHcvPatient(){}
	
	public FmHcvPatient(int rowID)
	{
		super(rowID);
	}
}