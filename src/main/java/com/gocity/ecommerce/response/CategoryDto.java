package com.gocity.ecommerce.response;

public class CategoryDto {
	private String id;

	private String name;

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

	public CategoryDto() {
		super();
	}

	public CategoryDto(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
