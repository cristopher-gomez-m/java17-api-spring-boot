package com.alex.api_java_test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alex.api_java_test.repository.UserRepository;
import com.alex.api_java_test.dto.CreateUserDto;
import com.alex.api_java_test.model.User;;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public List<User> getAll(){
        return this.userRepository.findAll();
    }

    public User save(CreateUserDto userDTO){
        User user = new User();

        user.setName(userDTO.getName());

        user.setEmail(userDTO.getEmail());

        return this.userRepository.save(user);
    }
}
