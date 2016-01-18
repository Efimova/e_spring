package com.epam.spring.dao;

import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import com.epam.spring.exception.UserDaoException;

import java.util.List;


/**
 * Created by Anna_Efimova on 1/14/2016.
 */
public interface UserDao {

    void register(User user);

    int remove(User user) throws UserDaoException;

    User getById(Integer id);

    User getUserByEmail(String email);

    User getUsersByName(String name);

    List<Ticket> getBookedTickets();
}
