package com.example.userservice.UserService.services.impl;

import com.example.userservice.UserService.entities.Rating;
import com.example.userservice.UserService.entities.User;
import com.example.userservice.UserService.exceptions.ResourceNotFoundException;
import com.example.userservice.UserService.repositiories.UserRepository;
import com.example.userservice.UserService.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

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
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));

        ArrayList<Rating> ratingsOfUser = restTemplate.getForObject("http://localhost:8083/ratings/users/" + user.getUserId(), ArrayList.class);
        logger.info("{} }", ratingsOfUser);

        user.setRatings(ratingsOfUser);

        return user;
    }
}
