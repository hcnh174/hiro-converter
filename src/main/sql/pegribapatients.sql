-- Table: pegribapatients

DROP TABLE pegribapatients;

CREATE TABLE pegribapatients
(
	id integer NOT NULL,
	
	dbno TEXT,
	シート名 TEXT,
	ダブル登録 TEXT,
	投与開始日 TEXT,
	投与終了日 TEXT,
	病院 TEXT,
	医師 TEXT,
	病院id TEXT,
	姓 TEXT,
	名 TEXT,
	生年月日 TEXT,
	年齢 TEXT,
	性別 TEXT,
	身長 TEXT,
	体重 TEXT,
	肝組織 TEXT,
	肝生検 TEXT,
	icg TEXT,
	genotype TEXT,
	ifn既往 TEXT,
	効果判定 TEXT,
	効果判定bio TEXT,
	効果判定viro TEXT,
	snpsidch TEXT,
	snpsidno TEXT,
	匿名化no TEXT,
	pegｲﾝﾄﾛﾝ減量 TEXT,
	pegｲﾝﾄﾛﾝ時期 TEXT,
	pegｲﾝﾄﾛﾝ変更後の量 TEXT,
	pegｲﾝﾄﾛﾝ備考 TEXT,
	pegｲﾝﾄﾛﾝ総投与量 TEXT,
	ﾚﾍﾞﾄｰﾙ減量 TEXT,
	ﾚﾍﾞﾄｰﾙ時期 TEXT,
	ﾚﾍﾞﾄｰﾙ変更後の量 TEXT,
	ﾚﾍﾞﾄｰﾙ備考 TEXT,
	ﾚﾍﾞﾄｰﾙ総投与量 TEXT,
	hcvcore抗体開始 TEXT,
	hcvcore抗体終了 TEXT,
	クレアチニン開始 TEXT,
	クレアチニン終了 TEXT,
	ヒアルロン酸開始 TEXT,
	ヒアルロン酸終了 TEXT,
	フェリチン開始 TEXT,
	フェリチン終了 TEXT,
	ana開始 TEXT,
	ana終了 TEXT,
	マイクロゾーム開始 TEXT,
	マイクロゾーム終了 TEXT,
	t3開始 TEXT,
	t3終了 TEXT,
	t4開始 TEXT,
	t4終了 TEXT,
	tsh開始 TEXT,
	tsh終了 TEXT,
	hba1c開始 TEXT,
	hba1c終了 TEXT,
	tcho開始 TEXT,
	tcho終了 TEXT,
	tg開始 TEXT,
	tg終了 TEXT,
	hdl開始 TEXT,
	hdl終了 TEXT,
	fe開始 TEXT,
	fe終了 TEXT,
	afp開始 TEXT,
	afp終了 TEXT,
	血糖開始 TEXT,
	血糖終了 TEXT,
	ins開始 TEXT,
	ins終了 TEXT,
	
	CONSTRAINT pegribapatients_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pegribapatients OWNER TO converterdemo;
