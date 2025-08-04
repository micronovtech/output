package com.pieCrud.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pieCrud.be.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
