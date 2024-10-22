# Spring Boot Shopping Microservice

This project is the result of the need to assimilate concepts learned in the **"Services, Microservices, and DevOps"** course. The application is simple, with no major validations as the goal with it is to grasp the concepts.

## Services Overview

- **Product Service**: Provides an API to create and view products.
- **Order Service**: Handles product orders in the application.
- **Inventory Service**: Checks product availability before order submission.
- **Notification Service**: Sends email notifications after successful orders.
- **Review Service**: Manages product reviews, allowing submission, editing, viewing, and deletion of reviews.
- **API Gateway**: Manages and routes requests to the appropriate services, providing security.

## Tech Stack

The technologies used in this project are:

- **Spring Boot**
- **Mongo DB**
- **MySQL**
- **Docker**
- **Docker Compose**
- **Kafka**
- **Keycloak**
- **API Gateway using Spring Cloud Gateway MVC**