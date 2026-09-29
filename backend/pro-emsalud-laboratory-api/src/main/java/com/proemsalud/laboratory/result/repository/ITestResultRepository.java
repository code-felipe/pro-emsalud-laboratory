package com.proemsalud.laboratory.result.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.proemsalud.laboratory.result.domain.TestResult;

public interface ITestResultRepository extends JpaRepository<TestResult, Long>, JpaSpecificationExecutor<TestResult> {
	
	Optional<TestResult> findByIdAndOrderId(Long id, Long orderId);
	
	boolean existsByTestId(Long testId);

}
