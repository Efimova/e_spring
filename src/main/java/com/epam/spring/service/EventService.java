package com.epam.spring.service;

import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import com.epam.spring.helper.Rate;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
public interface EventService {
    void create(String name, String date, String time, Rate rate, Integer price);

    void remove(Event event);

    Event getByName(String name);

    List<Event> getAll();

    List<Event> getForDateRange(Date from, Date to);

    List<Event> getNextEvents(Date to);

    void assignAuditorium(Event event, Auditorium auditorium, String date);
}
