package com.example.trainticketreservation.Controllers;

import com.example.trainticketreservation.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserSignUpController {

    @Autowired
    private final SignUpService signUpService;

    public UserSignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }
}
