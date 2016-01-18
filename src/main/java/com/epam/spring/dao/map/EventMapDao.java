package com.epam.spring.dao.map;

import com.epam.spring.dao.EventDao;
import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/15/2016.
 */
@Component
public class EventMapDao implements EventDao {
    public void create(Event event) {

    }

    public void remove(Event event) {

    }

    public Event getByName(String name) {
        return null;
    }

    public List<Event> getAll() {
        return null;
    }

    public List<Event> getForDateRange(Date from, Date to) {
        return null;
    }

    public List<Event> getNextEvents(Date to) {
        return null;
    }

    public void assignAuditorium(Event event, Auditorium auditorium, Date date) {

    }
}
