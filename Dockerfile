FROM openjdk:17-jdk-slim
# Instalar curl en la imagen basada en Debian/Ubuntu
RUN apt-get update && apt-get install -y curl

COPY target/flight2024-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]
