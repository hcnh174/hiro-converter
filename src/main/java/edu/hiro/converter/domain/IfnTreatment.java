package edu.hiro.converter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.hiro.util.AbstractEntity;

@Entity
@Table(name="ifntreatments")
public class IfnTreatment extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="SERIAL NOT NULL")
	protected Integer rowID=null;
	
	@Column(name="ifndbno") public String ifnDBno;
	public String dbno;//DBno
	public String シート名;
	public String ダブル登録;
	public String 投与開始日;//Date
	public String 投与終了日;//Date
	public String 病院;
	public String 医師;
	public String 病院id;//病院ID
	public String 姓;
	public String 名;
	public String 生年月日;//Date
	public String 年齢;
	public String 性別;
	public String 身長;
	public String 体重;
	public String 肝組織;
	public String 肝生検;
	@Column(name="icg") public String ICG;//ICG
	public String genotype;//Genotype
	public String ifn既往;//IFN既往
	public String 効果判定;
	public String 効果判定bio;//効果判定Bio
	public String 効果判定viro;//効果判定Viro
	@Column(name="snpsidch") public String SNPsIDch;//
	@Column(name="snpsidno") public String SNPsIDno;//
	public String 匿名化no;//匿名化No
	public String pegｲﾝﾄﾛﾝ減量;//Pegｲﾝﾄﾛﾝ減量
	public String pegｲﾝﾄﾛﾝ時期;//
	public String pegｲﾝﾄﾛﾝ変更後の量;//
	public String pegｲﾝﾄﾛﾝ備考;//
	public String pegｲﾝﾄﾛﾝ総投与量;//
	public String ﾚﾍﾞﾄｰﾙ減量;
	public String ﾚﾍﾞﾄｰﾙ時期;
	public String ﾚﾍﾞﾄｰﾙ変更後の量;
	public String ﾚﾍﾞﾄｰﾙ備考;
	public String ﾚﾍﾞﾄｰﾙ総投与量;
	@Column(name="hcvcore抗体開始") public String HCVcore抗体開始;//HCVcore抗体開始
	@Column(name="hcvcore抗体終了") public String HCVcore抗体終了;//HCVcore抗体終了
	public String クレアチニン開始;
	public String クレアチニン終了;
	public String ヒアルロン酸開始;
	public String ヒアルロン酸終了;
	public String フェリチン開始;
	public String フェリチン終了;
	@Column(name="ana開始") public String ANA開始;
	@Column(name="ana終了") public String ANA終了;//
	public String マイクロゾーム開始;
	public String マイクロゾーム終了;
	@Column(name="t3開始")public String T3開始;
	@Column(name="t3終了")public String T3終了;
	@Column(name="t4開始")public String T4開始;
	@Column(name="t4終了")public String T4終了;
	@Column(name="tsh開始") public String TSH開始;
	@Column(name="tsh終了") public String TSH終了;
	@Column(name="hba1c開始") public String HbA1c開始;
	@Column(name="hba1c終了") public String HbA1c終了;
	@Column(name="tcho開始") public String TCHO開始;
	@Column(name="tcho終了") public String TCHO終了;
	@Column(name="tg開始") public String TG開始;
	@Column(name="tg終了") public String TG終了;
	@Column(name="hdl開始") public String HDL開始;
	@Column(name="hdl終了") public String HDL終了;
	@Column(name="fe開始") public String FE開始;
	@Column(name="fe終了") public String FE終了;
	@Column(name="afp開始") public String AFP開始;
	@Column(name="afp終了") public String AFP終了;
	public String 血糖開始;
	public String 血糖終了;
	@Column(name="ins開始") public String INS開始;
	@Column(name="ins終了") public String INS終了;
	
	public IfnTreatment(){}
	
	public IfnTreatment(String ifnDBno)
	{
		this.ifnDBno=ifnDBno;
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