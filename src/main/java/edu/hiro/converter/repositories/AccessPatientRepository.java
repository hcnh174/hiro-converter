package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.AccessPatient;

public interface AccessPatientRepository extends JpaRepository<AccessPatient, Integer> {

}
