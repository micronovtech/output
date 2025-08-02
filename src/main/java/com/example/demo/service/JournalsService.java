package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.JournalsRepository;
import com.example.demo.entity.Journals;

@Service
public class JournalsService {
    private final JournalsRepository repository;

    public JournalsService(JournalsRepository repository) {
        this.repository = repository;
    }

    public List<Journals> findAll() {
        return repository.findAll();
    }

    public Journals save(Journals item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
