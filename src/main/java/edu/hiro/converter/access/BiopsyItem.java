package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl個人肝生検")
@Access(value=AccessType.FIELD)
public class BiopsyItem extends AbstractPatientItem
{
	protected Integer number=null;
	protected @Column(columnDefinition="TEXT") String 標本番号="";
	protected Date 肝生検日=null;
	protected @Column(columnDefinition="TEXT") String 臨床診断="";
	protected @Column(columnDefinition="TEXT") String 病理組織診断="";
	protected @Column(columnDefinition="TEXT") String ヨーロッパ分類="";
	protected @Column(columnDefinition="TEXT") String 新犬山分類F="";
	protected @Column(columnDefinition="TEXT") String 新犬山分類A="";
	protected @Column(columnDefinition="TEXT") String Scheuer分類="";
	protected @Column(columnDefinition="TEXT") String 分化度="";
	protected @Column(columnDefinition="TEXT") String 腹腔鏡の有無="";
	protected @Column(columnDefinition="TEXT") String 同意書の有無="";
	protected @Column(columnDefinition="TEXT") String サマリー="";
	protected @Column(columnDefinition="TEXT") String 指導医="";
	protected Integer 血小板=null;
	protected @Column(columnDefinition="TEXT") String 出血時間="";
	protected Integer 穿刺回数=null;
	protected @Column(columnDefinition="TEXT") String 施行者="";
	protected @Column(columnDefinition="TEXT") String 備考="";
}
