package com.pieCrud.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pieCrud.be.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
