package com.gcu.controllers;

import com.gcu.business.LoginService;
import com.gcu.models.LoginModel;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	//Injecting loginService
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String displayLogin(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(
            @Valid @ModelAttribute("loginModel") LoginModel loginModel,
            BindingResult bindingResult,
            Model model) {

    	// if errors return to login page
        if (bindingResult.hasErrors()) {
            return "login";
        }

        
        if (loginService.authenticate(loginModel.getUsername(), loginModel.getPassword())) {
            return "index";
        }

        model.addAttribute("error", "Invalid username or password.");
        return "login";
    }
}

