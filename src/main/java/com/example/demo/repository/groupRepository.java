package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.group;

public interface groupRepository extends JpaRepository<group, Long> {
}
