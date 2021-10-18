package com.example.trainticketreservation.Controllers;

import com.example.trainticketreservation.Dtos.UserDto;
import com.example.trainticketreservation.Service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/signUp")
public class UserSignUpController {

    @Autowired
    private final SignUpService signUpService;

    public UserSignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    @PostMapping
    public ResponseEntity signup(@RequestBody UserDto userDto) {
        log.info("HIT| signUp /post {}");
        return ResponseEntity.ok(signUpService.signUp(userDto));
    }


}
