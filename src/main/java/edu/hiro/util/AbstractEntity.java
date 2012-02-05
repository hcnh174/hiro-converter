package edu.hiro.util;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class AbstractEntity// implements IEntity
{
	public String toString()
	{
		return StringHelper.toString(this);
	}
}