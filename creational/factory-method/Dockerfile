FROM maven:3.9.4-eclipse-temurin-21-alpine as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/factory-method-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]