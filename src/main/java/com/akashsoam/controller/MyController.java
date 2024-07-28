package com.akashsoam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class MyController {
	public String sayHello() {
		System.out.println("Hello from MyController");
		return "Hello";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("inside about handler");
		
		//putting data in model
		model.addAttribute("name", "Akash Soam");
		model.addAttribute("currentDate", new java.util.Date());
		return "about";
	}
	
	//handling iteration in thymeleaf
	@GetMapping("/example-loop")
	public String exampleLoop(Model model) {
		System.out.println("inside example-loop handler");

		java.util.List<String> names = List.of("Akash", "Soam", "Sohan", "Rohan");
		model.addAttribute("names", names);
		return "iterate";
	}
}
