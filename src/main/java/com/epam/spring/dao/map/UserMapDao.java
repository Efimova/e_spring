package com.epam.spring.dao.map;

import com.epam.spring.dao.UserDao;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import com.epam.spring.exception.UserDaoException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class UserMapDao implements UserDao {
    private List<User> users = new ArrayList<User>();
    private static Integer idGenerator = 0;

    public void register(User user) {
        user.setId(++idGenerator);
        users.add(user);
    }

    public int remove(User userCurrent) throws UserDaoException {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userCurrent.getId())) {
                return users.remove(i).getId();
            }
        }
        throw new UserDaoException("Such user: " + userCurrent.toString() + " is not found");
    }

    public User getById(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User getUsersByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public List<Ticket> getBookedTickets() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        for (User user : users) {
            if (user.getTickets() != null && user.getTickets().size() > 0) {
                tickets.addAll(user.getTickets());
            }
        }
        return tickets;
    }
}
