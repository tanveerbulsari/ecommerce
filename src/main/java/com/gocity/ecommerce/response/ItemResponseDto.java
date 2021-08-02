package com.gocity.ecommerce.response;

import java.io.Serializable;

/**
 * Response Data transfer object for Item
 * 
 * @author Tanveer Bulsari
 *
 */
public class ItemResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	private String name;

	private CategoryDto category;

	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemResponseDto() {
		super();
	}

}
