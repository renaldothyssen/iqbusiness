FROM openjdk:8-jdk-alpine
ARG JAR_FILE=rabbitmq-producer-service.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]