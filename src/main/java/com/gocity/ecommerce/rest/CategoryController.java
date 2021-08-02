package com.gocity.ecommerce.rest;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gocity.ecommerce.request.CategoryRequestDto;
import com.gocity.ecommerce.response.ApiResponse;
import com.gocity.ecommerce.response.CategoryResponseDto;
import com.gocity.ecommerce.service.CategoryService;

/**
 * REST Controller to perform any actions related to @Category
 * 
 * @author Tanveer Bulsari
 *
 */
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/category")
public class CategoryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	private CategoryService categoryService;

	/**
	 * REST service for adding category
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void registration(@Valid @RequestBody CategoryRequestDto request) throws Exception {
		LOGGER.info("REST service for adding category with name {} called", request.getName());
		categoryService.addCategory(request.getName());
	}

	/**
	 * REST service for fetching all categories
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/findAll")
	public ApiResponse<CategoryResponseDto> findAll() throws Exception {
		LOGGER.info("REST service for getting all categories list called");
		return new ApiResponse<CategoryResponseDto>(categoryService.getAllCategories(), HttpStatus.OK.value(),
				"Fetched all categories");
	}
}
