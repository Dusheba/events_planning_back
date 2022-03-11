package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "client_event")
@Data
public class ClientEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
