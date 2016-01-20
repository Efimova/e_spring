package com.epam.spring.runner;

import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import com.epam.spring.domain.Ticket;
import com.epam.spring.domain.User;
import com.epam.spring.helper.Rate;
import com.epam.spring.service.*;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component("main")
public class Main {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    private AuditoriumService auditoriumService;

    @Autowired
    private BookingService bookingService;

    @Autowired
    private EventService eventService;

//    @Autowired
//    private DiscountService discountService;


    public UserService getUserService() {
        return userService;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-bean.xml");

        Main main = (Main) context.getBean("main");
        //Create Users
        User user = context.getBean(User.class);
        user.setName("Anna");
        user.setEmail("annaefimova90@gmail.com");
        main.getUserService().register(user);

        //Create Events

        main.eventService.create("JavaDay", getDate(2016, 10, 21), getTime(12, 12), Rate.HIGH, 100);
        Event eventJava = main.eventService.getByName("JavaDay");
//        Event eventJS = context.getBean(Event.class);
//        main.eventService.create(eventJS);
//
//        Event eventWS = context.getBean(Event.class);
//        main.eventService.create(eventWS);

        //Create tickets java event
        Ticket ticketJava1 = context.getBean(Ticket.class);
        Ticket ticketJava2 = context.getBean(Ticket.class);
        Ticket ticketJava3 = context.getBean(Ticket.class);
        Ticket ticketJava4 = context.getBean(Ticket.class);
        Ticket ticketJava5 = context.getBean(Ticket.class);

        List<Ticket> ticketsJava = Arrays.asList(ticketJava1, ticketJava2, ticketJava3, ticketJava4, ticketJava5);

        //Create tickets JS event
        Ticket ticketJS1 = context.getBean(Ticket.class);
        Ticket ticketJS2 = context.getBean(Ticket.class);
        Ticket ticketJS3 = context.getBean(Ticket.class);
        Ticket ticketJS4 = context.getBean(Ticket.class);
        Ticket ticketJS5 = context.getBean(Ticket.class);

        List<Ticket> ticketsJS = Arrays.asList(ticketJS1, ticketJS2, ticketJS3, ticketJS4, ticketJS5);

        //Create tickets WS event
        Ticket ticketWS1 = context.getBean(Ticket.class);
        Ticket ticketWS2 = context.getBean(Ticket.class);
        Ticket ticketWS3 = context.getBean(Ticket.class);
        Ticket ticketWS4 = context.getBean(Ticket.class);
        Ticket ticketWS5 = context.getBean(Ticket.class);

        List<Ticket> ticketsWS = Arrays.asList(ticketWS1, ticketWS2, ticketWS3, ticketWS4, ticketWS5);

//        eventJava.setTickets(ticketsJava);
//        eventJS.setTickets(ticketsJS);
//        eventWS.setTickets(ticketsWS);

        //Create auditorium
        //  Auditorium auditorium = context.getBean(Auditorium.class);
        Auditorium auditorium = main.auditoriumService.getAuditoriums().get(0);
        main.eventService.assignAuditorium(eventJava,auditorium, eventJava.getDate() );

        main.bookingService.bookTicket(user, ticketJava1);

        System.out.println(Joiner.on(",").join(main.auditoriumService.getAuditoriums()));
        System.out.println(main.auditoriumService.getSeatsNumber(auditorium));

    }

    private static String getTime(int i, int i2) {
        return Joiner.on(":").join(new Integer[]{i, i2});
    }

    private static String getDate(int i, int i1, int i2) {

        return Joiner.on("").join(new Integer[]{i, i1, i2});
    }
}
