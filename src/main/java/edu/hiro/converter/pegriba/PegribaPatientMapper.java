package edu.hiro.converter.pegriba;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.hiro.converter.filemaker.PegribaPatient;

public class PegribaPatientMapper extends AbstractPegribaMapper
{
	public PegribaPatientMapper(PegribaParams params)
	{
		super(params,params.createDataFrame());
	}
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		String pegribaDBno=rs.getString("pegribaDBno");
		for (PegribaPatient.Field field : params.getPatientcolumns())
		{
			String value=rs.getString(field.name());
			String column=field.name();
			if (value==null)
				value="";
			dataframe.setValue(column,pegribaDBno,value);
		}
		return null;
    }
}