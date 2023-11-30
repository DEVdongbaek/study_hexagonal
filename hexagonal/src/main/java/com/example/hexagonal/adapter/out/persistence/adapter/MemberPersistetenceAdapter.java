package com.example.hexagonal.adapter.out.persistence.adapter;

import com.example.hexagonal.adapter.out.persistence.entity.MemberEntity;
import com.example.hexagonal.adapter.out.persistence.mapper.MemberMapper;
import com.example.hexagonal.adapter.out.persistence.repository.MemberSpringDataRepository;
import com.example.hexagonal.application.port.out.SaveMemberPort;
import com.example.hexagonal.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberPersistetenceAdapter implements SaveMemberPort {

    private final MemberMapper memberMapper;

    private final MemberSpringDataRepository repository;

    @Override
    public void saveMember(Member member) {
        repository.save(memberMapper.toEntity(member));
    }
}
