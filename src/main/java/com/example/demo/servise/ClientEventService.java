package com.example.demo.servise;

import com.example.demo.entity.Client;
import com.example.demo.entity.ClientEvent;
import com.example.demo.entity.Event;
import com.example.demo.repository.ClientEventRepo;
import com.example.demo.repository.ClientPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientEventService {
    @Autowired
    private ClientEventRepo repository;

    public List<ClientEvent> getAll() {
        return (List<ClientEvent>) repository.findAll();
    }

    public List<Event> getAllByClient(int id){
        List<Event> events = new ArrayList<>();
        List<ClientEvent> clientEvents = repository.getByClient(id);
        for (ClientEvent clientEvent : clientEvents) {
            events.add(clientEvent.getEvent());
        }
        return events;
    }

    public List<Client> getByEvent(int id){
        List<ClientEvent> clientEvents = repository.getByEvent(id);
        List<Client> clients = new ArrayList<>();
        for (ClientEvent clientEvent : clientEvents) {
            clients.add(clientEvent.getClient());
        }
        return clients;
    }
}
