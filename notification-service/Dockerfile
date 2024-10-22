FROM openjdk:21-jdk-oracle

COPY target/*.jar notification-service.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "notification-service.jar"]