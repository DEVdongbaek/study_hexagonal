package com.example.hexagonal.application.port.in;

import com.example.hexagonal.application.port.in.dto.SaveMemberRequestDTO;

public interface SaveMemberUseCase {

    void saveMember(SaveMemberRequestDTO saveMemberRequestDTO);

}
