package com.chickenbrain.projectDreamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.chickenbrain.projectDreamer.repositories",
		"com.chickenbrain.projectDreamer.controllers",
		"com.chickenbrain.projectDreamer.models"
})

public class ProjectDreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDreamerApplication.class, args);
	}
}
