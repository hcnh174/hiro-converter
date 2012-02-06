-- Table: fmfirstexam

DROP TABLE fmfirstexam;

CREATE TABLE fmfirstexam
(
  rowid serial NOT NULL,
  
	エンボス TEXT,
	ふりがな TEXT,
	外来医 TEXT,
	患者名 TEXT,
	肝研id TEXT,
	初診後転帰 TEXT,
	初診時積算飲酒量 TEXT,
	初診時年齢 TEXT,
	初診日 TEXT,
	診断状況 TEXT,
	診断名 TEXT,
	身長 TEXT,
	性別 TEXT,
	生年月日 TEXT,
	体重 TEXT,
	年 TEXT,
	hcc TEXT,
	備考 TEXT,
	病期 TEXT,

  
  CONSTRAINT fmfirstexam_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE fmfirstexam OWNER TO converterdemo;
