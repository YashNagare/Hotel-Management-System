package com.example.userservice.UserService.services;

import com.example.userservice.UserService.entities.User;

import java.util.List;

public interface UserService {

//    create user
    User saveUser(User user);

//    get all users
    List<User> getAllUser();

//    get user by ID
    User getUser(String userId);
}
