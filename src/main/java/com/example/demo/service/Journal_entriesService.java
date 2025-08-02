package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.Journal_entriesRepository;
import com.example.demo.entity.Journal_entries;

@Service
public class Journal_entriesService {
    private final Journal_entriesRepository repository;

    public Journal_entriesService(Journal_entriesRepository repository) {
        this.repository = repository;
    }

    public List<Journal_entries> findAll() {
        return repository.findAll();
    }

    public Journal_entries save(Journal_entries item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
