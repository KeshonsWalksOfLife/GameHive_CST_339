package com.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean authenticate(String username, String password) {
        return username.equals("TestUser") && password.equals("123password");
    }
}
