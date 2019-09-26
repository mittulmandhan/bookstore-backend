package com.bookstore.dto;

public class CreateProductRequestDTO {

	private String categoryId;
	private String name;
	private String description;
	private String unitPrice;
	private String file;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}


}
