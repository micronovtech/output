package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.UserService;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.findAll();
    }

    @PostMapping
    public User create(@RequestBody User item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User item) {
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
