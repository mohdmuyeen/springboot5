package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ClientService {

	@Autowired
	RestTemplate rt;

	@HystrixCommand(fallbackMethod = "handledFailure")
	public ResponseEntity getEmployee(int empId) {
		return rt.getForEntity("http://boot-app1/app/emp?id=" + empId, String.class);

	}

	public ResponseEntity handledFailure(int emptId) {
		return ResponseEntity.ok("Service Now Unavailable, Try later");
	}
}
