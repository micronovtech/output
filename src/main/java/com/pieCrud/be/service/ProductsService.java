package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.ProductsRepository;
import com.pieCrud.be.entity.Products;

@Service
public class ProductsService {
    private final ProductsRepository repository;

    public ProductsService(ProductsRepository repository) {
        this.repository = repository;
    }

    public List<Products> findAll() {
        return repository.findAll();
    }

    public Products save(Products item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
