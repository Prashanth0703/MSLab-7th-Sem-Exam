package com.example.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieratingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieratingserviceApplication.class, args);
	}

}
