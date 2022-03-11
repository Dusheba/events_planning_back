package com.example.demo.servise;

import com.example.demo.entity.EventCategory;
import com.example.demo.repository.EventCatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private EventCatRepo repository;

    public List<EventCategory> getAll() {
        return (List<EventCategory>) repository.findAll();
    }

    public void addCat(EventCategory category){
        repository.save(category);
    }
}
