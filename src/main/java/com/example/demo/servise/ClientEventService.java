package com.example.demo.servise;

import com.example.demo.entity.ClientEvent;
import com.example.demo.repository.ClientEventRepo;
import com.example.demo.repository.ClientPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientEventService {
    @Autowired
    private ClientEventRepo repository;

    public List<ClientEvent> getAll() {
        return (List<ClientEvent>) repository.findAll();
    }
}
