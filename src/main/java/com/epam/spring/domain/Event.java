package com.epam.spring.domain;

import com.epam.spring.helper.Rate;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
public class Event {
    private String name;
    private String date;
    private String time;
    private List<Ticket> purchasedTickets;
    private Integer basePrice;
    private Rate rating;
    private Auditorium auditorium;

    public Event(String name, String date, String time, Integer price, Rate rate) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.rating = rate;
        this.basePrice = price;
    }

    public Event() {

    }

    public List<Ticket> getPurchasedTickets() {
        return purchasedTickets;
    }

    public void setPurchasedTickets(List<Ticket> purchasedTickets) {
        this.purchasedTickets = purchasedTickets;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getBasePrice() {
        return basePrice;
    }


    public void setName(String name) {
        this.name = name;
    }

//    public void setDate(Date date) {
//        this.date = date;
//    }


    public void setRating(Rate rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

//    public Date getDate() {
//        return date;
//    }


    public Rate getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equal(getName(), event.getName()) &&
//                Objects.equal(getDate(), event.getDate()) &&

                Objects.equal(getRating(), event.getRating());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName(), getRating());
    }
}
