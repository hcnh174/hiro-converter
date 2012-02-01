package edu.hiro.converter;

import edu.hiro.util.MessageWriter;

public class ImportParams
{	
	protected TableType type;
	protected int batchsize=1000;
	protected MessageWriter writer=new MessageWriter();
	
	public TableType getType(){return this.type;}
	public void setType(final TableType type){this.type=type;}
	
	public int getBatchsize(){return this.batchsize;}
	public void setBatchsize(final int batchsize){this.batchsize=batchsize;}

	public MessageWriter getWriter(){return this.writer;}
	public void setWriter(final MessageWriter writer){this.writer=writer;}
	
	public ImportParams(){}
	
	public ImportParams(MessageWriter writer)
	{
		this.writer=writer;
	}
	
	public enum EntityType
	{
		FILEMAKER_HBV,
		FILEMAKER_HCV,
		FILEMAKER_HCC,
		FILEMAKER_FIRSTEXAM,
		ACCESS_PATIENT,
		ACCESS_ITEM
	}
	
	public enum TableType
	{
		fmhbv(EntityType.FILEMAKER_HBV),
		fmhcv(EntityType.FILEMAKER_HCV),
		fmhcc(EntityType.FILEMAKER_HCC),
		fmfirstexam(EntityType.FILEMAKER_FIRSTEXAM),
	
		tbl個人(EntityType.ACCESS_PATIENT),
		tbl個人基本(EntityType.ACCESS_ITEM),
		tblSNP(EntityType.ACCESS_ITEM),
		tblSNP匿名化番号(EntityType.ACCESS_ITEM),	
		tbl個人IFN(EntityType.ACCESS_ITEM),
		tbl個人主病名(EntityType.ACCESS_ITEM),
		tbl個人肝生検(EntityType.ACCESS_ITEM),
		tbl肝生検匿名化番号(EntityType.ACCESS_ITEM),
		tbl入院台帳(EntityType.ACCESS_ITEM);
		
		private EntityType type;
		
		TableType(EntityType type)
		{
			this.type=type;
		}
		
		public EntityType getEntityType(){return this.type;}
	};
}