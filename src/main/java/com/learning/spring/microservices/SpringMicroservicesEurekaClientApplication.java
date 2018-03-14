package com.learning.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringMicroservicesEurekaClientApplication {

	@Bean
	public RestTemplate restTemplate () {
		return new RestTemplate();
	}
	
	@RequestMapping ("/eurekaClient")
	public String message () {
		return "Hello Eureka Client";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesEurekaClientApplication.class, args);
	}
}
