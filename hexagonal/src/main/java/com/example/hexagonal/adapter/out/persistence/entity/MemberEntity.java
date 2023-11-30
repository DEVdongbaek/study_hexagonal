package com.example.hexagonal.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "MEMBER")
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String nickName;

    private String sex;

    private String email;
}
