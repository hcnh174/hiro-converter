package edu.hiro.converter;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ConverterService
{
	void loadHcvBloodTests(String folder);
	void loadHbvBloodTests(String folder);
}
