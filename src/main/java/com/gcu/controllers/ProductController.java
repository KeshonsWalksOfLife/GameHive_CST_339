package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.models.ProductModel;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	// GET /product - Serves the form with ProductModel 
    @GetMapping("/product")
    public String displayProduct(Model model)
    {
        model.addAttribute("title", "Product");
        model.addAttribute("productModel",new ProductModel());
        return "product";
    }
    
    // POST /product - processing the submitted product form
    @PostMapping("/product")
    public String doProduct(
    		@Valid @ModelAttribute("productModel") ProductModel productModel,
    		BindingResult bindingResult,
    		Model model)
    {
    	if (bindingResult.hasErrors()) {
    		model.addAttribute("title", "Product");
    		model.addAttribute("productModel", productModel);
    		return "product";
		} else {
			model.addAttribute("title", "Product Creation Successful");
			return "product";
		}
    }
}
