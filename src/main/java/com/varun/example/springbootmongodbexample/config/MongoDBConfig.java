package com.varun.example.springbootmongodbexample.config;

import com.varun.example.springbootmongodbexample.document.Users;
import com.varun.example.springbootmongodbexample.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return strings -> {
            usersRepository.save(new Users(1, "Varun", "Development", 2000L));
            usersRepository.save(new Users(2, "Deep", "IT", 1000L));
        };
    }
}
