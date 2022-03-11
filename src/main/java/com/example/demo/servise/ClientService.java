package com.example.demo.servise;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo repository;

    public List<Client> getAll() {
        return (List<Client>) repository.findAll();
    }
    public Client getById(int id){
        return repository.findClientById(id);
    }

    public void add(Client client) {
        repository.save(client);
    }
}
