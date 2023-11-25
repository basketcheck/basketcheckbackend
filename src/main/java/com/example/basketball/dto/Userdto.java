package com.example.basketball.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class Userdto {
    private Long id;

    @JsonProperty("days_id")
    private Long daysId;
    private String nickname;
    private String password;
}
