package com.example.apl.service;

import com.example.apl.repository.UserRepository;
import com.example.db.domain.Userhi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Userhi> getUsers() {
        return userRepository.getUsers();
    }

    public Userhi getUser(int userId) {
        return userRepository.getUser(userId);
    }
}
