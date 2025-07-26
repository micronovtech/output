package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.GroupRepository;
import com.example.demo.entity.Group;

@Service
public class GroupService {
    private final GroupRepository repository;

    public GroupService(GroupRepository repository) {
        this.repository = repository;
    }

    public List<Group> findAll() {
        return repository.findAll();
    }

    public Group save(Group item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }

}
