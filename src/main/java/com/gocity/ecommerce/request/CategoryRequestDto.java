package com.gocity.ecommerce.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Request class for the Creating Category Request REST API
 * 
 * @author Tanveer Bulsari
 *
 */

public class CategoryRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Name is mandatory")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
