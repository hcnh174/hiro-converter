package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.domain.FmHcvPatient;

public interface FmHcvPatientRepository extends JpaRepository<FmHcvPatient, Integer> {

}