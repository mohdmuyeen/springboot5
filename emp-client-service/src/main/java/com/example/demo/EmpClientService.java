package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/emp")
public class EmpClientService {

	@Autowired
	ClientService sv;

	@RequestMapping(path = "/get/{id}")
	public ResponseEntity fetch(@PathVariable("id") int empId) {
		ResponseEntity<String> resp = sv.getEmployee(empId);
		return resp;

	}
}
