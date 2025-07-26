package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Grouping;

public interface GroupingRepository extends JpaRepository<Grouping, Long> {
}
