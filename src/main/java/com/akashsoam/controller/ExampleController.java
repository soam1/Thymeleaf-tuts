package com.akashsoam.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class ExampleController {

	@GetMapping("/example")
	public String example() {
		System.out.println("Hello from ExampleController");
		return "example";
	}
}
