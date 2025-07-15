package com.engineering.principles.eventdriven;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {
    private final List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void dispatchEvent(Event event) {
        System.out.println("Dispatching event: " + event.getName());
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}
