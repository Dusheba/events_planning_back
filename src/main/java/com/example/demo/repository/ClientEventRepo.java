package com.example.demo.repository;

import com.example.demo.entity.ClientEvent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientEventRepo extends CrudRepository<ClientEvent, Integer> {

    @Query(value = "SELECT * FROM client_event as ce join client c on c.id = ce.client_id" +
            " join event e on e.id = ce.event_id where ce.client_id=:id"
            ,nativeQuery = true)
    List<ClientEvent> getByClient(int id);

    @Query(value = "SELECT * FROM client_event as ce join client c on c.id = ce.client_id" +
            " join event e on e.id = ce.event_id where ce.event_id=:id"
            ,nativeQuery = true)
    List<ClientEvent> getByEvent(int id);
}
