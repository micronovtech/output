package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.Journal_entriesService;
import com.example.demo.entity.Journal_entries;

@RestController
@RequestMapping("/api/journal_entries")
public class Journal_entriesController {

    private final Journal_entriesService service;

    public Journal_entriesController(Journal_entriesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Journal_entries> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Journal_entries create(@RequestBody Journal_entries item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Journal_entries update(@PathVariable Long id, @RequestBody Journal_entries item) {
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
