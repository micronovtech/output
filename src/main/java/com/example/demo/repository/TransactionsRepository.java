package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
}
