# создание image приложения-контролера
FROM openjdk:17
COPY target/cats-api-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080