package com.example.trainticketreservation.Service.Impl;

import com.example.trainticketreservation.Dtos.UserDto;
import com.example.trainticketreservation.Model.User;
import com.example.trainticketreservation.Repository.SignUpRepository;
import com.example.trainticketreservation.Service.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    private SignUpRepository signUpRepository;

    @Override
    public Object addPartner(UserDto userDto) {
        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .age(userDto.getAge())
                .gender(userDto.getGender())
                .userName(userDto.getUserName())
                .mobileNumber(userDto.getMobileNumber())
                .build();

        User save = signUpRepository.save(user);
        return userDto;
    }

    @Override
    public Object getUsers(UserDto userDto) {
        return signUpRepository.findAll();
    }

    @Override
    public Object getUserById(String name) {
        return signUpRepository.findById(name);
    }
}
