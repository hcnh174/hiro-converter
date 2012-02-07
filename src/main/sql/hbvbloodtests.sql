-- Table: hbvbloodtests

DROP TABLE IF EXISTS hbvbloodtests;

CREATE TABLE hbvbloodtests
(
	rowid serial NOT NULL,

	idnum TEXT,
	治療履歴 TEXT,
	ifn履歴 TEXT,
	日付 TEXT,

	mutant TEXT,--mutant
	hbsag TEXT,--HBsAg
	hbsab TEXT,--HBsAb
	hbeag TEXT,--HBeAg
	hbeab TEXT,--HBeAb
	hbcrag TEXT,--HBcrAg
	probe TEXT,--probe
	dnap TEXT,--DNA-p
	tma TEXT,--TMA
	pcr TEXT,--PCR
	ast TEXT,--GOT
	alt TEXT,--GPT TEXT,
	ggtp TEXT,--γ-GTP
	tbil TEXT,--T-Bil
	alb TEXT,--ALB
	plt TEXT,--PLT
	pt TEXT,--PT
	cre TEXT,--Cre
	bun TEXT,--BUN
	afp TEXT,--AFP
	pivka TEXT,--PIVKA
	
	icg TEXT, --icg(r15)
	pc TEXT, --pc
	
	CONSTRAINT hbvbloodtests_pkey PRIMARY KEY (rowid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE hbvbloodtests OWNER TO converterdemo;
