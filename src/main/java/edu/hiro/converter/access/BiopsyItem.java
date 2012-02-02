package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl個人肝生検")
public class BiopsyItem extends AbstractPatientItem
{
	@Id protected Integer id;
	
	public Integer getId(){return this.id;}
	public void setId(int id){this.id=id;}
	
	protected Integer number=null;
	protected String 標本番号="";
	protected Date 肝生検日=null;
	protected String 臨床診断="";
	protected String 病理組織診断="";
	protected String ヨーロッパ分類="";
	protected String 新犬山分類F="";
	protected String 新犬山分類A="";
	protected String Scheuer分類="";
	protected String 分化度="";
	protected String 腹腔鏡の有無="";
	protected String 同意書の有無="";
	protected String サマリー="";
	protected String 指導医="";
	protected Integer 血小板=null;
	protected String 出血時間="";
	protected Integer 穿刺回数=null;
	protected String 施行者="";
	protected String 備考="";
}
