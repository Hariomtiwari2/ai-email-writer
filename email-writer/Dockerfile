# Stage 1: Build the Spring Boot application
FROM eclipse-temurin:21-jdk-jammy AS build

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests


# Stage 2: Run the application
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY --from=build /app/target/email-writer-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
