package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.PrimaryDiseaseItem;

public interface PrimaryDiseaseItemRepository extends JpaRepository<PrimaryDiseaseItem, Integer> {

}