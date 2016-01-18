package com.epam.spring.service;

import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */

public interface UserService {

    void register(User user);

    void remove(User user);

    User getById(Integer id);

    User getUserByEmail(String email);

    User getUsersByName(String name);

    List<Ticket> getBookedTickets();

}
