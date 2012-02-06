package edu.hiro.converter.pegriba;

import org.springframework.jdbc.core.RowMapper;

import edu.hiro.util.DataFrame;

public abstract class AbstractPegribaMapper implements RowMapper<Object>
{
	final protected PegribaParams params;
	final protected DataFrame dataframe;
	
	public AbstractPegribaMapper(PegribaParams params, DataFrame dataframe)
	{
		this.params=params;
		this.dataframe=dataframe;
	}

	public DataFrame getDataFrame(){return dataframe;}
}