package com.example.hexagonal.application.port.in.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveMemberRequestDTO {

    private String nickName;

    private String email;

    private String sex;

}
