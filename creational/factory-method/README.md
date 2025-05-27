# Factory Method Pattern – Java & Spring Boot Example

This project demonstrates the **Factory Method** design pattern using Java and Spring Boot. The Factory Method pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

---

## 🧱 Pattern Definition

> "Define an interface for creating an object, but let subclasses decide which class to instantiate."  
> — *Design Patterns: Elements of Reusable Object-Oriented Software*

In this example, we implement a notification system that supports multiple types (Email, SMS, Push). The notification creation logic is abstracted through a static factory method.

---

## 📦 Technologies Used

- Java 21
- Spring Boot 3
- Maven
- Docker & Docker Compose

---

## 🧩 Structure

```bash
src/
└── main/
    └── java/com/example/factorymethod/
        ├── Notification.java              # Notification interface
        ├── EmailNotification.java         # Concrete Email implementation
        ├── SmsNotification.java           # Concrete SMS implementation
        ├── PushNotification.java          # Concrete Push implementation
        ├── NotificationType.java          # Enum with available types
        ├── NotificationFactory.java       # Factory class (factory method)
        ├── NotificationService.java       # Spring service using the factory
        └── FactoryMethodApplication.java  # Main Spring Boot class
```

---

## 🚀 Running the Application

### ▶️ Using Maven (Local Run)

```bash
mvn clean spring-boot:run
```

### 🐳 Using Docker

Build and run the container with:

```bash
docker-compose up --build
```

You will see output like:

```text
Sending EMAIL with message: Welcome!
Sending SMS with message: Your code is 1234.
Sending PUSH with message: You have a new message.
```

---

## 📚 Pattern Insight

The Factory Method pattern:

- **Encapsulates object creation logic**
- **Improves code maintainability and scalability**
- **Promotes Open/Closed Principle** (open to extension, closed to modification)

---

## 📁 Project Root

This is part of the `design-patterns-java-spring` repository, inside the `creational/factory-method` folder.

---
