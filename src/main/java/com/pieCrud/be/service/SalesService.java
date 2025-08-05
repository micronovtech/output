package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.SalesRepository;
import com.pieCrud.be.entity.Sales;

@Service
public class SalesService {
    private final SalesRepository repository;

    public SalesService(SalesRepository repository) {
        this.repository = repository;
    }

    public List<Sales> findAll() {
        return repository.findAll();
    }

    public Sales save(Sales item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
