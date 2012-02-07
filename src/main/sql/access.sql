-- Table: access

DROP TABLE IF EXISTS access;

CREATE TABLE access
(
	rowid serial NOT NULL,
	
	id TEXT,
	広大no TEXT,
	姓 TEXT,
	名 TEXT,
	生年月日 TEXT,
	性別 TEXT,
	肝研患者基本データシート_fp7 TEXT,
	診断名 TEXT,
	hbvファイル_fp7 TEXT,
	hcvファイル_fp7 TEXT,
	snps肝研no TEXT,
	ペグリバ通し番号 TEXT,
	ペグリバ通し番号2 TEXT,--ﾍﾟｸﾞﾘﾊﾞ通し番号②
	ペガシスシートno TEXT,
	ペガシスシートno2 TEXT,--ﾍﾟｶﾞｼｽｼｰﾄNo②
	ペガシスシートno3 TEXT,--ﾍﾟｶﾞｼｽｼｰﾄNo③
	c型エクセル TEXT,
	c型エクセル未作成 TEXT,
	肝癌id TEXT,	
  
	CONSTRAINT access_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE access OWNER TO converterdemo;
