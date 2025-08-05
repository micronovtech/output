package com.pieCrud.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pieCrud.be.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
