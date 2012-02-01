package edu.hiro.converter.access;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tblSNP匿名化番号")
public class SnpAnonymizationItem extends AbstractPatientItem
{	
	protected Integer 匿名化No=null;
	protected String rs8099917="";
	protected String rs12979860="";

	public Integer get匿名化No(){return this.匿名化No;}
	public void set匿名化No(final Integer 匿名化No){this.匿名化No=匿名化No;}

	@Length(max=50) @NotNull
	public String getRs8099917(){return this.rs8099917;}
	public void setRs8099917(final String rs8099917){this.rs8099917=rs8099917;}

	@Length(max=50) @NotNull
	public String getRs12979860(){return this.rs12979860;}
	public void setRs12979860(final String rs12979860){this.rs12979860=rs12979860;}

	@Id
	public Integer getId(){return this.id;}
	public void setId(Integer id){this.id=id;}
}