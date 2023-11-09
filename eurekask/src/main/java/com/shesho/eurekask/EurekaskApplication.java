package com.shesho.eurekask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaskApplication.class, args);
		System.out.println("Eureka Server Started");
	}

}
