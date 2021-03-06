FROM openjdk:15
ARG JAR_FILE=target/*.jar
EXPOSE 8084
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]