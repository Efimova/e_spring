package com.epam.spring.service;

import com.epam.spring.dao.UserDao;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import com.epam.spring.exception.UserDaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    @Qualifier("userMapDao")
    private UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public void remove(User user) {
        try {
            userDao.remove(user);
        } catch (UserDaoException e) {
            logger.error(e.getMessage());
        }
    }

    public User getById(Integer id) {
        return null;
    }

    public User getUserByEmail(String email) {
        return null;
    }

    public User getUsersByName(String name) {
        return null;
    }

    public List<Ticket> getBookedTickets() {
        return null;
    }

}
