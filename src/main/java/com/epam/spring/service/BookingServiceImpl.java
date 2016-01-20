package com.epam.spring.service;

import com.epam.spring.dao.BookTicketDao;
import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookTicketDao bookTicketDao;

    public Integer getTicketPrice(Event event, Date date, Date time, Integer seat, User user) {
        return bookTicketDao.getTicketPrice(event, date, time, seat, user);
    }

    public Ticket bookTicket(User user, Ticket ticket) {
        return bookTicketDao.bookTicket(user, ticket);
    }

    public List<Ticket> getTicketsForEvent(Event event, Date date) {
        return bookTicketDao.getTicketsForEvent(event,date);
    }
}
