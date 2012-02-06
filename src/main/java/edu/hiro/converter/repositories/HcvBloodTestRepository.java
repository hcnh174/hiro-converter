package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.HcvBloodTest;

public interface HcvBloodTestRepository extends JpaRepository<HcvBloodTest, Integer> {

}