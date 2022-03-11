package com.example.demo.repository;

import com.example.demo.entity.ClientPreference;
import org.springframework.data.repository.CrudRepository;

public interface ClientPrefRepo extends CrudRepository<ClientPreference, Integer> {
}
