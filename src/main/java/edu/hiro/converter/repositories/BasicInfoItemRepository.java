package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.access.BasicInfoItem;

public interface BasicInfoItemRepository extends JpaRepository<BasicInfoItem, Integer> {

}