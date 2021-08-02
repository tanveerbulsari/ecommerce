package com.gocity.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.gocity.ecommerce.domain.Category;
import com.gocity.ecommerce.response.CategoryDto;

/**
 * 
 * Mapper class for @Category
 * 
 * @author Tanveer Bulsari
 *
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {

	public List<CategoryDto> categoriesDomainsToCategoriesResponse(List<Category> categories);
	
	public CategoryDto categoryDomainToCategoryResponse(Category category);

}
