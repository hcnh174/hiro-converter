package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.HospitalizationItem;

public interface HospitalizationItemRepository extends JpaRepository<HospitalizationItem, Integer> {

}