package com.alex.api_java_test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.api_java_test.dto.CreateUserDto;
import com.alex.api_java_test.model.User;
import com.alex.api_java_test.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping    
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @PostMapping
    public User save(@Valid @RequestBody CreateUserDto userDTO){
        return this.userService.save(userDTO);
    }
}
