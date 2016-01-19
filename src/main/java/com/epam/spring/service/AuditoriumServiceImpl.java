package com.epam.spring.service;

import com.epam.spring.dao.AuditoriumDao;
import com.epam.spring.domain.Auditorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Anna_Efimova on 1/14/2016.
 */
@Component("auditoriumService")
public class AuditoriumServiceImpl implements AuditoriumService {
    @Autowired
    private AuditoriumDao auditoriumDao;

    public List<Auditorium> getAuditoriums() {
        return auditoriumDao.getAuditoriums();
    }

    public String[] getSeatsNumber(Auditorium auditorium) {
        return auditoriumDao.getSeatsNumber(auditorium);
    }

    public String[] getVipSeats(Auditorium auditorium) {
        return auditoriumDao.getVipSeats(auditorium);
    }
}
