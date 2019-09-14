package com.babwitjava.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestService {

	@GetMapping(value = "/hello/{userName}")
	public String hello(@PathVariable(value = "userName") String userName) {
		return "hi.. hello " + userName + "!..";
	}

}
