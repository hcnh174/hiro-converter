package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.FmHbvPatient;

public interface FmHbvPatientRepository extends JpaRepository<FmHbvPatient, Integer> {

}