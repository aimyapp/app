package com.example.apl.controller;

import com.example.apl.service.UserService;
import com.example.db.domain.Userhi;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUsers")
    @Operation(summary = "全ユーザのリストを取得する")
    public List<Userhi> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getUser/{userId}")
    @Operation(summary = "ユーザを取得する")
    public Userhi getUser(@PathVariable int userId) {
        return userService.getUser(userId);
    }
}
