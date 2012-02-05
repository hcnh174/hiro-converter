package edu.hiro.converter.batch;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.batch.item.database.JpaItemWriter;

import edu.hiro.util.AbstractEntity;
import edu.hiro.util.FileHelper;

public class PatientItemWriter extends JpaItemWriter<AbstractEntity>
{
	@Override
	public void doWrite(EntityManager entityManager, List<? extends AbstractEntity> patients)
	{
		for(AbstractEntity patient : patients)
		{
			//System.out.println("writing patient: "+patient.toString());
			FileHelper.appendFile("d:/temp/patients.txt",patient.toString());
			entityManager.persist(patient);
		}
	}
}