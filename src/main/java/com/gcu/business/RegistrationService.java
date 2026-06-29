package com.gcu.business;

import org.springframework.stereotype.Service;
import com.gcu.models.RegisterModel;

@Service
public class RegistrationService {

    public void register(RegisterModel registerModel) {

        // Simulate registration (no database yet)
        System.out.println("Registering user:");
        System.out.println(registerModel.getFirstName());
        System.out.println(registerModel.getLastName());
        System.out.println(registerModel.getEmail());
        System.out.println(registerModel.getUsername());

        // Database will be added in a later milestone.
    }
}
