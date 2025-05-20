# 🧠 Singleton Pattern Example with Spring Boot and Docker

This project demonstrates the **Singleton Design Pattern** implemented using **Spring Boot**, and fully containerized with **Docker** using a multi-stage build.

## 📚 About the Singleton Pattern

The **Singleton Pattern** ensures that a class has only one instance and provides a global access point to it. In Spring, singleton scope is the default for beans, making it straightforward to implement and manage.

In this example, we use a service to hold a simple configuration value that can be read and updated via REST endpoints — always using the same instance behind the scenes.

---

## 🚀 How to Run

### 🔧 Requirements

- Docker installed and running (Linux containers mode)
- Maven (only if you want to build locally)

### 🐳 Build & Run with Docker (Recommended)

Use the multi-stage Dockerfile — **no need to run Maven manually**.

```bash
docker-compose up --build
```

Access the API at: [http://localhost:8080/config](http://localhost:8080/config)

---

## 📂 Endpoints

| Method | Endpoint           | Description                       |
|--------|--------------------|-----------------------------------|
| GET    | `/config`          | Returns the current environment value |
| POST   | `/config?env=dev`  | Updates the environment value     |

---

## 🛠️ Project Structure

```
singleton/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── singleton/
        │       ├── SingletonApplication.java
        │       ├── controller/
        │       │   └── ConfigController.java
        │       └── service/
        │           └── AppConfigService.java
        └── resources/
            └── application.properties
```

---

## 🧰 Tech Stack

- Java 21
- Spring Boot
- Docker (multi-stage build)
- Maven

---

## ✅ Benefits of Multi-stage Docker Build

- Small final image (~120MB)
- No need to install Maven locally
- Clean separation between build and runtime layers

---

## 📜 License

This project is open-source and free to use for learning and demonstration purposes.

---

## 🤝 Contributing

Pull requests and issues are welcome. Feel free to fork and expand the project with other design patterns.