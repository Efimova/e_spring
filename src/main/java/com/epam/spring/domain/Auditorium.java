package com.epam.spring.domain;

import com.google.common.base.Objects;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component

public class Auditorium {

    private String audName;
    private String[] seats;
    private String[] vipSeats;

    public void setSeats(String[] seats) {
        this.seats = seats;
    }

    public void setAudName(String audName) {
        this.audName = audName;
    }

    public String getAudName() {
        return audName;
    }

    public String[] getSeats() {
        return seats;
    }


    public void setVipSeats(String[] vipSeats) {
        this.vipSeats = vipSeats;
    }

    public String[] getVipSeats() {
        return vipSeats;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "audName='" + audName + '\'' +
                ", seats=" + Arrays.toString(seats) +
                ", vipSeats=" + Arrays.toString(vipSeats) +
                '}';
    }
}
