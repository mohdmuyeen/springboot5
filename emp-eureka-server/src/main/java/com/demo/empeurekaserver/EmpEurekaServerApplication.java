package com.demo.empeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmpEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpEurekaServerApplication.class, args);
	}
}
