package com.gcu.models;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductModel {

	private int id;
	
	@NotBlank(message="Enter in Product Name")
	@Size(min = 1, max = 50, message = "Product name must be 2 and 50 characters")
	private String productName;
	
	@NotBlank(message="Choose a category")
	@Size(message = "A category must be active")
	private String category;
	
	@DecimalMin(value="0.01" , message = "Price must be greater than 0.00")
	private double price;
	
	@Min(value = 1, message = "Quantity must be at least 1")
	@Max(value = 999, message = "Quantity must be less than 999")
	private int quantity;
	
	@NotBlank(message="Choose a status")
	private String status;
	
	@NotBlank(message="Enter a Description")
	@Size(min = 8, max = 100, message = "Description must be between 8 and 100 characters")
	private String description;
	
	// Getters 
	public int getId() {
		return id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getCategory() {
		return category;
	}
	 
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	

	public String getStatus() {
		return status;
		
	}	
	
	public String getDescription() {
		return description;
	}
	
	// Setters
	public void setId(int id) {
		this.id= id;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
