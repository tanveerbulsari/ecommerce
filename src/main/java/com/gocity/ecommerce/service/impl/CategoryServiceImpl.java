package com.gocity.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gocity.ecommerce.domain.Category;
import com.gocity.ecommerce.exception.GenericBusinessException;
import com.gocity.ecommerce.mapper.CategoryMapper;
import com.gocity.ecommerce.repository.CategoryRepository;
import com.gocity.ecommerce.response.CategoryResponseDto;
import com.gocity.ecommerce.service.CategoryService;

/**
 * Service implmentation of @CategoryService
 * 
 * @author Tanveer Bulsari
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public Category findById(String id) throws GenericBusinessException {
		return categoryRepository.findById(id).orElseThrow(() -> new GenericBusinessException("Category Not Found"));
	}

	@Override
	public Category addCategory(String name) throws GenericBusinessException {
		Category category = new Category(name);
		category = categoryRepository.save(category);
		return category;
	}

	@Override
	public CategoryResponseDto getAllCategories() {
		return new CategoryResponseDto(
				categoryMapper.categoriesDomainsToCategoriesResponse(categoryRepository.findAll()));
	}

}
