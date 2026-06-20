package com.gcu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController
{
    @GetMapping("/register")
    public String displayRegister()
    {
        return "register";
    }
}