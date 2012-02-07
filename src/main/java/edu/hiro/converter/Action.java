package edu.hiro.converter;

import edu.hiro.util.CException;

public enum Action
{
	load("Import all data"),
	hbvbloodtests("Load HBV blood test data"),
	hcvbloodtests("Load HCV blood test data"),
	ifn("oad IFN spreadsheets"),
	access("Load patient data from Access database"),
	fmfirstexam("Load data from first exam FileMaker database"),
	fmhbv("Load data from HBV FileMaker database"),
	fmhcv("Load data from HCV FileMaker database"),
	correct("Apply corrections"),
	merge("Merge data"),
	setupfile("Makes an SQL setup file"),
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
