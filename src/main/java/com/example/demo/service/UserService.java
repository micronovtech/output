package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(User item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
