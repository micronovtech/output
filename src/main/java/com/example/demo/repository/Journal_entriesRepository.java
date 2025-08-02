package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Journal_entries;

public interface Journal_entriesRepository extends JpaRepository<Journal_entries, Long> {
}
