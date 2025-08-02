package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.AccountsRepository;
import com.example.demo.entity.Accounts;

@Service
public class AccountsService {
    private final AccountsRepository repository;

    public AccountsService(AccountsRepository repository) {
        this.repository = repository;
    }

    public List<Accounts> findAll() {
        return repository.findAll();
    }

    public Accounts save(Accounts item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
