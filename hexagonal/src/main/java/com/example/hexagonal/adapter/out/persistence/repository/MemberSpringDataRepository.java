package com.example.hexagonal.adapter.out.persistence.repository;

import com.example.hexagonal.adapter.out.persistence.entity.MemberEntity;
import com.example.hexagonal.adapter.out.persistence.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSpringDataRepository extends JpaRepository<MemberEntity, Long> {
}
