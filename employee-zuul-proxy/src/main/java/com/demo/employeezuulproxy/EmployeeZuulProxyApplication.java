package com.demo.employeezuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EmployeeZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeZuulProxyApplication.class, args);
	}
}
