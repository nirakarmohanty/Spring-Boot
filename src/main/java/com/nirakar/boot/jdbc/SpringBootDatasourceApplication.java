package com.nirakar.boot.jdbc;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDatasourceApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDatasourceApplication.class, args);

		DatabaseOperations databaseOperations = (DatabaseOperations) context.getBean("databaseInit");

		databaseOperations.queryStudent();

		databaseOperations.insertStudent(new Student(100, "David", 45));

		System.out.print("After insert, ");
		databaseOperations.queryStudent();
	}
}