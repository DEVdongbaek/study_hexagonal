package com.example.hexagonal.adapter.in.web;

import com.example.hexagonal.application.port.in.SaveMemberUseCase;
import com.example.hexagonal.application.port.in.dto.SaveMemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final SaveMemberUseCase saveMemberUseCase;

    // 회원가입
    @PostMapping("")
    void saveMember(@RequestBody SaveMemberRequestDTO requestDTO){
        saveMemberUseCase.saveMember(requestDTO);
    }
}
