package edu.hiro.converter.batch;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BatchImportService
{
	void loadPatients(String filename);
}
