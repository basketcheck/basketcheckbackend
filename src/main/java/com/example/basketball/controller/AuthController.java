package com.example.basketball.controller;

import com.example.basketball.dto.Userdto;
import com.example.basketball.entity.Account;
import com.example.basketball.repository.UserRepository;
import com.example.basketball.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;

@RestController
@Slf4j
public class AuthController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthService authService;
    @PostMapping("/signup")
    public String signup(@RequestBody Userdto userdto) {
        log.info(userdto.toString());
        Account account = userdto.toEntity();

        log.info(account.toString());
        // 저장할 ID랑 DB에 있는 ID랑 같은 거
        String saved_id = String.valueOf(userRepository.findById(account.getId()));

        // 만약 내가 쓸 아이디가 없다면
        if (Objects.equals(String.valueOf(saved_id), String.valueOf(Optional.empty()))) {
            // 저장
            Account saved = userRepository.save(account);
            log.info("ok");
        } else {
            // 저장 안함
            log.info("no");
        }
        return "redirect:/ok";
    }

    @PostMapping("/signin")
    public String signin(@RequestBody Userdto userdto) {
        log.info(userdto.toString());
        Account account = userdto.toEntity();

        log.info(account.toString());

        Account saved = userRepository.save(account);

        log.info(saved.toString());
        return "redirect:/ok";
    }
}
