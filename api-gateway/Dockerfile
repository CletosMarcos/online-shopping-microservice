FROM openjdk:21-jdk-oracle

COPY target/*.jar api-gateway.jar

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "api-gateway.jar"]