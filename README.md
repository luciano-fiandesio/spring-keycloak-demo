# Spring Boot 3.1 with Keycloak and OAuth2 Demo

This repository contains a simple Spring Boot application that demonstrates how to secure Thymeleaf pages using Keycloak as an Identity and Access Management service, and OAuth2 as an authorization framework.

## Project Overview

This application presents an example of how to configure Spring Boot 3.1 to use Keycloak for to handle user authentication and authorization. 
The application consists of three Thymeleaf pages which are secured using OAuth2 protocol. 
The Docker compose file starts a Keycloak 20.0.5 instance: a Keycloak realm with a user is 
automatically created when the instance starts.

## Prerequisites

- Java 17
- Docker + Docker compose

## Build and Run the Application
Navigate to the root directory of the project and use Maven to build the project:

```
./mvnw clean install
```

After a successful build, run the application:

```
./mvnw spring-boot:run
```

The application should be accessible at http://localhost:8080.

Note that the application uses the new `spring-boot-docker-compose` module, that automatically executes
the Docker compose file upon application start-up.

## Usage

Navigate to http://localhost:8080/protected in your web browser. You should be redirected to the Keycloak login page. 
Enter the following credentials:

- username: `demo1`
- password: `password`

Once authenticated, you will be redirected back to the application where you can access the protected Thymeleaf pages.

## User Logout

To log out, users can navigate to the `/logout` endpoint in the application (i.e., `http://localhost:8080/logout`). 
This will invalidate the user's session in the Spring Boot application and redirect them to the app home page.
