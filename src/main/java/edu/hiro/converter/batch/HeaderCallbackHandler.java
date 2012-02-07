package edu.hiro.converter.batch;

import java.util.Map;

import org.springframework.batch.item.file.LineCallbackHandler;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;

import edu.hiro.converter.ImportHelper;
import edu.hiro.util.FileHelper;
import edu.hiro.util.StringHelper;

public class HeaderCallbackHandler implements LineCallbackHandler {

	private DelimitedLineTokenizer tokenizer=new DelimitedLineTokenizer();
	private char delimiter='\t';
	private Map<String,String> conversions=Maps.newHashMap();
	
	public void setLineTokenizer(DelimitedLineTokenizer tokenizer)
	{
		this.tokenizer=tokenizer;
	}
	
	public void setDelimiter(char delimiter)
	{
		this.delimiter=delimiter;
	}
	
	public void setConversions(Map<String,String> conversions)
	{
		StringHelper.println("setting conversions: "+conversions,Charsets.UTF_16);
		this.conversions=conversions;
	}
	
	@Override
	public void handleLine(String line)
	{
		StringHelper.println("Header: "+line,Charsets.UTF_16);
		String[] fields=StringHelper.splitAsArray(line,""+delimiter); //"\t"
		for (int index=0;index<fields.length;index++)
		{
			fields[index]=ImportHelper.adjustFieldName(fields[index],conversions);
		}		
		StringHelper.println("Fields: "+StringHelper.join(fields,","),Charsets.UTF_16);
		System.out.println("fields.length="+fields.length);
		tokenizer.setNames(fields);
		tokenizer.setDelimiter(delimiter);
	}
}
