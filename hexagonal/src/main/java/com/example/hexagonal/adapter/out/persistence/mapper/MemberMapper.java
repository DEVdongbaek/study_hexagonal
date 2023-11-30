package com.example.hexagonal.adapter.out.persistence.mapper;

import com.example.hexagonal.adapter.out.persistence.entity.MemberEntity;
import com.example.hexagonal.application.port.in.dto.SaveMemberRequestDTO;
import com.example.hexagonal.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public Member toEntity(SaveMemberRequestDTO requestDTO){
        return Member.builder()
                .nickName(requestDTO.getNickName())
                .email(requestDTO.getEmail())
                .sex(requestDTO.getSex())
                .build();
    }


    public MemberEntity toEntity(Member member){
        return MemberEntity.builder()
                .nickName(member.getNickName())
                .email(member.getEmail())
                .sex(member.getSex())
                .build();
    }

    public Member toDomain(MemberEntity memberEntity){
        return Member.builder()
                .id(memberEntity.getId())
                .nickName(memberEntity.getNickName())
                .email(memberEntity.getEmail())
                .sex(memberEntity.getSex())
                .build();
    }
}
