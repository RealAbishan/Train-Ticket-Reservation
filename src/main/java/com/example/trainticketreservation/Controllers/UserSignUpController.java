package com.example.trainticketreservation.Controllers;

import com.example.trainticketreservation.Dtos.UserDto;
import com.example.trainticketreservation.Model.User;
import com.example.trainticketreservation.Service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/signup")
public class UserSignUpController {

    @Autowired
    private final SignUpService signUpService;

    public UserSignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }


    @PostMapping
    public ResponseEntity signUp(@RequestBody UserDto userDto) {
        log.info("HIT| signUp /POST {}");
        return ResponseEntity.ok(signUpService.addPartner(userDto));
    }

    @GetMapping
    public ResponseEntity getAllUsers(@RequestBody UserDto userDto) {
        log.info("HIT| signUp /GET {}");
        return ResponseEntity.ok(signUpService.getUsers(userDto));
    }


    @GetMapping("{id}")
    public ResponseEntity getUserById(@PathVariable("name") String name) {
        log.info("HIT| signUp/id /GET {}");
        return ResponseEntity.ok(signUpService.getUserById(name));
    }








}
