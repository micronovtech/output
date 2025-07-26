package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.GroupingService;
import com.example.demo.entity.Grouping;

@RestController
@RequestMapping("/api/Groupings")
public class GroupingController {

    private final GroupingService service;

    public GroupingController(GroupingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Grouping> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Grouping create(@RequestBody Grouping item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Grouping update(@PathVariable Long id, @RequestBody Grouping item) {
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
