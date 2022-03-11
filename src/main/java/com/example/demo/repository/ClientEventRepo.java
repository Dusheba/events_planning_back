package com.example.demo.repository;

import com.example.demo.entity.ClientEvent;
import org.springframework.data.repository.CrudRepository;

public interface ClientEventRepo extends CrudRepository<ClientEvent, Integer> {
}
