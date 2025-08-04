package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.MotorRepository;
import com.pieCrud.be.entity.Motor;

@Service
public class MotorService {
    private final MotorRepository repository;

    public MotorService(MotorRepository repository) {
        this.repository = repository;
    }

    public List<Motor> findAll() {
        return repository.findAll();
    }

    public Motor save(Motor item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
