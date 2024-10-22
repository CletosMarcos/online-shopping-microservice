FROM openjdk:21-jdk-oracle

COPY target/*.jar review-service.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "review-service.jar"]