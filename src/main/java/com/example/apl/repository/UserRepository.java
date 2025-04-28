package com.example.apl.repository;

import com.example.db.domain.Userhi;
import com.example.db.mapper.UserhiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    UserhiMapper userhiMapper;

    public List<Userhi> getUsers() {
        return userhiMapper.findAll();
    }

    public Userhi getUser(int userId) {
        return userhiMapper.findById(userId);
    }
}
