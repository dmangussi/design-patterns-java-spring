package com.example.design.patterns.factory_method;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL with message: " + message);
    }
}