package com.example.hexagonal.application.port.out;

import com.example.hexagonal.domain.Member;

public interface SaveMemberPort {

    void saveMember(Member member);

}
