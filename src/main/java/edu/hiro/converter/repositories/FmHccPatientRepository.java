package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.FmHccPatient;

public interface FmHccPatientRepository extends JpaRepository<FmHccPatient, Integer> {

}