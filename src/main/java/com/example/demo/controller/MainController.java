package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.entity.ClientEvent;
import com.example.demo.entity.Event;
import com.example.demo.entity.EventCategory;
import com.example.demo.servise.CategoryService;
import com.example.demo.servise.ClientEventService;
import com.example.demo.servise.ClientService;
import com.example.demo.servise.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MainController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientEventService clientEventServise;
    @Autowired
    private EventService eventService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/clients/all")
    public List<Client> gelAll() {
        return clientService.getAll();
    }
    @GetMapping("/clients/id")
    public Client getById(@RequestParam int id){
        return clientService.getById(id);
    }

    @GetMapping("/all")
    public List<ClientEvent> getALl() {
        return clientEventServise.getAll();
    }

    @GetMapping("/events/all")
    public List<Event> getAllEvent() {
        return eventService.getAll();
    }

    @GetMapping("/category/all")
    public List<EventCategory> getAllCats() {
        return categoryService.getAll();
    }

    @GetMapping("/events/owner")
    public List<Event> getByOwner(@RequestParam int owner){
        System.out.println(eventService.getAllById(owner));
        return eventService.getAllById(1);
    }
}
