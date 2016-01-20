package com.epam.spring.dao;

import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/20/2016.
 */
public interface BookTicketDao {
    Integer getTicketPrice(Event event, Date date, Date time, Integer seats, User user);

    Ticket bookTicket(User user, Ticket ticket);

    List<Ticket> getTicketsForEvent(Event event, Date date);
}
