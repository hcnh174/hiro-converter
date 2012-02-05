package edu.hiro.converter.batch;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import edu.hiro.converter.filemaker.FmHcvPatient;
import edu.hiro.converter.repositories.FmHcvPatientRepository;

public class FmHcvPatientItemWriter extends JpaItemWriter<FmHcvPatient>
{
	@Override
	public void doWrite(EntityManager entityManager, List<? extends FmHcvPatient> patients)
	{
		for(FmHcvPatient patient : patients)
		{
			System.out.println("writing patient: "+patient.toString());
			entityManager.persist(patient);
		}
		//entityManager.flush();
	}
}