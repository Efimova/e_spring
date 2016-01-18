package com.epam.spring.service;

import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class BookingServiceImpl implements BookingService {
    public Integer getTicketPrice(Event event, Date date, Date time, Integer seats, User user) {
        return null;
    }

    public Ticket bookTicket(User user, Ticket ticket) {
        return null;
    }

    public List<Ticket> getTicketsForEvent(Event event, Date date) {
        return null;
    }
}
