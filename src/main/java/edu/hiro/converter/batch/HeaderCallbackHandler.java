package edu.hiro.converter.batch;

import org.springframework.batch.item.file.LineCallbackHandler;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

import edu.hiro.util.FileHelper;
import edu.hiro.util.StringHelper;

public class HeaderCallbackHandler implements LineCallbackHandler {

	private DelimitedLineTokenizer tokenizer=new DelimitedLineTokenizer();
	private char delimiter='\t';
	
	public void setLineTokenizer(DelimitedLineTokenizer tokenizer)
	{
		//System.out.println("setting tokenizer: "+tokenizer);
		this.tokenizer=tokenizer;
	}
	
	public void setDelimiter(char delimiter)
	{
		//System.out.println("setting delimiter: "+delimiter);
		this.delimiter=delimiter;
	}
	
	@Override
	public void handleLine(String line)
	{
		System.out.println("Header: "+line);
		String[] fields=StringHelper.splitAsArray(line,""+delimiter); //"\t"
		for (int index=0;index<fields.length;index++)
		{
			fields[index]=StringHelper.normalize(fields[index]);
		}		
		System.out.println("Fields: "+StringHelper.join(fields,","));
		System.out.println("fields.length="+fields.length);
		tokenizer.setNames(fields);
		tokenizer.setDelimiter(delimiter);
	}

//	private String cleanField(String field)
//	{
//		return StringHelper.fixWideChars(field);
//	}
}
