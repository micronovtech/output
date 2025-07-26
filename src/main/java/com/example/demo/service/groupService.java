package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.groupRepository;
import com.example.demo.entity.group;

@Service
public class groupService {
    private final groupRepository repository;

    public groupService(groupRepository repository) {
        this.repository = repository;
    }

    public List<group> findAll() {
        return repository.findAll();
    }

    public group save(group item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
