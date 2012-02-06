package edu.hiro.converter.filemaker;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.hiro.util.AbstractEntity;

@Entity
@Table(name="pegribapatients")
public class PegribaPatient extends AbstractEntity
{
	@Id public Integer pegribaDBno;	
	public String DBno="";
	public String シート名="";
	public String ダブル登録="";
	public Date 投与開始日=null;
	public Date 投与終了日=null;
	public String 病院="";
	public String 医師="";
	public String 病院ID="";
	public String 姓="";
	public String 名="";
	public Date 生年月日=null;
	public Integer 年齢=null;
	public String 性別="";
	public Float 身長=null;
	public Float 体重=null;
	public String 肝組織="";
	public String 肝生検="";
	public String ICG="";
	public String Genotype="";
	public String IFN既往="";
	public String 効果判定="";
	public String 効果判定Bio="";
	public String 効果判定Viro="";
	public String SNPsIDch="";
	public Integer SNPsIDno=null;
	public Integer 匿名化No=null;
	public String Pegｲﾝﾄﾛﾝ減量="";
	public String Pegｲﾝﾄﾛﾝ時期="";
	public String Pegｲﾝﾄﾛﾝ変更後の量="";
	public String Pegｲﾝﾄﾛﾝ備考="";
	public String Pegｲﾝﾄﾛﾝ総投与量="";
	public String ﾚﾍﾞﾄｰﾙ減量="";
	public String ﾚﾍﾞﾄｰﾙ時期="";
	public String ﾚﾍﾞﾄｰﾙ変更後の量="";
	public String ﾚﾍﾞﾄｰﾙ備考="";
	public String ﾚﾍﾞﾄｰﾙ総投与量="";
	public String HCVcore抗体開始="";
	public String HCVcore抗体終了="";
	public String クレアチニン開始="";
	public String クレアチニン終了="";
	public String ヒアルロン酸開始="";
	public String ヒアルロン酸終了="";
	public String フェリチン開始="";
	public String フェリチン終了="";
	public String ANA開始="";
	public String ANA終了="";
	public String マイクロゾーム開始="";
	public String マイクロゾーム終了="";
	public String T3開始="";
	public String T3終了="";
	public String T4開始="";
	public String T4終了="";
	public String TSH開始="";
	public String TSH終了="";
	public String HbA1c開始="";
	public String HbA1c終了="";
	public String TCHO開始="";
	public String TCHO終了="";
	public String TG開始="";
	public String TG終了="";
	public String HDL開始="";
	public String HDL終了="";
	public String FE開始="";
	public String FE終了="";
	public String AFP開始="";
	public String AFP終了="";
	public String 血糖開始="";
	public String 血糖終了="";
	public String INS開始="";
	public String INS終了="";
	
	public PegribaPatient(){}
	
	public PegribaPatient(Integer pegribaDBno)
	{
		this.pegribaDBno=pegribaDBno;
	}	
	
	public enum Field
	{
		DBno(true),シート名(true),ダブル登録,投与開始日(true),投与終了日(true),病院(true),医師(true),
		病院ID(true),姓(true),名(true),生年月日(true),年齢(true),性別(true),身長,体重,肝組織,肝生検,ICG,Genotype(true),
		IFN既往,効果判定,効果判定Bio,効果判定Viro,SNPsIDch,SNPsIDno,匿名化No,
		Pegｲﾝﾄﾛﾝ減量,Pegｲﾝﾄﾛﾝ時期,Pegｲﾝﾄﾛﾝ変更後の量,Pegｲﾝﾄﾛﾝ備考,Pegｲﾝﾄﾛﾝ総投与量,
		ﾚﾍﾞﾄｰﾙ減量,ﾚﾍﾞﾄｰﾙ時期,ﾚﾍﾞﾄｰﾙ変更後の量,ﾚﾍﾞﾄｰﾙ備考,ﾚﾍﾞﾄｰﾙ総投与量,
		HCVcore抗体開始,HCVcore抗体終了,クレアチニン開始,クレアチニン終了,ヒアルロン酸開始,
		ヒアルロン酸終了,フェリチン開始,フェリチン終了,ANA開始,ANA終了,マイクロゾーム開始,
		マイクロゾーム終了,T3開始,T3終了,T4開始,T4終了,TSH開始,TSH終了,HbA1c開始,
		HbA1c終了,TCHO開始,TCHO終了,TG開始,TG終了,HDL開始,HDL終了,FE開始,FE終了,
		AFP開始,AFP終了,血糖開始,血糖終了,INS開始,INS終了;		
		private boolean selected=false;		
		Field(){}		
		Field(boolean selected){this.selected=selected;}		
		public boolean getSelected(){return this.selected;}
		
		public static String fixCase(String name)
		{
			Field field=find(name);
			if (field==null)
				return name;
			else return field.name();
		}
		
		public static Field find(String name)
		{
			for (Field field : values())
			{
				if (name.equalsIgnoreCase(field.name()))
					return field;
			}
			return null;
		}
	}
}