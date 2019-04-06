package com.varun.example.springbootmongodbexample.repository;

import com.varun.example.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
}
