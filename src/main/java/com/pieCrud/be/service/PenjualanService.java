package com.pieCrud.be.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.pieCrud.be.repository.PenjualanRepository;
import com.pieCrud.be.entity.Penjualan;

@Service
public class PenjualanService {
    private final PenjualanRepository repository;

    public PenjualanService(PenjualanRepository repository) {
        this.repository = repository;
    }

    public List<Penjualan> findAll() {
        return repository.findAll();
    }

    public Penjualan save(Penjualan item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
