package com.example.hexagonal.application.service;

import com.example.hexagonal.adapter.out.persistence.mapper.MemberMapper;
import com.example.hexagonal.application.port.out.SaveMemberPort;
import com.example.hexagonal.application.port.in.SaveMemberUseCase;
import com.example.hexagonal.application.port.in.dto.SaveMemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements SaveMemberUseCase {

    private final MemberMapper memberMapper;

    private final SaveMemberPort saveMemberPort;

    @Override
    public void saveMember(SaveMemberRequestDTO saveMemberRequestDTO) {
        saveMemberPort.saveMember(memberMapper.toEntity(saveMemberRequestDTO));
    }
}
