package com.example.basketball.dto;

import com.example.basketball.entity.Account;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Userdto {
    private Long id;
    private String nickname;
    private String name;
    private String password;

    public Account toEntity() {
        return new Account(id, nickname, name, password);
    }
}
