package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.domain.FmHccPatient;

public interface FmHccPatientRepository extends JpaRepository<FmHccPatient, Integer> {

}