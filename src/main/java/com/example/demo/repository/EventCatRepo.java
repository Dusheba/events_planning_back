package com.example.demo.repository;

import com.example.demo.entity.EventCategory;
import org.springframework.data.repository.CrudRepository;

public interface EventCatRepo extends CrudRepository<EventCategory, Integer> {
}
