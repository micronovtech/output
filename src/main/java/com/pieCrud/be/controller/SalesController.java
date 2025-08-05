package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.SalesService;
import com.pieCrud.be.entity.Sales;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    private final SalesService service;

    public SalesController(SalesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sales> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Sales create(@RequestBody Sales item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Sales update(@PathVariable Long id, @RequestBody Sales item) {
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
