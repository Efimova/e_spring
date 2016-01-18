package com.epam.spring.service;

import com.epam.spring.domain.Auditorium;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
public interface AuditoriumService {

    List<Auditorium> getAuditoriums();
    Integer getSeatsNumber();
    Integer getVipSeats();

}
