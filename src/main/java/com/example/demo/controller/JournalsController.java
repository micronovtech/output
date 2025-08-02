package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.JournalsService;
import com.example.demo.entity.Journals;

@RestController
@RequestMapping("/api/journals")
public class JournalsController {

    private final JournalsService service;

    public JournalsController(JournalsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Journals> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Journals create(@RequestBody Journals item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Journals update(@PathVariable Long id, @RequestBody Journals item) {
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
