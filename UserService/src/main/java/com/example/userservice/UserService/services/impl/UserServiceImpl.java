package com.example.userservice.UserService.services.impl;

import com.example.userservice.UserService.entities.User;
import com.example.userservice.UserService.exceptions.ResourceNotFoundException;
import com.example.userservice.UserService.repositiories.UserRepository;
import com.example.userservice.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUUID = UUID.randomUUID().toString();
        user.setUserId(randomUUID);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        System.out.println("inside serviceImpl" + userId);
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
    }
}
