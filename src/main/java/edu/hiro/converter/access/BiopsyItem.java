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

	public Integer getNumber(){return this.number;}
	public void setNumber(final Integer number){this.number=number;}

	@Length(max=10) @NotNull
	public String get標本番号(){return this.標本番号;}
	public void set標本番号(final String 標本番号){this.標本番号=標本番号;}

	public Date get肝生検日(){return this.肝生検日;}
	public void set肝生検日(final Date 肝生検日){this.肝生検日=肝生検日;}

	@Length(max=30) @NotNull
	public String get臨床診断(){return this.臨床診断;}
	public void set臨床診断(final String 臨床診断){this.臨床診断=臨床診断;}

	@Length(max=40) @NotNull
	public String get病理組織診断(){return this.病理組織診断;}
	public void set病理組織診断(final String 病理組織診断){this.病理組織診断=病理組織診断;}

	@Length(max=20) @NotNull
	public String getヨーロッパ分類(){return this.ヨーロッパ分類;}
	public void setヨーロッパ分類(final String ヨーロッパ分類){this.ヨーロッパ分類=ヨーロッパ分類;}

	@Length(max=50) @NotNull
	public String get新犬山分類F(){return this.新犬山分類F;}
	public void set新犬山分類F(final String 新犬山分類F){this.新犬山分類F=新犬山分類F;}

	@Length(max=50) @NotNull
	public String get新犬山分類A(){return this.新犬山分類A;}
	public void set新犬山分類A(final String 新犬山分類A){this.新犬山分類A=新犬山分類A;}

	@Length(max=50) @NotNull
	public String getScheuer分類(){return this.Scheuer分類;}
	public void setScheuer分類(final String Scheuer分類){this.Scheuer分類=Scheuer分類;}

	@Length(max=50) @NotNull
	public String get分化度(){return this.分化度;}
	public void set分化度(final String 分化度){this.分化度=分化度;}

	@Length(max=50) @NotNull
	public String get腹腔鏡の有無(){return this.腹腔鏡の有無;}
	public void set腹腔鏡の有無(final String 腹腔鏡の有無){this.腹腔鏡の有無=腹腔鏡の有無;}

	@Length(max=5) @NotNull
	public String get同意書の有無(){return this.同意書の有無;}
	public void set同意書の有無(final String 同意書の有無){this.同意書の有無=同意書の有無;}

	@Length(max=4) @NotNull
	public String getサマリー(){return this.サマリー;}
	public void setサマリー(final String サマリー){this.サマリー=サマリー;}

	@Length(max=10) @NotNull
	public String get指導医(){return this.指導医;}
	public void set指導医(final String 指導医){this.指導医=指導医;}

	public Integer get血小板(){return this.血小板;}
	public void set血小板(final Integer 血小板){this.血小板=血小板;}

	@Length(max=10) @NotNull
	public String get出血時間(){return this.出血時間;}
	public void set出血時間(final String 出血時間){this.出血時間=出血時間;}

	public Integer get穿刺回数(){return this.穿刺回数;}
	public void set穿刺回数(final Integer 穿刺回数){this.穿刺回数=穿刺回数;}

	@Length(max=10) @NotNull
	public String get施行者(){return this.施行者;}
	public void set施行者(final String 施行者){this.施行者=施行者;}

	@Length(max=50) @NotNull
	public String get備考(){return this.備考;}
	public void set備考(final String 備考){this.備考=備考;}

	
	public BiopsyItem() {}
	
	public BiopsyItem(int id)
	{
		super(id);
	}
	
	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}
