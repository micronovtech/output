package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.CustomerRepository;
import com.pieCrud.be.entity.Customer;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer save(Customer item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
