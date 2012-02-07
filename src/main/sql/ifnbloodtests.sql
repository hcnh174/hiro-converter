-- Table: ifnbloodtests

DROP TABLE IF EXISTS ifnbloodtests;

CREATE TABLE ifnbloodtests
(
	rowid serial NOT NULL,
	ifndbno TEXT,
	type TEXT,	
	予定日 TEXT,
	日付 TEXT,
	wbc TEXT,
	好中球分画 TEXT,
	hb TEXT,
	plt TEXT,
	ast TEXT,
	alt TEXT,
	kl6 TEXT,
	ggtp TEXT,
	hcv定量 TEXT,
	hcv定性 TEXT,
	減量中止の有無 TEXT,
	pegイントロン TEXT,
	レベトール TEXT,
	
	CONSTRAINT ifnbloodtests_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ifnbloodtests OWNER TO converterdemo;
