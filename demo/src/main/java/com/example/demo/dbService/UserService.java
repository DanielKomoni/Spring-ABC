package com.example.demo.dbService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public boolean isPasswordValid(String enteredPassword, String hashedPassword) {
        return enteredPassword.equals(hashedPassword);
    }
}
