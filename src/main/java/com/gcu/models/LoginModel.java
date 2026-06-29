package com.gcu.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginModel {

    // Setting models for login form

    @NotBlank(message = "Username is required")
    @Size(min = 4, max = 32, message = "Username must be between 4 and 32 characters.")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 32, message = "Password must be between 6 and 32 characters.")
    private String password;

    // Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
