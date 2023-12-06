package com.example.basketball.controller;

import com.example.basketball.dto.Userdto;
import com.example.basketball.repository.UserRepository;
import com.example.basketball.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthService authService;
    @PostMapping("/login")
    public String login(@RequestBody Userdto userdto) {
        return authService.login(userdto);
    }
}
