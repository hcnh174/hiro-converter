package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.domain.AccessPatient;

public interface AccessPatientRepository extends JpaRepository<AccessPatient, Integer> {

}
