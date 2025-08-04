package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.MontirService;
import com.pieCrud.be.entity.Montir;

@RestController
@RequestMapping("/api/montir")
public class MontirController {

    private final MontirService service;

    public MontirController(MontirService service) {
        this.service = service;
    }

    @GetMapping
    public List<Montir> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Montir create(@RequestBody Montir item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Montir update(@PathVariable Long id, @RequestBody Montir item) {
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
