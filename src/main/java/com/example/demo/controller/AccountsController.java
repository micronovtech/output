package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.AccountsService;
import com.example.demo.entity.Accounts;

@RestController
@RequestMapping("/api/accounts")
public class AccountsController {

    private final AccountsService service;

    public AccountsController(AccountsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Accounts> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Accounts create(@RequestBody Accounts item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Accounts update(@PathVariable Long id, @RequestBody Accounts item) {
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
