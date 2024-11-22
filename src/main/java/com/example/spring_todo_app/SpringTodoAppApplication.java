package com.example.spring_todo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTodoAppApplication.class, args);

		System.out.println("Server is running.");
	}

}