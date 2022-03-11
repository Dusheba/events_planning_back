package com.example.demo.repository;

import com.example.demo.entity.Client;
import com.example.demo.entity.ClientPreference;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientPrefRepo extends CrudRepository<ClientPreference, Integer> {

    @Query(value = "SELECT * FROM client_preference " +
            "join client c on c.id = client_preference.client_id " +
            "join preference p on p.id = client_preference.pref_id " +
            "where client_preference.client_id=:id", nativeQuery = true)
    List<ClientPreference> getByClient(int id);
}
