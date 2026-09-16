package com.proemsalud.laboratory.catalog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proemsalud.laboratory.catalog.domain.Test;
import com.proemsalud.laboratory.catalog.domain.TestCategory;
import com.proemsalud.laboratory.catalog.dto.create.CreateTestRequest;
import com.proemsalud.laboratory.catalog.dto.request.TestResponse;
import com.proemsalud.laboratory.catalog.dto.update.UpdateTestRequest;
import com.proemsalud.laboratory.catalog.filter.TestFilter;
import com.proemsalud.laboratory.catalog.mapper.TestMapper;
import com.proemsalud.laboratory.catalog.repository.TestCategoryRepository;
import com.proemsalud.laboratory.catalog.repository.TestRepository;
import com.proemsalud.laboratory.catalog.specification.TestSpecification;
import com.proemsalud.laboratory.exception.ResourceNotFoundException;

@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private TestCategoryRepository testCategoryRepository;

	@Autowired
	private TestMapper testMapper;

	@Override
	public TestResponse create(CreateTestRequest request) {

		TestCategory category = testCategoryRepository.findById(request.getTestCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException(
						"La categoria no existe con id: " + request.getTestCategoryId()));

		Test test = testMapper.toEntity(request, category);
		Test saved = testRepository.save(test);

		return testMapper.toResponse(saved);
	}

	@Override
	public TestResponse update(Long id, UpdateTestRequest request) {

		Test test = testRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("El test no existe con id: " + id));

		TestCategory category = testCategoryRepository.findById(request.getTestCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException(
						"La categoria no existe con id: " + request.getTestCategoryId()));

		test.setName(request.getName());
		test.setPrice(request.getPrice());
		test.setReference(request.getReference());
		test.setTestType(request.getTestType());
		test.setCategory(category);

		Test updated = testRepository.save(test);

		return testMapper.toResponse(updated);
	}

	@Override
	public TestResponse findById(Long id) {

		Test test = testRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("El test no existe con id: " + id));

		return testMapper.toResponse(test);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<TestResponse> findAll(TestFilter filter, Pageable pageable) {

		Specification<Test> spec = TestSpecification.withFilters(filter);

		Page<Test> page = testRepository.findAll(spec, pageable);

		return page.map(testMapper::toResponse);
	}

	@Override
	public List<TestResponse> searchByName(String name) {

		return testRepository.findByNameContainingIgnoreCaseAndActiveTrue(name)
				.stream()
				.map(testMapper::toResponse)
				.collect(Collectors.toList());
	}

	@Override
	public List<TestResponse> searchByNameAndCategoryId(String name, Long categoryId) {

		return testRepository.findByNameContainingIgnoreCaseAndActiveTrueAndCategoryId(name, categoryId)
				.stream()
				.map(testMapper::toResponse)
				.collect(Collectors.toList());
	}

	@Override
	public void deactivate(Long id) {

		Test test = testRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("El test no existe con id: " + id));

		test.setActive(false);

		testRepository.save(test);
	}

	@Override
	public void activate(Long id) {

		Test test = testRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("El test no existe con id: " + id));

		test.setActive(true);

		testRepository.save(test);
	}

	@Override
	public void delete(Long id) {
		Test test = testRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("El test no existe con id: " + id));
		testRepository.delete(test);
		
	}

}