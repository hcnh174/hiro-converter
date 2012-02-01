package edu.hiro.util;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class AbstractEntity implements IEntity
{
	protected Calendar created;
	protected Calendar updated;

	@Column(insertable=false,updatable=false)
	public Calendar getCreated(){return this.created;}
	public void setCreated(final Calendar created){this.created=created;}

	@Column(insertable=false,updatable=false)
	public Calendar getUpdated(){return this.updated;}
	public void setUpdated(final Calendar updated){this.updated=updated;}
	
	public void initialize(){}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updated = Calendar.getInstance();
		System.out.println("onUpdate called: "+this.updated.toString());
	}
}