package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.GroupingRepository;
import com.example.demo.entity.Grouping;

@Service
public class GroupingService {
    private final GroupingRepository repository;

    public GroupingService(GroupingRepository repository) {
        this.repository = repository;
    }

    public List<Grouping> findAll() {
        return repository.findAll();
    }

    public Grouping save(Grouping item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
