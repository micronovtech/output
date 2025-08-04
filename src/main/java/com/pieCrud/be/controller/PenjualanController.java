package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.PenjualanService;
import com.pieCrud.be.entity.Penjualan;

@RestController
@RequestMapping("/api/penjualan")
public class PenjualanController {

    private final PenjualanService service;

    public PenjualanController(PenjualanService service) {
        this.service = service;
    }

    @GetMapping
    public List<Penjualan> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Penjualan create(@RequestBody Penjualan item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Penjualan update(@PathVariable Long id, @RequestBody Penjualan item) {
        item.setId(id);
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }
}
