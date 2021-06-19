FROM openjdk:8-jre-slim-buster
VOLUME /app
COPY target/app.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar","./app.jar"]