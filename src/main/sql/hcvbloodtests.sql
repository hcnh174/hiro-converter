-- Table: hcvbloodtests

DROP TABLE hcvbloodtests;

CREATE TABLE hcvbloodtests
(
	rowid serial NOT NULL,

	idnum TEXT,
	治療履歴 TEXT,
	ifn履歴 TEXT,
	日付 TEXT,
	hcvamt TEXT,--hcv-AM-T TEXT,
	hcvgeno TEXT,--hcv-GENO TEXT,
	hcvtaq TEXT,--hcv(Taq TEXT,
	hcvモニタジェノタイプ TEXT,--hcvﾓﾆﾀｼﾞｪﾉﾀｲﾌﾟ TEXT,
	hcvコアコウタイ TEXT,--hcvｺｱｺｳﾀｲ TEXT,
	hcvコウゲン TEXT,--hcvｺｳｹﾞﾝ TEXT,
	hcvテイセイ TEXT,--hcvﾃｲｾｲ TEXT,
	wbc TEXT,
	ne TEXT,--NE(%) TEXT,
	hgb TEXT,
	plt TEXT,
	ast TEXT, --got
	alt TEXT, --gpt	
	ggtp TEXT,--γ-GTP TEXT,
	tbil TEXT,--T-Bil TEXT,
	dbil TEXT,--D-Bil TEXT,
	alph TEXT,
	alb TEXT,
	cre TEXT,
	afp TEXT,
	pt TEXT,
	bs TEXT,
	a1c TEXT,
	hdlcho TEXT,--HDL-CHO TEXT,
	コレステロール TEXT,--ｺﾚｽﾃﾛｰﾙ TEXT,
	nonhdlc TEXT,--nonHDL-C TEXT,
	ヒアルロン酸 TEXT,--ﾋｱﾙﾛﾝ酸 TEXT,
	ana TEXT,
	マイクロゾーム TEXT,--ﾏｲｸﾛｿﾞｰﾑ TEXT,
	ft4 TEXT,--F-T4 TEXT,
	ft3 TEXT,--F-T3 TEXT,
	tsh TEXT,
	fe TEXT,
	ins TEXT,
	icgr TEXT,--ICG-R TEXT,
	kl6 TEXT,--KL-6 TEXT,
	tg TEXT,
	ferritin TEXT,
	
	hba1c TEXT,
	glu TEXT,
	ptカッセイド TEXT,
	hcvモニタジ TEXT,
	hcvコアコウタ TEXT,
	ヒアルロンサン TEXT,
	tafp TEXT,
	
	CONSTRAINT hcvbloodtests_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hcvbloodtests OWNER TO converterdemo;
