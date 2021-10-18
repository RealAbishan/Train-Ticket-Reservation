package com.example.trainticketreservation.Service;

import com.example.trainticketreservation.Dtos.UserDto;


public interface SignUpService {

    Object addPartner(UserDto userDto);

    Object getUsers(UserDto userDto);

    Object getUserById(String name);
}
