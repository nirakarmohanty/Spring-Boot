# Spring-Boot

This project is created to implement Spring Boot application 
Need to Implement RestFul web services


Spring Boot Actuator

Actuator is a very helpful library which provides runtime details of our application. To start with, we can find whether our App and all of its components (Like DB, Cache, MQ etc) are up or down. It also shows all the services available for an application. Additionally all properties, including server details, dump and many other details are easily available is your browser using Actuator.

In case you missed, here is the dependency details to be included in the pom.xml file.

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-actuator</artifactId>
	<version>1.3.3.RELEASE</version>
</dependency>

Url - http://localhost:8182/health