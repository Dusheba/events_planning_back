package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category")
    private EventCategory category;
    private String title;
    private String description;
    private String address;
    private double budget;
    private Date startTime;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Client owner;

}
