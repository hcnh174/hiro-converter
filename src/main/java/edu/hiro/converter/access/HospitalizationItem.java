package edu.hiro.converter.access;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tbl入院台帳")
public class HospitalizationItem extends AbstractPatientItem
{	
	protected Date 入院日=null;
	protected Date 退院日=null;
	protected Integer 入院回数=null;
	protected String 主病名1="";
	protected String 主病名1の転帰="";
	protected String 主病名2="";
	protected String 主病名2の転帰="";
	protected String 指導医="";
	protected String 外来医="";
	protected String 検査="";
	protected Date 検査日=null;
	protected String 今後の治療方針="";
	protected String 治療内容="";
	protected String 入院後経過="";
	protected String 注意点="";
	
	public Date get入院日(){return this.入院日;}
	public void set入院日(final Date 入院日){this.入院日=入院日;}

	public Date get退院日(){return this.退院日;}
	public void set退院日(final Date 退院日){this.退院日=退院日;}

	public Integer get入院回数(){return this.入院回数;}
	public void set入院回数(final Integer 入院回数){this.入院回数=入院回数;}

	@Length(max=15) @NotNull
	public String get主病名1(){return this.主病名1;}
	public void set主病名1(final String 主病名1){this.主病名1=主病名1;}

	@Length(max=8) @NotNull
	public String get主病名1の転帰(){return this.主病名1の転帰;}
	public void set主病名1の転帰(final String 主病名1の転帰){this.主病名1の転帰=主病名1の転帰;}

	@Length(max=10) @NotNull
	public String get主病名2(){return this.主病名2;}
	public void set主病名2(final String 主病名2){this.主病名2=主病名2;}

	@Length(max=8) @NotNull
	public String get主病名2の転帰(){return this.主病名2の転帰;}
	public void set主病名2の転帰(final String 主病名2の転帰){this.主病名2の転帰=主病名2の転帰;}

	@Length(max=8) @NotNull
	public String get指導医(){return this.指導医;}
	public void set指導医(final String 指導医){this.指導医=指導医;}

	@Length(max=8) @NotNull
	public String get外来医(){return this.外来医;}
	public void set外来医(final String 外来医){this.外来医=外来医;}

	@Length(max=40) @NotNull
	public String get検査(){return this.検査;}
	public void set検査(final String 検査){this.検査=検査;}

	public Date get検査日(){return this.検査日;}
	public void set検査日(final Date 検査日){this.検査日=検査日;}

	@Length(max=70) @NotNull
	public String get今後の治療方針(){return this.今後の治療方針;}
	public void set今後の治療方針(final String 今後の治療方針){this.今後の治療方針=今後の治療方針;}

	@Length(max=50) @NotNull
	public String get治療内容(){return this.治療内容;}
	public void set治療内容(final String 治療内容){this.治療内容=治療内容;}

	@Length(max=255) @NotNull
	public String get入院後経過(){return this.入院後経過;}
	public void set入院後経過(final String 入院後経過){this.入院後経過=入院後経過;}

	@Length(max=100) @NotNull
	public String get注意点(){return this.注意点;}
	public void set注意点(final String 注意点){this.注意点=注意点;}
		
	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}