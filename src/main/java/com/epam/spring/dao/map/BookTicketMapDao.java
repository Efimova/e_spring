package com.epam.spring.dao.map;

import com.epam.spring.dao.BookTicketDao;
import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Anna_Efimova on 1/20/2016.
 */
public class BookTicketMapDao implements BookTicketDao {
   private Map<Event, List<Ticket>> eventListMap = new HashMap<Event, List<Ticket>>();

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
