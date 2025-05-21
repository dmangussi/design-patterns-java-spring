package com.example.design.patterns.factory_method;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH with message: " + message);
    }
}