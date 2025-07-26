package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.groupService;
import com.example.demo.entity.group;

@RestController
@RequestMapping("/api/groups")
public class groupController {

    private final groupService service;

    public groupController(groupService service) {
        this.service = service;
    }

    @GetMapping
    public List<group> getAll() {
        return service.findAll();
    }

    @PostMapping
    public group create(@RequestBody group item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public group update(@PathVariable Long id, @RequestBody group item) {
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
