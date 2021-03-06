package com.eureka.client.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApp1 {

	public static void main(String[] args) {
		
		SpringApplication.run(UserServiceApp1.class, args);
	}

}
