package com.example.design.patterns.factory_method;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(NotificationType type, String message) {
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}