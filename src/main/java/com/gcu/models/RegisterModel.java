package com.gcu.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegisterModel {
	
	// Setting Models for registration form
	@NotBlank(message="First name is Required")
	@Size(max = 32, message = "First name must be at most 32 characters.")
	private String firstName;
	
	@NotBlank(message="Last name is Required")
	@Size(max = 32, message = "Last name must be at most 32 characters.")
	private String lastName;
	
	@NotBlank(message="Email is Required")
	@Email(message = "Please enter a valid email address.")
	private String email;
	
	@NotBlank(message="Phone number is Required")
	@Pattern(regexp ="^\\d{10}$" , message = "Phone number must be exactly 10 digits")
	private String phoneNumber;
	
	@NotBlank(message="Username is Required")
	@Size(min = 4, max = 32, message = "Username must be between 4 and 32 characters")
	private String username;
	
	@NotBlank(message="Passwordis Required")
	@Size(min = 6, max = 32, message = "Password must be must be between 4 and 32 characters")
	private String password;
	
	// Getters 
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	 
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getUsername() {
		return username;
	}
	

	public String getPassword() {
		return password;
		
	}		
	
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	 
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void  setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
}