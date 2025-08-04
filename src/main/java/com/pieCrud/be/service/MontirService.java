package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.MontirRepository;
import com.pieCrud.be.entity.Montir;

@Service
public class MontirService {
    private final MontirRepository repository;

    public MontirService(MontirRepository repository) {
        this.repository = repository;
    }

    public List<Montir> findAll() {
        return repository.findAll();
    }

    public Montir save(Montir item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
