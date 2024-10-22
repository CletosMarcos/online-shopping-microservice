FROM openjdk:21-jdk-oracle

COPY target/*.jar order-service.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "order-service.jar"]