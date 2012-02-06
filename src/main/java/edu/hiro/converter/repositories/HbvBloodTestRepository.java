package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.HbvBloodTest;

public interface HbvBloodTestRepository extends JpaRepository<HbvBloodTest, Integer> {

}