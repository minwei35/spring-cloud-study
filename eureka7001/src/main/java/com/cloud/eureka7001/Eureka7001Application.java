package com.cloud.eureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka7001Application.class, args);
	}

}
