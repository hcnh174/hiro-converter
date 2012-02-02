package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.SnpItem;

public interface SnpItemRepository extends JpaRepository<SnpItem, Integer> {

}