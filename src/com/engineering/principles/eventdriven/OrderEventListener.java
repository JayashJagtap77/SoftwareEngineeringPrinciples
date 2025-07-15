package com.engineering.principles.eventdriven;

public class OrderEventListener implements EventListener {

    private final String listenerName;

    public OrderEventListener(String listenerName) {
        this.listenerName = listenerName;
    }

    public String getListenerName() {
        return listenerName;
    }

    @Override
    public void onEvent(Event event) {
        if (event instanceof OrderEvent) {
            OrderEvent orderEvent = (OrderEvent) event;
            System.out.println("Order Event Received: " + orderEvent.getName() + ", Data: " + orderEvent.getData());
        } else {
            System.out.println("Received an event that is not an OrderEvent.");
        }
    }
}
