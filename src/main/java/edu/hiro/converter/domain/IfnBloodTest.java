package edu.hiro.converter.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.hiro.util.AbstractEntity;
import edu.hiro.util.StringHelper;

@Entity
@Table(name="ifnbloodtests")
public class IfnBloodTest extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="SERIAL NOT NULL")
	protected Integer rowID=null;
	
	@Column(name="ifndbno") public String ifnDBno;
	public String type;
	public String 予定日=null;
	public String 日付=null;
	@Column(name="wbc") public String WBC="";
	public String 好中球分画="";
	@Column(name="hb") public String Hb="";
	@Column(name="plt") public String Plt="";
	@Column(name="ast") public String AST="";
	@Column(name="alt") public String ALT="";
	@Column(name="kl6") public String KL6="";
	@Column(name="ggtp") public String gGTP="";
	@Column(name="hcv定量") public String HCV定量="";
	@Column(name="hcv定性") public String HCV定性="";
	public String 減量中止の有無="";
	@Column(name="pegイントロン") public String pegイントロン="";
	public String レベトール="";

	public IfnBloodTest(){}
	
	public IfnBloodTest(String ifnDBno, Type type)
	{
		this.ifnDBno=ifnDBno;
		this.type=type.name();
	}
	
	public static String createColumnName(Field field, Type type)
	{
		return field.name()+"_"+type.name();
	}
	
	public boolean isEmpty()
	{
		//if (hasContent(予定日)) return false;
		//if (hasContent(日付)) return false;
		if (hasContent(WBC)) return false;
		if (hasContent(好中球分画)) return false;
		if (hasContent(Hb)) return false;
		if (hasContent(Plt)) return false;
		if (hasContent(AST)) return false;
		if (hasContent(ALT)) return false;
		if (hasContent(KL6)) return false;
		if (hasContent(gGTP)) return false;
		if (hasContent(HCV定量)) return false;
		if (hasContent(HCV定性)) return false;
		if (hasContent(減量中止の有無)) return false;
		if (hasContent(pegイントロン)) return false;
		if (hasContent(レベトール)) return false;
		//System.out.println("blood test["+type+"] is empty skipping: "+CStringHelper.toString(this));
		return true;
	}
	
	private boolean hasContent(String value)
	{
		//if (value.equals("ND"))
		//	return false;
		return StringHelper.hasContent(value);
	}
	
	public enum Type
	{
		開始日(true),日3目,週1目(true),週2目(true),週3目,週4目(true),週5目,週6目,週7目,週8目,週12目,週16目,週20目,週24目,週28目,週32目,週36目,
		週40目,週44目,週48目,週52目,週56目,週60目,週64目,週68目,週72目,週76目,週80目,週84目,週88目,週92目,週96目,
		投与終了時,終了4週目,終了8週目,終了12週目,終了16週目,終了20週目,終了24週目;

		private boolean selected=false;
		Type(){}		
		Type(boolean selected){this.selected=selected;}		
		public boolean getSelected(){return this.selected;}
		
		public static List<String> asList()
		{
			List<String> list=new ArrayList<String>();
			for (Type type : values())
			{
				list.add(type.name());
			}
			return list;
		}
	}
	
	public enum Field
	{
		//予定日,日付,WBC,好中球分画,Hb,Plt,AST,ALT,KL6,gammaGTP,
		//HCV定量,HCV定性,減量中止の有無,Pegイントロン,レベトール;
		予定日,日付,WBC,好中球分画,Hb,Plt,AST,ALT,KL6,gGTP,
		HCV定量,HCV定性,減量中止の有無,pegイントロン,レベトール;
		private boolean selected=true;
		Field(){}		
		Field(boolean selected){this.selected=selected;}		
		public boolean getSelected(){return this.selected;}
	}
}
