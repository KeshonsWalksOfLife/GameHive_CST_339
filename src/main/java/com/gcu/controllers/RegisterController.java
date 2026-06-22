package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.models.RegisterModel;

import jakarta.validation.Valid;


@Controller
public class RegisterController
{
	// GET /register - Serves the form with RegisterModel 
    @GetMapping("/register")
    public String displayRegister(Model model)
    {
        model.addAttribute("title", "Register");
        model.addAttribute("registerModel",new RegisterModel());
        return "register";
    }
    
    // POST /register - processing the submitted form
    @PostMapping("/register")
    public String doRegister(
    		@Valid @ModelAttribute("registerModel") RegisterModel registerModel,
    		BindingResult bindingResult,
    		Model model)
    {
    	if (bindingResult.hasErrors()) {
    		model.addAttribute("title", "Register");
    		return "register";
		} else {
			model.addAttribute("title", "Registration Successful");
			return "login";
		}
    
    	
    	
    }
}
