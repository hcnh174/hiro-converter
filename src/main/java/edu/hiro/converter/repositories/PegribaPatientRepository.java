package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.PegribaPatient;

public interface PegribaPatientRepository extends JpaRepository<PegribaPatient, Integer> {

}