package com.example.design.patterns.factory_method;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication implements CommandLineRunner {

	private final NotificationService notificationService;

	public FactoryMethodApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
	}

	@Override
	public void run(String... args) {
		notificationService.notifyUser(NotificationType.EMAIL, "Welcome!");
		notificationService.notifyUser(NotificationType.SMS, "Your code is 1234.");
		notificationService.notifyUser(NotificationType.PUSH, "You have a new message.");
	}
}