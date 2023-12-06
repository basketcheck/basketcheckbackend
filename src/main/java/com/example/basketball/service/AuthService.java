package com.example.basketball.service;

import com.example.basketball.dto.Userdto;
import com.example.basketball.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public String login(Userdto userdto) {
        return "hello";
    }
}
