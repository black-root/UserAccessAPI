package com.blackroot.useraccess.authentication.controller;

import com.blackroot.useraccess.authentication.model.User;
import com.blackroot.useraccess.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/ping")
    public String hello(){
        return "hi";
    }

    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
