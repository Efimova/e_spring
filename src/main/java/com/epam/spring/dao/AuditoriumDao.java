package com.epam.spring.dao;

import com.epam.spring.domain.Auditorium;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/18/2016.
 */
public interface AuditoriumDao {

    List<Auditorium> getAuditoriums();

    String[] getSeatsNumber(Auditorium auditorium);

    String[] getVipSeats(Auditorium auditorium);

}