package com.example.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieinfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieinfoserviceApplication.class, args);
	}

}
