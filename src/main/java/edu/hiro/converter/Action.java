package edu.hiro.converter;

import edu.hiro.util.CException;

public enum Action
{
	load("Import data"),
	correct("Apply corrections"),
	merge("Merge data"),
	vacuum("run vacuum analyze on the database to refresh query statistics"),
	help("show usage and action types");
	
	private String description;
	
	Action(String description)
	{
		this.description=description;
	}
	
	public String getDescription(){return description;}
	
	public static Action find(String value)
	{
		try
		{
			return Action.valueOf(value.trim());
		}
		catch(IllegalArgumentException e)
		{
			throw new CException("cannot find action type: "+value);
		}
	}
}
