package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.CustomersService;
import com.pieCrud.be.entity.Customers;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private final CustomersService service;

    public CustomersController(CustomersService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customers> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Customers create(@RequestBody Customers item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Customers update(@PathVariable Long id, @RequestBody Customers item) {
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
