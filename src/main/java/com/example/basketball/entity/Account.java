package com.example.basketball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
public class Account {
    @Id // 각 객체를 식별하기 위한 Id임 (주민번호 같은거)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id를 1, 2, 3 ,.. 자동생성하기 위함
    private Long id;

    @Column //DB가 필드를 인식할 수 있게 해줌
    private String title;
    @Column
    private String content;
}
