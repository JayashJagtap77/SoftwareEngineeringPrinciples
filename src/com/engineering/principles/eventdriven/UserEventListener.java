package com.engineering.principles.eventdriven;

public class UserEventListener implements EventListener {

    private final String listenerName;

    public UserEventListener(String listenerName) {
        this.listenerName = listenerName;
    }
    public String getListenerName() {
        return listenerName;
    }

    @Override
    public void onEvent(Event event) {
        if (event instanceof UserEvent) {
            UserEvent userEvent = (UserEvent) event;
            System.out.println("User Event Received: " + userEvent.getName() + " with data: " + userEvent.getData());
        } else {
            System.out.println("Received an event that is not a UserEvent.");
        }
    }
}
