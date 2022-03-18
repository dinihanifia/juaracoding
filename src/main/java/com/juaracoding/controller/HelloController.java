package com.juaracoding.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping("mantap/")
	private String helloWorld() {
		return "Hello World! Good Night!";
		
	}
	@DeleteMapping("mantap1/")
	private String helloWorld1() {
		return "Hello World! Good Morning!";
		
	}
}
