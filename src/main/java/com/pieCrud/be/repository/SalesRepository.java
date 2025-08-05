package com.pieCrud.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pieCrud.be.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}
