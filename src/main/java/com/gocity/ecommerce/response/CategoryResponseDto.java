package com.gocity.ecommerce.response;

import java.io.Serializable;
import java.util.List;

/**
 * Response Data transfer object for Item
 * 
 * @author Tanveer Bulsari
 *
 */
public class CategoryResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CategoryDto> categories;

	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}

	public CategoryResponseDto(List<CategoryDto> categories) {
		super();
		this.categories = categories;
	}

	public CategoryResponseDto() {
		super();
	}

}
