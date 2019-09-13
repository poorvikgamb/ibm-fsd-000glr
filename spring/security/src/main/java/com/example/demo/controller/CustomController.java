package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("/addLeague")
	public String addLeague() {
		return "addLeague";
	}
	
	@GetMapping("/viewLeague")
	public String viewLeague() {
		return "viewLeague";
	}
}
