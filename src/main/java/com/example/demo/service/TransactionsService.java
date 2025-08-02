package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.TransactionsRepository;
import com.example.demo.entity.Transactions;

@Service
public class TransactionsService {
    private final TransactionsRepository repository;

    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    public List<Transactions> findAll() {
        return repository.findAll();
    }

    public Transactions save(Transactions item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
