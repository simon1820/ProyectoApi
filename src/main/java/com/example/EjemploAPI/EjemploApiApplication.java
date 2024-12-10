package com.example.EjemploAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploApiApplication {

	static final Logger logger = LoggerFactory.getLogger(EjemploApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EjemploApiApplication.class, args);
		logger.info("Se levanta mi microservicio");
	}
}
