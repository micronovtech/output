package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.TransactionsService;
import com.example.demo.entity.Transactions;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsController {

    private final TransactionsService service;

    public TransactionsController(TransactionsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transactions> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Transactions create(@RequestBody Transactions item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Transactions update(@PathVariable Long id, @RequestBody Transactions item) {
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
