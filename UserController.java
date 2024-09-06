package com.VMOproject.fresher.controller;

import com.VMOproject.fresher.dto.request.UserCreationRequest;
import com.VMOproject.fresher.entity.User;
import com.VMOproject.fresher.repository.UserRepository;
import com.VMOproject.fresher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createUser((UserRepository) request);
    }
}

