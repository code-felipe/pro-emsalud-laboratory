package com.proemsalud.laboratory.catalog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proemsalud.laboratory.catalog.dto.create.CreateTestRequest;
import com.proemsalud.laboratory.catalog.dto.request.TestResponse;
import com.proemsalud.laboratory.catalog.dto.update.UpdateTestRequest;
import com.proemsalud.laboratory.catalog.filter.TestFilter;

public interface ITestService {
	
	TestResponse create(CreateTestRequest request);

	TestResponse update(Long id, UpdateTestRequest request);

	TestResponse findById(Long id);

	Page<TestResponse> findAll(TestFilter filter, Pageable pageable);
	
	List<TestResponse> searchByName(String name);
	
	List<TestResponse> searchByNameAndCategoryId(String name, Long categoryId);
	
	void deactivate(Long id);

	void activate(Long id);
	
	void delete(Long id);
}
