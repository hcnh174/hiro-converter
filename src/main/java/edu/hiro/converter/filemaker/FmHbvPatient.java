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
	protected String dbno;
	protected String 患者名;
	protected String フリガナ;
	protected String 性別;
	protected String 生年月日;
	protected String snp有check;
	protected String snp採血日;
	protected String 主治療施設;
	protected String 患者id;
	protected String 副治療施設;//副　治療施設
	protected String 副治療施設id;
	protected String bh;
	protected String bw;
	protected String bmi;
	protected String 家族歴有無;
	protected String 家族歴詳細父有無;
	protected String 家族歴詳細母有無;
	protected String 家族歴詳細兄弟・姉妹有無;
	protected String 家族歴詳細他有無;
	protected String 家族歴備考;
	protected String 既往歴有無;
	protected String 既往歴備考;
	protected String dm;
	protected String ht;
	protected String hl;
	protected String 飲酒歴有無;
	protected String 飲酒分類;//飲酒　分類
	protected String 飲酒内容;
	protected String 飲酒歴詳細;
	protected String 輸血歴有無;
	protected String 輸血時年齢;
	protected String 輸血歴備考;
	protected String 針治療歴有無;
	protected String 針治療時年齢;
	protected String 刺青有無;
	protected String 刺青年齢;
	protected String 針刺し事故有無;
	protected String 針刺し年月日;
	protected String コーヒー;
	protected String コーヒー内容;
	protected String たばこ;
	protected String たばこ内容;
	protected String アレルギー;
	protected String アレルギー内容;
	protected String 診断;
	protected String 急性増悪;
	protected String hcv有無;
	protected String alcoholic有無;
	protected String fattyliver;//Fatty Liver
	protected String pbc有無;
	protected String nash有無;
	protected String aih有無;
	protected String ヘモクロマトーシス有無;
	protected String 併発肝疾患備考;
	protected String genotype;
	protected String 肝生検試行日bx1;//肝生検試行日 bx1
	protected String fibrosisbx1;//fibrosis　bx1
	protected String activitybx1;//activity bx1
	protected String 肝生検備考bx1;//肝生検備考 bx1
	protected String 肝生検試行日bx2;//肝生検試行日 bx2
	protected String fibrosisbx2;//fibrosis　bx2
	protected String activitybx2;//activity bx2
	protected String 肝生検備考bx2;//肝生検備考 bx2
	protected String 肝生検試行日bx3;//肝生検試行日 bx3
	protected String fibrosisbx3;//fibrosis　bx3
	protected String activitybx3;//activity bx3
	protected String 肝生検備考bx3;//肝生検備考 bx3
	protected String ifn有無;
	protected String 核酸アナログ有無;
	protected String 移植有無;
	protected String tx種類1;
	protected String 治療開始日1;
	protected String 治療終了日1;
	protected String 治療備考1;
	protected String tx種類2;
	protected String 治療開始日2;
	protected String 治療終了日2;
	protected String 治療備考2;
	protected String tx種類3;
	protected String 治療開始日3;
	protected String 治療終了日3;
	protected String 治療備考3;
	protected String tx種類4;
	protected String 治療開始日4;
	protected String 治療終了日4;
	protected String 治療備考4;
	protected String tx種類5;
	protected String 治療開始日5;
	protected String 治療終了日5;
	protected String 治療備考5;
	protected String tx種類6;
	protected String 治療開始日6;
	protected String 治療終了日6;
	protected String 治療備考6;
	protected String tx種類7;
	protected String 治療開始日7;
	protected String 治療終了日7;
	protected String 治療備考7;
	protected String tx種類8;
	protected String 治療開始日8;
	protected String 治療終了日8;
	protected String 治療備考8;
	protected String tx種類9;
	protected String 治療開始日9;
	protected String 治療終了日9;
	protected String 治療備考9;
	protected String tx種類10;
	protected String 治療開始日10;
	protected String 治療終了日10;
	protected String 治療備考10;
	protected String tx種類11;
	protected String 治療開始日11;
	protected String 治療終了日11;
	protected String 治療備考11;
	protected String tx種類12;
	protected String 治療開始日12;
	protected String 治療終了日12;
	protected String 治療備考12;
	protected String tx種類13;
	protected String 治療開始日13;
	protected String 治療終了日13;
	protected String 治療備考13;
	protected String tx種類14;
	protected String 治療開始日14;
	protected String 治療終了日14;
	protected String 治療備考14;
	protected String tx種類15;
	protected String 治療開始日15;
	protected String 治療終了日15;
	protected String 治療備考15;
	protected String 変更後の診断1;//1変更後の診断
	protected String 診断変更日1;//１　診断変更日
	protected String 変更後の診断2;//２変更後の診断
	protected String 診断変更日2;//２　診断変更日
	protected String 最終更新日における診断;
	protected String 最終更新日におけるhccの有無;
	protected String hcc有無;
	protected String 核酸アナログ開始時hcc有無;
	protected String 核酸アナログ開始時hcc無の場合;
	protected String 初発hcc治療日付;
	protected String 再発時核酸アナログの投与有無;
	protected String 治療目的;
	protected String 治療因子;
	protected String chemo種類;
	protected String hcc治療備考;
	protected String 再発hcc;
	protected String 再発日付;
	protected String 病歴備考;//病歴　備考
	protected String 観察の継続;
	protected String 転機;
	protected String 転機年月日;
	protected String 転機備考;
	protected String 死因;
	protected String 死亡年月日;
	protected String 死亡詳細備考;
}