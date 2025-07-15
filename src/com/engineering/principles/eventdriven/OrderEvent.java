package com.engineering.principles.eventdriven;

public class OrderEvent implements Event {
    private String name;
    private Object data;

    public OrderEvent(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Object getData() {
        return data;
    }
}
