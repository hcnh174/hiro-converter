package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl個人基本")
@Access(value=AccessType.FIELD)
public class BasicInfoItem extends AbstractPatientItem
{
	protected Date 初診日=null;
	protected @Column(columnDefinition="TEXT") String 家族歴の有無="";
	protected @Column(columnDefinition="TEXT") String 家族歴の備考="";
	protected @Column(columnDefinition="TEXT") String 輸血歴の有無="";
	protected Date 輸血年月日=null;
	protected @Column(columnDefinition="TEXT") String 輸血歴詳細="";
	protected @Column(columnDefinition="TEXT") String 飲酒歴の有無="";
	protected @Column(columnDefinition="TEXT") String 酒種="";
	protected @Column(columnDefinition="TEXT") String 一日飲酒量="";
	protected @Column(columnDefinition="TEXT") String 飲酒年="";
	protected @Column(columnDefinition="TEXT") String 総飲酒量="";
	protected @Column(columnDefinition="TEXT") String 酒量単位="";
	protected @Column(columnDefinition="TEXT") String 飲酒量の備考="";
	protected Date 肝炎の発見日=null;
	protected @Column(columnDefinition="TEXT") String 肝炎="";
	protected @Column(columnDefinition="TEXT") String 肝癌="";
	protected @Column(columnDefinition="TEXT") String 静脈瘤="";
	protected @Column(columnDefinition="TEXT") String IFN治療歴="";
	protected @Column(columnDefinition="TEXT") String 死亡の有無="";
	protected Date 予後確認日=null;
	protected @Column(columnDefinition="TEXT") String 死因="";
	protected @Column(columnDefinition="TEXT") String 治験の有無="";
	protected @Column(columnDefinition="TEXT") String 紹介元施設="";
	protected @Column(columnDefinition="TEXT") String 紹介医="";
	protected @Column(columnDefinition="TEXT") String 外来医="";
	protected @Column(columnDefinition="TEXT") String 糖尿病="";
	protected @Column(columnDefinition="TEXT") String 高血圧="";
	protected @Column(columnDefinition="TEXT") String 高脂血症="";
	protected Date 肝癌発見日=null;
	protected @Column(columnDefinition="TEXT") String その他の既往歴="";
	
	public BasicInfoItem() {}

	public BasicInfoItem(int 個人ID)
	{
		this.個人ID=個人ID;
	}
}