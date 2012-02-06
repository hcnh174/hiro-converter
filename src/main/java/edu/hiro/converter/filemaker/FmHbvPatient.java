package edu.hiro.converter.filemaker;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fmhbv")
@Access(value=AccessType.FIELD)
public class FmHbvPatient extends AbstractFmPatient
{
	protected @Column(columnDefinition="TEXT") String DBno;
	protected @Column(columnDefinition="TEXT") String 患者名;
	protected @Column(columnDefinition="TEXT") String フリガナ;
	protected @Column(columnDefinition="TEXT") String 性別;
	protected @Column(columnDefinition="TEXT") String 生年月日;
	protected @Column(columnDefinition="TEXT") String SNP有check;
	protected @Column(columnDefinition="TEXT") String SNP採血日;
	protected @Column(columnDefinition="TEXT") String 主治療施設;
	protected @Column(columnDefinition="TEXT") String 患者ID;
	protected @Column(columnDefinition="TEXT") String 副治療施設;//副　治療施設
	protected @Column(columnDefinition="TEXT") String 副治療施設ID;
	protected @Column(columnDefinition="TEXT") String BH;
	protected @Column(columnDefinition="TEXT") String BW;
	protected @Column(columnDefinition="TEXT") String BMI;
	protected @Column(columnDefinition="TEXT") String 家族歴有無;
	protected @Column(columnDefinition="TEXT") String 家族歴詳細父有無;
	protected @Column(columnDefinition="TEXT") String 家族歴詳細母有無;
	protected @Column(columnDefinition="TEXT") String 家族歴詳細兄弟・姉妹有無;
	protected @Column(columnDefinition="TEXT") String 家族歴詳細他有無;
	protected @Column(columnDefinition="TEXT") String 家族歴備考;
	protected @Column(columnDefinition="TEXT") String 既往歴有無;
	protected @Column(columnDefinition="TEXT") String 既往歴備考;
	protected @Column(columnDefinition="TEXT") String DM;
	protected @Column(columnDefinition="TEXT") String HT;
	protected @Column(columnDefinition="TEXT") String HL;
	protected @Column(columnDefinition="TEXT") String 飲酒歴有無;
	protected @Column(columnDefinition="TEXT") String 飲酒分類;//飲酒　分類
	protected @Column(columnDefinition="TEXT") String 飲酒内容;
	protected @Column(columnDefinition="TEXT") String 飲酒歴詳細;
	protected @Column(columnDefinition="TEXT") String 輸血歴有無;
	protected @Column(columnDefinition="TEXT") String 輸血時年齢;
	protected @Column(columnDefinition="TEXT") String 輸血歴備考;
	protected @Column(columnDefinition="TEXT") String 針治療歴有無;
	protected @Column(columnDefinition="TEXT") String 針治療時年齢;
	protected @Column(columnDefinition="TEXT") String 刺青有無;
	protected @Column(columnDefinition="TEXT") String 刺青年齢;
	protected @Column(columnDefinition="TEXT") String 針刺し事故有無;
	protected @Column(columnDefinition="TEXT") String 針刺し年月日;
	protected @Column(columnDefinition="TEXT") String コーヒー;
	protected @Column(columnDefinition="TEXT") String コーヒー内容;
	protected @Column(columnDefinition="TEXT") String たばこ;
	protected @Column(columnDefinition="TEXT") String たばこ内容;
	protected @Column(columnDefinition="TEXT") String アレルギー;
	protected @Column(columnDefinition="TEXT") String アレルギー内容;
	protected @Column(columnDefinition="TEXT") String 診断;
	protected @Column(columnDefinition="TEXT") String 急性増悪;
	protected @Column(columnDefinition="TEXT") String HCV有無;
	protected @Column(columnDefinition="TEXT") String Alcoholic有無;
	protected @Column(columnDefinition="TEXT") String fatty_liver;//Fatty Liver
	protected @Column(columnDefinition="TEXT") String PBC有無;
	protected @Column(columnDefinition="TEXT") String NASH有無;
	protected @Column(columnDefinition="TEXT") String AIH有無;
	protected @Column(columnDefinition="TEXT") String ヘモクロマトーシス有無;
	protected @Column(columnDefinition="TEXT") String 併発肝疾患備考;
	protected @Column(columnDefinition="TEXT") String genotype;
	protected @Column(columnDefinition="TEXT") String 肝生検試行日Bx1;//肝生検試行日 Bx1
	protected @Column(columnDefinition="TEXT") String fibrosisBx1;//fibrosis　Bx1
	protected @Column(columnDefinition="TEXT") String activityBx1;//activity Bx1
	protected @Column(columnDefinition="TEXT") String 肝生検備考Bx1;//肝生検備考 Bx1
	protected @Column(columnDefinition="TEXT") String 肝生検試行日Bx2;//肝生検試行日 Bx2
	protected @Column(columnDefinition="TEXT") String fibrosisBx2;//fibrosis　Bx2
	protected @Column(columnDefinition="TEXT") String activityBx2;//activity Bx2
	protected @Column(columnDefinition="TEXT") String 肝生検備考Bx2;//肝生検備考 Bx2
	protected @Column(columnDefinition="TEXT") String 肝生検試行日Bx3;//肝生検試行日 Bx3
	protected @Column(columnDefinition="TEXT") String fibrosisBx3;//fibrosis　Bx3
	protected @Column(columnDefinition="TEXT") String activityBx3;//activity Bx3
	protected @Column(columnDefinition="TEXT") String 肝生検備考Bx3;//肝生検備考 Bx3
	protected @Column(columnDefinition="TEXT") String IFN有無;
	protected @Column(columnDefinition="TEXT") String 核酸アナログ有無;
	protected @Column(columnDefinition="TEXT") String 移植有無;
	protected @Column(columnDefinition="TEXT") String Tx種類1;
	protected @Column(columnDefinition="TEXT") String 治療開始日1;
	protected @Column(columnDefinition="TEXT") String 治療終了日1;
	protected @Column(columnDefinition="TEXT") String 治療備考1;
	protected @Column(columnDefinition="TEXT") String Tx種類2;
	protected @Column(columnDefinition="TEXT") String 治療開始日2;
	protected @Column(columnDefinition="TEXT") String 治療終了日2;
	protected @Column(columnDefinition="TEXT") String 治療備考2;
	protected @Column(columnDefinition="TEXT") String Tx種類3;
	protected @Column(columnDefinition="TEXT") String 治療開始日3;
	protected @Column(columnDefinition="TEXT") String 治療終了日3;
	protected @Column(columnDefinition="TEXT") String 治療備考3;
	protected @Column(columnDefinition="TEXT") String Tx種類4;
	protected @Column(columnDefinition="TEXT") String 治療開始日4;
	protected @Column(columnDefinition="TEXT") String 治療終了日4;
	protected @Column(columnDefinition="TEXT") String 治療備考4;
	protected @Column(columnDefinition="TEXT") String Tx種類5;
	protected @Column(columnDefinition="TEXT") String 治療開始日5;
	protected @Column(columnDefinition="TEXT") String 治療終了日5;
	protected @Column(columnDefinition="TEXT") String 治療備考5;
	protected @Column(columnDefinition="TEXT") String Tx種類6;
	protected @Column(columnDefinition="TEXT") String 治療開始日6;
	protected @Column(columnDefinition="TEXT") String 治療終了日6;
	protected @Column(columnDefinition="TEXT") String 治療備考6;
	protected @Column(columnDefinition="TEXT") String Tx種類7;
	protected @Column(columnDefinition="TEXT") String 治療開始日7;
	protected @Column(columnDefinition="TEXT") String 治療終了日7;
	protected @Column(columnDefinition="TEXT") String 治療備考7;
	protected @Column(columnDefinition="TEXT") String Tx種類8;
	protected @Column(columnDefinition="TEXT") String 治療開始日8;
	protected @Column(columnDefinition="TEXT") String 治療終了日8;
	protected @Column(columnDefinition="TEXT") String 治療備考8;
	protected @Column(columnDefinition="TEXT") String Tx種類9;
	protected @Column(columnDefinition="TEXT") String 治療開始日9;
	protected @Column(columnDefinition="TEXT") String 治療終了日9;
	protected @Column(columnDefinition="TEXT") String 治療備考9;
	protected @Column(columnDefinition="TEXT") String Tx種類10;
	protected @Column(columnDefinition="TEXT") String 治療開始日10;
	protected @Column(columnDefinition="TEXT") String 治療終了日10;
	protected @Column(columnDefinition="TEXT") String 治療備考10;
	protected @Column(columnDefinition="TEXT") String Tx種類11;
	protected @Column(columnDefinition="TEXT") String 治療開始日11;
	protected @Column(columnDefinition="TEXT") String 治療終了日11;
	protected @Column(columnDefinition="TEXT") String 治療備考11;
	protected @Column(columnDefinition="TEXT") String Tx種類12;
	protected @Column(columnDefinition="TEXT") String 治療開始日12;
	protected @Column(columnDefinition="TEXT") String 治療終了日12;
	protected @Column(columnDefinition="TEXT") String 治療備考12;
	protected @Column(columnDefinition="TEXT") String Tx種類13;
	protected @Column(columnDefinition="TEXT") String 治療開始日13;
	protected @Column(columnDefinition="TEXT") String 治療終了日13;
	protected @Column(columnDefinition="TEXT") String 治療備考13;
	protected @Column(columnDefinition="TEXT") String Tx種類14;
	protected @Column(columnDefinition="TEXT") String 治療開始日14;
	protected @Column(columnDefinition="TEXT") String 治療終了日14;
	protected @Column(columnDefinition="TEXT") String 治療備考14;
	protected @Column(columnDefinition="TEXT") String Tx種類15;
	protected @Column(columnDefinition="TEXT") String 治療開始日15;
	protected @Column(columnDefinition="TEXT") String 治療終了日15;
	protected @Column(columnDefinition="TEXT") String 治療備考15;
	protected @Column(columnDefinition="TEXT") String 変更後の診断1;//1変更後の診断
	protected @Column(columnDefinition="TEXT") String 診断変更日1;//１　診断変更日
	protected @Column(columnDefinition="TEXT") String 変更後の診断2;//２変更後の診断
	protected @Column(columnDefinition="TEXT") String 診断変更日2;//２　診断変更日
	protected @Column(columnDefinition="TEXT") String 最終更新日における診断;
	protected @Column(columnDefinition="TEXT") String 最終更新日におけるHCCの有無;
	protected @Column(columnDefinition="TEXT") String HCC有無;
	protected @Column(columnDefinition="TEXT") String 核酸アナログ開始時HCC有無;
	protected @Column(columnDefinition="TEXT") String 核酸アナログ開始時HCC無の場合;
	protected @Column(columnDefinition="TEXT") String 初発HCC治療日付;
	protected @Column(columnDefinition="TEXT") String 再発時核酸アナログの投与有無;
	protected @Column(columnDefinition="TEXT") String 治療目的;
	protected @Column(columnDefinition="TEXT") String 治療因子;
	protected @Column(columnDefinition="TEXT") String chemo種類;
	protected @Column(columnDefinition="TEXT") String HCC治療備考;
	protected @Column(columnDefinition="TEXT") String 再発HCC;
	protected @Column(columnDefinition="TEXT") String 再発日付;
	protected @Column(columnDefinition="TEXT") String 病歴備考;//病歴　備考
	protected @Column(columnDefinition="TEXT") String 観察の継続;
	protected @Column(columnDefinition="TEXT") String 転機;
	protected @Column(columnDefinition="TEXT") String 転機年月日;
	protected @Column(columnDefinition="TEXT") String 転機備考;
	protected @Column(columnDefinition="TEXT") String 死因;
	protected @Column(columnDefinition="TEXT") String 死亡年月日;
	protected @Column(columnDefinition="TEXT") String 死亡詳細備考;

	public FmHbvPatient(){}
	
	public FmHbvPatient(int rowID)
	{
		super(rowID);
	}
}