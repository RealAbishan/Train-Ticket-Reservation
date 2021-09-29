package com.example.trainticketreservation.Service.Impl;

import com.example.trainticketreservation.Service.SignUpService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    private static MongoTemplate datastore;

}
