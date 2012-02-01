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

	public Date get初診日(){return this.初診日;}
	public void set初診日(final Date 初診日){this.初診日=初診日;}

	@Length(max=2) @NotNull
	public String get家族歴の有無(){return this.家族歴の有無;}
	public void set家族歴の有無(final String 家族歴の有無){this.家族歴の有無=家族歴の有無;}

	@Length(max=50) @NotNull
	public String get家族歴の備考(){return this.家族歴の備考;}
	public void set家族歴の備考(final String 家族歴の備考){this.家族歴の備考=家族歴の備考;}

	@Length(max=2) @NotNull
	public String get輸血歴の有無(){return this.輸血歴の有無;}
	public void set輸血歴の有無(final String 輸血歴の有無){this.輸血歴の有無=輸血歴の有無;}

	public Date get輸血年月日(){return this.輸血年月日;}
	public void set輸血年月日(final Date 輸血年月日){this.輸血年月日=輸血年月日;}

	@Length(max=50) @NotNull
	public String get輸血歴詳細(){return this.輸血歴詳細;}
	public void set輸血歴詳細(final String 輸血歴詳細){this.輸血歴詳細=輸血歴詳細;}

	@Length(max=2) @NotNull
	public String get飲酒歴の有無(){return this.飲酒歴の有無;}
	public void set飲酒歴の有無(final String 飲酒歴の有無){this.飲酒歴の有無=飲酒歴の有無;}

	@Length(max=50) @NotNull
	public String get酒種(){return this.酒種;}
	public void set酒種(final String 酒種){this.酒種=酒種;}

	@Length(max=50) @NotNull
	public String get一日飲酒量(){return this.一日飲酒量;}
	public void set一日飲酒量(final String 一日飲酒量){this.一日飲酒量=一日飲酒量;}

	@Length(max=50) @NotNull
	public String get飲酒年(){return this.飲酒年;}
	public void set飲酒年(final String 飲酒年){this.飲酒年=飲酒年;}

	@Length(max=50) @NotNull
	public String get総飲酒量(){return this.総飲酒量;}
	public void set総飲酒量(final String 総飲酒量){this.総飲酒量=総飲酒量;}

	@Length(max=50) @NotNull
	public String get酒量単位(){return this.酒量単位;}
	public void set酒量単位(final String 酒量単位){this.酒量単位=酒量単位;}

	@Length(max=50) @NotNull
	public String get飲酒量の備考(){return this.飲酒量の備考;}
	public void set飲酒量の備考(final String 飲酒量の備考){this.飲酒量の備考=飲酒量の備考;}

	public Date get肝炎の発見日(){return this.肝炎の発見日;}
	public void set肝炎の発見日(final Date 肝炎の発見日){this.肝炎の発見日=肝炎の発見日;}

	@Length(max=10) @NotNull
	public String get肝炎(){return this.肝炎;}
	public void set肝炎(final String 肝炎){this.肝炎=肝炎;}

	@Length(max=5) @NotNull
	public String get肝癌(){return this.肝癌;}
	public void set肝癌(final String 肝癌){this.肝癌=肝癌;}

	@Length(max=10) @NotNull
	public String get静脈瘤(){return this.静脈瘤;}
	public void set静脈瘤(final String 静脈瘤){this.静脈瘤=静脈瘤;}

	@Length(max=5) @NotNull
	public String getIFN治療歴(){return this.IFN治療歴;}
	public void setIFN治療歴(final String IFN治療歴){this.IFN治療歴=IFN治療歴;}

	@Length(max=2) @NotNull
	public String get死亡の有無(){return this.死亡の有無;}
	public void set死亡の有無(final String 死亡の有無){this.死亡の有無=死亡の有無;}

	public Date get予後確認日(){return this.予後確認日;}
	public void set予後確認日(final Date 予後確認日){this.予後確認日=予後確認日;}

	@Length(max=50) @NotNull
	public String get死因(){return this.死因;}
	public void set死因(final String 死因){this.死因=死因;}

	@Length(max=50) @NotNull
	public String get治験の有無(){return this.治験の有無;}
	public void set治験の有無(final String 治験の有無){this.治験の有無=治験の有無;}

	@Length(max=15) @NotNull
	public String get紹介元施設(){return this.紹介元施設;}
	public void set紹介元施設(final String 紹介元施設){this.紹介元施設=紹介元施設;}

	@Length(max=15) @NotNull
	public String get紹介医(){return this.紹介医;}
	public void set紹介医(final String 紹介医){this.紹介医=紹介医;}

	@Length(max=15) @NotNull
	public String get外来医(){return this.外来医;}
	public void set外来医(final String 外来医){this.外来医=外来医;}

	@Length(max=50) @NotNull
	public String get糖尿病(){return this.糖尿病;}
	public void set糖尿病(final String 糖尿病){this.糖尿病=糖尿病;}

	@Length(max=50) @NotNull
	public String get高血圧(){return this.高血圧;}
	public void set高血圧(final String 高血圧){this.高血圧=高血圧;}

	@Length(max=50) @NotNull
	public String get高脂血症(){return this.高脂血症;}
	public void set高脂血症(final String 高脂血症){this.高脂血症=高脂血症;}

	public Date get肝癌発見日(){return this.肝癌発見日;}
	public void set肝癌発見日(final Date 肝癌発見日){this.肝癌発見日=肝癌発見日;}

	@Length(max=50) @NotNull
	public String getその他の既往歴(){return this.その他の既往歴;}
	public void setその他の既往歴(final String その他の既往歴){this.その他の既往歴=その他の既往歴;}
	
	public BasicInfoItem() {}

	public BasicInfoItem(int 個人ID)
	{
		this.個人ID=個人ID;
	}
	
	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}