package com.example.trainticketreservation.Service.Impl;

import com.example.trainticketreservation.Dtos.UserDto;
import com.example.trainticketreservation.Model.User;
import com.example.trainticketreservation.Repository.SignUpRepository;
import com.example.trainticketreservation.Service.SignUpService;
import com.example.trainticketreservation.Utills.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    private static MongoTemplate datastore;

    @Autowired
    private SignUpRepository signUpRepository;

    private RandomString random;

    @Override
    public Object signUp(UserDto userDto) {
        String userId = random.nextString();
        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .userName(userDto.getUserName())
                .gender(userDto.getGender())
                .age(userDto.getAge())
                .mobileNumber(userDto.getMobileNumber())
                .build();
        User save = (User) signUpRepository.save(user);
        return userDto;
    }
}
