package com.epam.spring.service;

import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import io.lamma.Dates;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class EventServiceImpl implements EventService {
    private List<Event> events = new ArrayList<Event>();

    public void create(Event event) {
        events.add(event);
    }

    public void remove(Event event) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).equals(event)) {
                events.remove(i);
            }
        }
    }

    public Event getByName(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public List<Event> getAll() {
        return events;
    }

    public List<Event> getForDateRange( Date from, Date to) {

        List<Event> eventsResult =  new ArrayList<Event>();


        for (Event event: events){

        }
        return null;
    }

    public List<Event> getNextEvents(Date to) {
        return null;
    }

    public void assignAuditorium(Event event, Auditorium auditorium, Date date) {

    }
}
