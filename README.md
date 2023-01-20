# mfe-rest-api 
## Spring Boot API for micro frontend examples (mfe)

This is a REST API for my mfe examples.

Download, build and run, and test with:

http://localhost:8080/hello

Lets add Spring Web, Spring Boot DevTools, 

## Adding MySQL Dependencies
Spring Data JPA, MySQL Driver.

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.32</version>
    </dependency>


## Configure MySQL Using Spring Boot Properties
CREATE DATABASE people_management_system

CREATE USER ‘local_user’@’localhost’ IDENTIFIED BY ‘password’;

SELECT * FROM mysql.user;

webApp
sampleMFE-pass@21


## Create JPA Entity
To save data in the database using the Spring JPA, we need to create an entity model. Let’s create a User entity which will store the data in the database

Look for the entity model

## Create User Repository
This is an interface and we extending the JpaRepository. Spring will automatically create a bean for this entry 
(bean name as userRepository) and provide implementations for the CURD operations.The next step is to create a simple 
spring mvc controller and call the userRepositry to save information in the database.

## User Controller