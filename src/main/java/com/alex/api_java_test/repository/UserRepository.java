package com.alex.api_java_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.api_java_test.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
