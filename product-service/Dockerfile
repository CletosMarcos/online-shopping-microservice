FROM openjdk:21-jdk-oracle

COPY target/*.jar product-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "product-service.jar"]