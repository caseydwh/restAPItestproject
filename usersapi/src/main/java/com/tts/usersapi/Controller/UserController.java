package com.tts.usersapi.Controller;

import com.tts.usersapi.model.User;
import com.tts.usersapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
private UserRepository repository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return (List<User>) repository.findAll();
    }

}
