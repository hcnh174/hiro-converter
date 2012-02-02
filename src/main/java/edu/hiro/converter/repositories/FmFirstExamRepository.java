package edu.hiro.converter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hiro.converter.filemaker.FmFirstExam;

public interface FmFirstExamRepository extends JpaRepository<FmFirstExam, Integer> {

}