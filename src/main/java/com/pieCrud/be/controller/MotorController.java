package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.MotorService;
import com.pieCrud.be.entity.Motor;

@RestController
@RequestMapping("/api/motor")
public class MotorController {

    private final MotorService service;

    public MotorController(MotorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Motor> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Motor create(@RequestBody Motor item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Motor update(@PathVariable Long id, @RequestBody Motor item) {
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
