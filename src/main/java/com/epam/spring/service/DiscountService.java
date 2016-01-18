package com.epam.spring.service;

import com.epam.spring.domain.Event;
import com.epam.spring.domain.User;

import java.util.Date;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
public interface DiscountService {
    void getDiscount(User user, Event event, Date date);
}
