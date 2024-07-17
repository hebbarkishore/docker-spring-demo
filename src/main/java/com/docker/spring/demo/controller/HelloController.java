package com.docker.spring.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloController {
	
	@GetMapping("/get/{name}")
	public ResponseEntity<String> getMessage(@PathVariable String name) {
		return new ResponseEntity<>("Welcome :"+name, HttpStatus.OK);
	}

}
