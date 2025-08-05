package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.CustomersRepository;
import com.pieCrud.be.entity.Customers;

@Service
public class CustomersService {
    private final CustomersRepository repository;

    public CustomersService(CustomersRepository repository) {
        this.repository = repository;
    }

    public List<Customers> findAll() {
        return repository.findAll();
    }

    public Customers save(Customers item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
