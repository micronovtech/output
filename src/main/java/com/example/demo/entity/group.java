package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String group_name;
    private Double description;
    private Integer count;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getGroup_name() { return group_name; }
    public void setGroup_name(String group_name) { this.group_name = group_name; }
    public Double getDescription() { return description; }
    public void setDescription(Double description) { this.description = description; }
    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }
}
