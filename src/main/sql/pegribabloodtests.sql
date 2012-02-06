-- Table: pegribabloodtests

DROP TABLE pegribabloodtests;

CREATE TABLE pegribabloodtests
(
	rowid serial NOT NULL,

	pegribadbno INTEGER,
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
	
	CONSTRAINT pegribabloodtests_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pegribabloodtests OWNER TO converterdemo;
