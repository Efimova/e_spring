package com.epam.spring.dao.map;

import com.epam.spring.dao.AuditoriumDao;
import com.epam.spring.domain.Auditorium;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by Anna_Efimova on 1/18/2016.
 */
@Component
public class AuditoriumMapDao implements AuditoriumDao {

    private List<Auditorium> auditoriums;

    public List<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(List<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    public String[] getSeatsNumber(final Auditorium auditorium) {
//        class SeatsClosure implements Closure {
//            Integer totalSum = 0;
//
//            public void execute(Object o) {
//                if (o != null && o instanceof Auditorium) {
//                    totalSum += ((Auditorium) o).getSeats().length;
//                }
//            }
//
//            public Integer getTotalSum() {
//                return totalSum;
//            }
//        }
        class SeatsClosure implements Closure {
            String[] totalSum;

            public void execute(Object o) {
                if (o != null && o.equals(auditorium)) {
                    totalSum = ((Auditorium) o).getSeats();
                }
            }

            public String[] getTotalSum() {
                return totalSum;
            }
        }
        SeatsClosure closure = new SeatsClosure();
        CollectionUtils.forAllDo(auditoriums, closure);
        return closure.getTotalSum();
    }

    public String[] getVipSeats(final Auditorium auditorium) {

        class VipSeatsClosure implements Closure {
            private String[] totalSum;

            public void execute(Object o) {
                if (o != null && o.equals(auditorium)) {
                    totalSum = ((Auditorium) o).getVipSeats();
                }
            }

            public String[] getTotalSum() {
                return totalSum;
            }
        }
        VipSeatsClosure vipSeatsClosure = new VipSeatsClosure();
        CollectionUtils.forAllDo(auditoriums, vipSeatsClosure);
        return vipSeatsClosure.getTotalSum();
    }


}
