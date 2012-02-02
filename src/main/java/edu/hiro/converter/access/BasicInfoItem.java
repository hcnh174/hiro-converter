package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl個人基本")
public class BasicInfoItem extends AbstractPatientItem
{
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected Date 初診日=null;
	protected String 家族歴の有無="";
	protected String 家族歴の備考="";
	protected String 輸血歴の有無="";
	protected Date 輸血年月日=null;
	protected String 輸血歴詳細="";
	protected String 飲酒歴の有無="";
	protected String 酒種="";
	protected String 一日飲酒量="";
	protected String 飲酒年="";
	protected String 総飲酒量="";
	protected String 酒量単位="";
	protected String 飲酒量の備考="";
	protected Date 肝炎の発見日=null;
	protected String 肝炎="";
	protected String 肝癌="";
	protected String 静脈瘤="";
	protected String IFN治療歴="";
	protected String 死亡の有無="";
	protected Date 予後確認日=null;
	protected String 死因="";
	protected String 治験の有無="";
	protected String 紹介元施設="";
	protected String 紹介医="";
	protected String 外来医="";
	protected String 糖尿病="";
	protected String 高血圧="";
	protected String 高脂血症="";
	protected Date 肝癌発見日=null;
	protected String その他の既往歴="";
	
	public BasicInfoItem() {}

	public BasicInfoItem(int 個人ID)
	{
		this.個人ID=個人ID;
	}
}