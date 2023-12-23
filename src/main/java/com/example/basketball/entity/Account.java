package com.example.basketball.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id // 각 객체를 식별하기 위한 Id임 (주민번호 같은거)
    private Long id;
    @Column //DB가 필드를 인식할 수 있게 해줌
    private String nickname;
    @Column //DB가 필드를 인식할 수 있게 해줌
    private String name;
    @Column
    private String password;
}
