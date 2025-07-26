package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.GroupService;
import com.example.demo.entity.Group;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    private final GroupService service;

    public GroupController(GroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<Group> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Group create(@RequestBody Group item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Group update(@PathVariable Long id, @RequestBody Group item) {
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
