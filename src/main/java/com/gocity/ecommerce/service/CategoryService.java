package com.gocity.ecommerce.service;

import org.springframework.stereotype.Service;

import com.gocity.ecommerce.domain.Category;
import com.gocity.ecommerce.exception.GenericBusinessException;
import com.gocity.ecommerce.response.CategoryResponseDto;

/**
 * Item service for inserting categories
 * 
 * @author Tanveer Bulsari
 *
 */

@Service
public interface CategoryService {
	/**
	 * Finding Category by its id
	 * 
	 * @param id
	 * @return
	 * @throws GenericBusinessException
	 */
	public Category findById(String id) throws GenericBusinessException;

	/**
	 * Service method to add an @Category
	 * 
	 * @param name
	 * @return
	 */
	public Category addCategory(String name) throws GenericBusinessException;

	/**
	 * Service method to get all categories
	 * 
	 * @return
	 */
	public CategoryResponseDto getAllCategories();
}
