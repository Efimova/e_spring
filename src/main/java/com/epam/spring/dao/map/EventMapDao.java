package com.epam.spring.dao.map;

import com.epam.spring.dao.EventDao;
import com.epam.spring.domain.Auditorium;
import com.epam.spring.domain.Event;
import com.google.common.collect.Collections2;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/15/2016.
 */
@Component
public class EventMapDao implements EventDao {
    private List<Event> events = new ArrayList<Event>();

    public void create(Event event) {
        events.add(event);
    }

    public void remove(final Event event) {
        class EventClosure implements Closure {


            public void execute(Object o) {
                if (((Event) o).equals(event)) {
                    events.remove(o);
                }
            }
        }
        EventClosure eventClosure = new EventClosure();
        CollectionUtils.forAllDo(events, eventClosure);
    }

    public Event getByName(final String name) {
        class EventClosure implements Closure {
            Event event = null;

            public void execute(Object o) {
                if (((Event) o).getName().equals(name)) {
                    event = (Event) o;
                }
            }

            public Event getEvent() {
                return event;
            }
        }
        EventClosure eventClosure = new EventClosure();
        CollectionUtils.forAllDo(events, eventClosure);
        return eventClosure.getEvent();
    }

    public List<Event> getAll() {
        return null;
    }

    public List<Event> getForDateRange(Date from, Date to) {
        return null;
    }

    public List<Event> getNextEvents(Date to) {
        return null;
    }

    public void assignAuditorium(Event event, Auditorium auditorium, Date date) {

    }
}
