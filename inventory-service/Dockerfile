FROM openjdk:21-jdk-oracle

COPY target/*.jar inventory-service.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "inventory-service.jar"]