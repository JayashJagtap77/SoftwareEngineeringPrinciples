package com.engineering.principles.eventdriven;

public class EventDrivenSystem {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();

        // Create listeners
        UserEventListener userEventListener = new UserEventListener("User Listener");
        OrderEventListener orderEventListener = new OrderEventListener("Order Listener");

        // Register listeners with the dispatcher
        dispatcher.addListener(userEventListener);
        dispatcher.addListener(orderEventListener);

        // Simulate events
        Event userEvent = new UserEvent("USER_CREATED", "Prince Babu");
        dispatcher.dispatchEvent(userEvent);

        System.out.println("\n--- Removing Listener B ---");
        dispatcher.removeListener(orderEventListener);

        Event event2 = new OrderEvent("ORDER_PLACED", "Order #12345");
        dispatcher.dispatchEvent(event2);
    }
}
