package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name)
	{
		return name+" ,Welcome to kalyug!";
		
	}

}
