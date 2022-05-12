package com.microfocus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMicroserviceApplication.class, args);
		System.out.println("HelloWorld Microservice is started successfully");
	}

}
