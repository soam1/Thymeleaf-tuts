package com.akashsoam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

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
}
