package com.epam.spring.service;

import com.epam.spring.dao.EventDao;
import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.helper.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class EventServiceImpl implements EventService {
    private List<Event> events = new ArrayList<Event>();

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private EventDao eventDao;

    public void setAppContext(ApplicationContext appContext) {
        this.appContext = appContext;
    }

    public void create(String name, String date, String time, Rate rate, Integer price) {
        eventDao.create(new Event(name, date, time, price, rate));
    }

    public void remove(Event event) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).equals(event)) {
                events.remove(i);
            }
        }
    }

    public Event getByName(String name) {

        return eventDao.getByName(name);
    }

    public List<Event> getAll() {
        return events;
    }

    public List<Event> getForDateRange(Date from, Date to) {

        List<Event> eventsResult = new ArrayList<Event>();


        for (Event event : events) {

        }
        return null;
    }

    public List<Event> getNextEvents(Date to) {
        return null;
    }

    //TODO refactor this code
    public void assignAuditorium(Event event, Auditorium auditorium, String date) {
        event.setAuditorium(auditorium);
        List<Ticket> tickets = new ArrayList<Ticket>();
        AuditoriumServiceImpl auditoriumService = appContext.getBean(AuditoriumServiceImpl.class);
        String[] seats = auditoriumService.getSeatsNumber(auditorium);
        for (String seat : seats) {
            tickets.add(createTicketsForEvent(event, auditorium, date, seat));
        }
        event.setPurchasedTickets(tickets);
    }

    private Ticket createTicketsForEvent(Event event, Auditorium auditorium, String date, String seat) {
        Ticket ticket = appContext.getBean(Ticket.class);
        ticket.setAuditorium(auditorium);
        ticket.setDate(date);
        ticket.setBarcode(String.valueOf(Math.random()));
        ticket.setEvent(event);
        ticket.setSeat(seat);
        return ticket;
    }
}
