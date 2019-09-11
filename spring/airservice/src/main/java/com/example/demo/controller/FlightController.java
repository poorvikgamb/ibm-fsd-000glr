package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.FlightRepository;

@Controller
@RequestMapping("/api")
public class FlightController {
	
	private FlightRepository flightRepository;

	public FlightController(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}
	
	@RequestMapping("/flights")
	public String getAllFlights(Model theModel)
	{
		theModel.addAttribute("flights", flightRepository.findAll());
		return "flights";
	}

}
