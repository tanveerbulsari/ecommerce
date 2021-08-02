package com.gocity.ecommerce.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Request class for the Creating/Updating Request REST API
 * 
 * @author Tanveer Bulsari
 *
 */

public class ItemRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Name is mandatory")
	private String name;

	@NotNull(message = "Category Id is mandatory")
	private String categoryId;

	@NotNull(message = "Description is mandatory")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
