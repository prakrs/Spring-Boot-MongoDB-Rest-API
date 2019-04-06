package com.varun.example.springbootmongodbexample.resource;

import com.varun.example.springbootmongodbexample.document.Users;
import com.varun.example.springbootmongodbexample.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
