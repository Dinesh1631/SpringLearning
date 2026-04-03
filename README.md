# Spring Learning Projects

This repository contains a collection of Spring Framework learning projects, demonstrating various aspects of Spring development including MVC, Data JPA, JDBC, ORM, Security, and more.

## Prerequisites

- Java 17 or higher
- Maven 3.6+ or Gradle (for demo-1)
- MySQL database (for projects using JPA/JDBC)
- Tomcat 10.1 (for deploying WAR files)

## Projects

### Spring Boot Projects

These projects use Spring Boot for easier setup and can be run with `mvn spring-boot:run` or `./gradlew bootRun`.

- **DataJpa**: Demonstrates Spring Data JPA with MySQL integration.
- **DataJpaMapping**: Explores JPA entity mappings and relationships with Spring Boot.
- **demo-1**: A Gradle-based Spring Boot project with Data JDBC, JPA, HATEOAS, and Web starters.
- **springSecurityRest**: Spring Boot application with Spring Security, Data JPA, and RESTful APIs.

### Traditional Spring MVC Web Applications

These are WAR-packaged applications that need to be deployed to a servlet container like Tomcat.

- **intiBinder**: Spring MVC application focusing on @InitBinder usage.
- **IRIS_Cafe**: A cafe management web application built with Spring MVC.
- **MOM's_Cafe**: Another cafe-themed Spring MVC project.
- **MVC_BASICS**: Basic Spring MVC concepts and setup.
- **MVC_INTERMEDIATE**: Intermediate Spring MVC features including validation and JSTL.
- **MVC_SessionAttribute**: Demonstrates @SessionAttribute in Spring MVC.
- **spring-Love-Calculator**: A fun love calculator application using Spring MVC.
- **SpringSecurity**: Spring MVC with Spring Security integration.

### Manual Spring Projects

These projects use Spring without Boot, with manual dependency management.

- **springDataJpa**: Spring Data JPA setup with Hibernate and Jakarta Persistence.
- **springJDBC**: Spring JDBC template usage.
- **SpringORM**: Spring ORM with Hibernate.

## Running the Projects

### Spring Boot Projects
1. Navigate to the project directory.
2. Run `mvn spring-boot:run` (Maven) or `./gradlew bootRun` (Gradle).
3. Access the application at `http://localhost:8080`.

### Traditional Web Apps
1. Navigate to the project directory.
2. Run `mvn clean install` to build the WAR.
3. Deploy the generated WAR file to Tomcat.
4. Access the application via Tomcat's URL.

### Manual Spring Projects
1. Navigate to the project directory.
2. Run `mvn clean compile` to compile.
3. Run specific main classes or integrate as needed.

## Configuration

For projects using MySQL, update the database configuration in `application.properties` or equivalent files with your database credentials.

## Contributing

Feel free to explore, modify, and learn from these projects. Pull requests are welcome for improvements or additional examples.
