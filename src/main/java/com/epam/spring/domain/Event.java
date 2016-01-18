package com.epam.spring.domain;

import com.epam.spring.helper.Rate;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;
import scala.Int;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class Event {
    private String name;
    private Date date;
    private List<Ticket> tickets;
    private Integer basePrice;
    private Rate rating;

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void setRating(Rate rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }


    public Rate getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equal(getName(), event.getName()) &&
                Objects.equal(getDate(), event.getDate()) &&

                Objects.equal(getRating(), event.getRating());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName(), getDate(), getRating());
    }
}
