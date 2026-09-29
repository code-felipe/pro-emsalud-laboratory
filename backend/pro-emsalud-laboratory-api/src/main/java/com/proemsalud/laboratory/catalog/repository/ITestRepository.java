package com.proemsalud.laboratory.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.proemsalud.laboratory.catalog.domain.Test;

public interface ITestRepository extends JpaRepository<Test, Long>, JpaSpecificationExecutor<Test> {
	
	List<Test> findByNameContainingIgnoreCaseAndActiveTrue(String name);

	List<Test> findByNameContainingIgnoreCaseAndActiveTrueAndCategoryId(String name, Long panelId);
	

}
