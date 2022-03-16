package com.example.demo.servise;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository repository;

    public List<Event> getAll() {
        return (List<Event>) repository.findAll();
    }

    public List<Event> getAllByOwnerId(int id) {
        System.out.println(repository.findAllByOwner(id));
        return repository.findAllByOwner(id);
    }

    public Event getById(int id){
        return repository.findEventById(id);
    }

    public List<Event> getByCat(int id){
        return repository.getByCat(id);
    }

    public void addEvent(Event event){
        SimpleDateFormat formatInput = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        SimpleDateFormat formatOutput = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = formatInput.format(event.getStartTime());
        try {
            Date date = formatOutput.parse(str);
            System.out.println(date);
            event.setStartTime(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        repository.save(event);
    }

    public List<Event> getByMonthAndCat(int month, int id){
        return repository.getByMonthAndCat(month, id);
    }

//    public void update(Event event){
//        repository.save(newEvent);
//    }
}
