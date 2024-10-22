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

- **Spring Boot**
- **Mongo DB**
- **MySQL**
- **Docker**
- **Docker Compose**
- **Kafka**
- **Keycloak**
- **API Gateway using Spring Cloud Gateway MVC**

## Project Structure

Each service is organized in a separate directory and each directory contains the service code, Maven build configurations, and a `Dockerfile` for containerization. Additionally, there is a `docker-compose.yml` file that defines how the containers are started and how they interact with each other.

## How to Run the Project

Make sure to have the following installed on your machine:
- **Java 21**
- **Docker**

### Clone the repository:
      git clone https://github.com/CletosMarcos/online-shopping-microservice.git
      cd online-shopping-microservice
      
### Build and start the containers with Docker Compose:

      docker-compose up --build

*This will start all the application services.* 

Make sure to run:  
    ```
        mvn clean package -DskipTests
    ```
to build the services and generate the JAR files before building the `docker-compose.yml` file.

### Testing the Application:
The **API Gateway** will be accessible at `http://localhost:9000`.

You can interact with the services via REST endpoints, accessing the following URLs: \
        `http://localhost:8000/api/product` \
        `http://localhost:8081/api/order` \
        `http://localhost:8082/api/inventory` \
        `http://localhost:8084/api/review` 

For more details on the endpoints, refer to the **DOCUMENTATION** of each service by simply entering `http://localhost:<service_port>/swagger-ui.html` or \
`http://localhost:9000/swagger-ui.html` for the aggregated documentation provided in the API Gateway.
