package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerTest {
	@Test
	public void testWelcome_withValidName() {
		Controller controller = new Controller();
		String response = controller.welcome("Shipra");
		assertTrue(response.contains("Shipra"));
	}

}