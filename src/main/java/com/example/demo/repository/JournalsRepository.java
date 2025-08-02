package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Journals;

public interface JournalsRepository extends JpaRepository<Journals, Long> {
}
