package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.BiopsyAnonymizationItem;

public interface BiopsyAnonymizationItemRepository extends JpaRepository<BiopsyAnonymizationItem, Integer> {

}