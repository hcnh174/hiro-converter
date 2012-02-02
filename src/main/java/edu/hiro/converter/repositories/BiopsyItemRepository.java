package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.BiopsyItem;

public interface BiopsyItemRepository extends JpaRepository<BiopsyItem, Integer> {

}