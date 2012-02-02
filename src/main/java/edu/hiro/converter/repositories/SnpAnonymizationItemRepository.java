package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.SnpAnonymizationItem;

public interface SnpAnonymizationItemRepository extends JpaRepository<SnpAnonymizationItem, Integer> {

}