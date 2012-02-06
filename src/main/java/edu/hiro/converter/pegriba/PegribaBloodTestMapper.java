package edu.hiro.converter.pegriba;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.hiro.converter.filemaker.PegribaBloodTest;
import edu.hiro.util.DataFrame;

public class PegribaBloodTestMapper extends AbstractPegribaMapper
{
	public PegribaBloodTestMapper(PegribaParams params, DataFrame dataframe)
	{
		super(params,dataframe);
	}
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		String pegribaDBno=rs.getString("pegribaDBno");
		PegribaBloodTest.Type type=PegribaBloodTest.Type.valueOf(rs.getString("type"));
		for (PegribaBloodTest.Field field : params.getBloodtestcolumns())
		{
			String value=rs.getString(field.name());
			if (value==null)
				value="";
			String column=PegribaBloodTest.createColumnName(field,type);
			dataframe.setValue(column,pegribaDBno,value);
		}
		return null;
    }
}