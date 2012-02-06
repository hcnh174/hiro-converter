-- Table: fmhbv

DROP TABLE fmhbv;

CREATE TABLE fmhbv
(
  rowid serial NOT NULL,
  
  	DBno TEXT,
	患者名 TEXT,
	フリガナ TEXT,
	性別 TEXT,
	生年月日 TEXT,
	SNP有check TEXT,
	SNP採血日 TEXT,
	主治療施設 TEXT,
	患者ID TEXT,
	副治療施設 TEXT,--副　治療施設
	副治療施設ID TEXT,
	BH TEXT,
	BW TEXT,
	BMI TEXT,
	家族歴有無 TEXT,
	家族歴詳細父有無 TEXT,
	家族歴詳細母有無 TEXT,
	家族歴詳細兄弟・姉妹有無 TEXT,
	家族歴詳細他有無 TEXT,
	家族歴備考 TEXT,
	既往歴有無 TEXT,
	既往歴備考 TEXT,
	DM TEXT,
	HT TEXT,
	HL TEXT,
	飲酒歴有無 TEXT,
	飲酒分類 TEXT,--飲酒　分類
	飲酒内容 TEXT,
	飲酒歴詳細 TEXT,
	輸血歴有無 TEXT,
	輸血時年齢 TEXT,
	輸血歴備考 TEXT,
	針治療歴有無 TEXT,
	針治療時年齢 TEXT,
	刺青有無 TEXT,
	刺青年齢 TEXT,
	針刺し事故有無 TEXT,
	針刺し年月日 TEXT,
	コーヒー TEXT,
	コーヒー内容 TEXT,
	たばこ TEXT,
	たばこ内容 TEXT,
	アレルギー TEXT,
	アレルギー内容 TEXT,
	診断 TEXT,
	急性増悪 TEXT,
	HCV有無 TEXT,
	Alcoholic有無 TEXT,
	fatty_liver TEXT,--Fatty Liver
	PBC有無 TEXT,
	NASH有無 TEXT,
	AIH有無 TEXT,
	ヘモクロマトーシス有無 TEXT,
	併発肝疾患備考 TEXT,
	genotype TEXT,
	肝生検試行日Bx1 TEXT,--肝生検試行日 Bx1
	fibrosisBx1 TEXT,--fibrosis　Bx1
	activityBx1 TEXT,--activity Bx1
	肝生検備考Bx1 TEXT,--肝生検備考 Bx1
	肝生検試行日Bx2 TEXT,--肝生検試行日 Bx2
	fibrosisBx2 TEXT,--fibrosis　Bx2
	activityBx2 TEXT,--activity Bx2
	肝生検備考Bx2 TEXT,--肝生検備考 Bx2
	肝生検試行日Bx3 TEXT,--肝生検試行日 Bx3
	fibrosisBx3 TEXT,--fibrosis　Bx3
	activityBx3 TEXT,--activity Bx3
	肝生検備考Bx3 TEXT,--肝生検備考 Bx3
	IFN有無 TEXT,
	核酸アナログ有無 TEXT,
	移植有無 TEXT,
	Tx種類1 TEXT,
	治療開始日1 TEXT,
	治療終了日1 TEXT,
	治療備考1 TEXT,
	Tx種類2 TEXT,
	治療開始日2 TEXT,
	治療終了日2 TEXT,
	治療備考2 TEXT,
	Tx種類3 TEXT,
	治療開始日3 TEXT,
	治療終了日3 TEXT,
	治療備考3 TEXT,
	Tx種類4 TEXT,
	治療開始日4 TEXT,
	治療終了日4 TEXT,
	治療備考4 TEXT,
	Tx種類5 TEXT,
	治療開始日5 TEXT,
	治療終了日5 TEXT,
	治療備考5 TEXT,
	Tx種類6 TEXT,
	治療開始日6 TEXT,
	治療終了日6 TEXT,
	治療備考6 TEXT,
	Tx種類7 TEXT,
	治療開始日7 TEXT,
	治療終了日7 TEXT,
	治療備考7 TEXT,
	Tx種類8 TEXT,
	治療開始日8 TEXT,
	治療終了日8 TEXT,
	治療備考8 TEXT,
	Tx種類9 TEXT,
	治療開始日9 TEXT,
	治療終了日9 TEXT,
	治療備考9 TEXT,
	Tx種類10 TEXT,
	治療開始日10 TEXT,
	治療終了日10 TEXT,
	治療備考10 TEXT,
	Tx種類11 TEXT,
	治療開始日11 TEXT,
	治療終了日11 TEXT,
	治療備考11 TEXT,
	Tx種類12 TEXT,
	治療開始日12 TEXT,
	治療終了日12 TEXT,
	治療備考12 TEXT,
	Tx種類13 TEXT,
	治療開始日13 TEXT,
	治療終了日13 TEXT,
	治療備考13 TEXT,
	Tx種類14 TEXT,
	治療開始日14 TEXT,
	治療終了日14 TEXT,
	治療備考14 TEXT,
	Tx種類15 TEXT,
	治療開始日15 TEXT,
	治療終了日15 TEXT,
	治療備考15 TEXT,
	変更後の診断1 TEXT,--1変更後の診断
	診断変更日1 TEXT,--１　診断変更日
	変更後の診断2 TEXT,--２変更後の診断
	診断変更日2 TEXT,--２　診断変更日
	最終更新日における診断 TEXT,
	最終更新日におけるHCCの有無 TEXT,
	HCC有無 TEXT,
	核酸アナログ開始時HCC有無 TEXT,
	核酸アナログ開始時HCC無の場合 TEXT,
	初発HCC治療日付 TEXT,
	再発時核酸アナログの投与有無 TEXT,
	治療目的 TEXT,
	治療因子 TEXT,
	chemo種類 TEXT,
	HCC治療備考 TEXT,
	再発HCC TEXT,
	再発日付 TEXT,
	病歴備考 TEXT,--病歴　備考
	観察の継続 TEXT,
	転機 TEXT,
	転機年月日 TEXT,
	転機備考 TEXT,
	死因 TEXT,
	死亡年月日 TEXT,
	死亡詳細備考 TEXT,
  
  CONSTRAINT fmhbv_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE fmhbv OWNER TO converterdemo;
