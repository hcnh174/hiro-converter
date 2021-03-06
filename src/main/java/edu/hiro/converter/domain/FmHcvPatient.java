package edu.hiro.converter.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fmhcv")
@Access(value=AccessType.FIELD)
public class FmHcvPatient extends AbstractPatient
{
	protected String 患者id;
	protected String 患者名;
	protected String フリガナ;
	protected String 初診日;
	protected String 生年月日;
	protected String 主治療施設;
	protected String 外来主治医;
	protected String ifn有無;
	protected String tx種類1;
	protected String 治療開始日1;
	protected String 治療終了日1;
	protected String 治療容量ifn1;
	protected String 治療容量rbv1;
	protected String 治療効果1;
	protected String 治療備考1;
	protected String tx種類2;
	protected String 治療開始日2;
	protected String 治療終了日2;
	protected String 治療容量ifn2;
	protected String 治療容量rbv2;
	protected String 治療効果2;
	protected String 治療備考2;
	protected String tx種類3;
	protected String 治療開始日3;
	protected String 治療終了日3;
	protected String 治療容量ifn3;
	protected String 治療容量rbv3;
	protected String 治療効果3;
	protected String 治療備考3;
	protected String tx種類4;
	protected String 治療開始日4;
	protected String 治療終了日4;
	protected String 治療容量ifn4;
	protected String 治療容量rbv4;
	protected String 治療効果4;
	protected String 治療備考4;
	protected String tx種類5;
	protected String 治療開始日5;
	protected String 治療終了日5;
	protected String 治療容量ifn5;
	protected String 治療容量rbv5;
	protected String 治療効果5;
	protected String 治療備考5;
	protected String tx種類6;
	protected String 治療開始日6;
	protected String 治療終了日6;
	protected String 治療容量ifn6;
	protected String 治療容量rbv6;
	protected String 治療効果6;
	protected String 治療備考6;
	protected String tx種類7;
	protected String 治療開始日7;
	protected String 治療終了日7;
	protected String 治療容量ifn7;
	protected String 治療容量rbv7;
	protected String 治療効果7;
	protected String 治療備考7;
	protected String tx種類8;
	protected String 治療開始日8;
	protected String 治療終了日8;
	protected String 治療容量ifn8;
	protected String 治療容量rbv8;
	protected String 治療効果8;
	protected String 治療備考8;
	protected String tx種類9;
	protected String 治療開始日9;
	protected String 治療終了日9;
	protected String 治療容量ifn9;
	protected String 治療容量rbv9;
	protected String 治療効果9;
	protected String 治療備考9;
	protected String tx種類10;
	protected String 治療開始日10;
	protected String 治療終了日10;
	protected String 治療容量ifn10;
	protected String 治療容量rbv10;
	protected String 治療効果10;
	protected String 治療備考10;
	protected String 診断;
	protected String dbno;
	protected String genotype;
}