package com.example.service;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserEmail(String userId) {
        User user = userRepository.findById(userId);
        if (user != null) {
            return user.getEmail();
        } else {
            // Handle the null case, for example by returning a default value or throwing an exception
            throw new IllegalArgumentException("User not found for ID: " + userId);
        }
    }
}