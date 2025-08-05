package com.pieCrud.be.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pieCrud.be.service.ProductsService;
import com.pieCrud.be.entity.Products;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private final ProductsService service;

    public ProductsController(ProductsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Products> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Products create(@RequestBody Products item) {
        return service.save(item);
    }

    @PutMapping("/{id}")
    public Products update(@PathVariable Long id, @RequestBody Products item) {
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
