package com.ustspring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Greetings from Spring Boot!";
	}

}