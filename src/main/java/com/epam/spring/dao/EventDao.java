package com.epam.spring.dao;

import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/15/2016.
 */
public interface EventDao {
    void create(Event event);

    void remove(Event event);

    Event getByName(String name);

    List<Event> getAll();

    List<Event> getForDateRange(Date from, Date to);

    List<Event> getNextEvents(Date to);
    void assignAuditorium(Event event, Auditorium auditorium, Date date);
}
