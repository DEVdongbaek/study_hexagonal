package com.example.hexagonal.domain;

import lombok.*;

@Getter
@Builder
public class Member {

    private Long id;

    private String nickName;

    private String sex;

    private String email;

    public void updateNickname(String nickName){
        this.nickName = nickName;
    }
}


