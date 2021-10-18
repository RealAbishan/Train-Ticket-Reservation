package com.example.trainticketreservation.Repository;

import com.example.trainticketreservation.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SignUpRepository extends CrudRepository<User, String > {
}
