FROM maven:3.9.9-eclipse-temurin-21-alpine AS builder

WORKDIR /project

COPY . .

RUN mvn clean package -pl creational/factory-method -am -DskipTests

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY --from=builder /project/creational/factory-method/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
