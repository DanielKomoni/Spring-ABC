package com.example.demo.dbService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
