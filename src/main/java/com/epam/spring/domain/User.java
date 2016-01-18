package com.epam.spring.domain;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component
@Scope(value = "prototype")
public class User {
    private Integer id;
    private String name;
    private String email;
    private List<Ticket> tickets;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equal(getId(), user.getId()) &&
                Objects.equal(getName(), user.getName()) &&
                Objects.equal(getEmail(), user.getEmail()) &&
                Objects.equal(getTickets(), user.getTickets());

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getName(), getEmail(), getTickets());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
