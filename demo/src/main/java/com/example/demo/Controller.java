package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {

		// Unused variable
		final String unused = "This is not used";

		// Null check
		if (name == null) {
			return "Name is missing!";
		}

		return "Hi " + name + ", Welcome to My world!";
	}

	// hardcoded password
	public boolean isAuthorized(String password) {
		if (password.equals("admin123")) {
			return true;
		}
		return false;
	}


}
