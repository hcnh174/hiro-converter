package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.AccessPatient;

public interface AccessPatientRepository extends JpaRepository<AccessPatient, Integer> {

}
