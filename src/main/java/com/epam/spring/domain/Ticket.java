package com.epam.spring.domain;

import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class Ticket {
    private String barcode;
    private Date date;
    private User user;
    private Event event;
    private Auditorium auditorium;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equal(getBarcode(), ticket.getBarcode()) &&
                Objects.equal(getDate(), ticket.getDate()) &&
                Objects.equal(getUser(), ticket.getUser()) &&
                Objects.equal(getEvent(), ticket.getEvent()) &&
                Objects.equal(getAuditorium(), ticket.getAuditorium());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBarcode(), getDate(), getUser(), getEvent(), getAuditorium());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "barcode='" + barcode + '\'' +
                ", date=" + date +
                ", user=" + user +
                ", event=" + event +
                ", auditorium=" + auditorium +
                '}';
    }
}

