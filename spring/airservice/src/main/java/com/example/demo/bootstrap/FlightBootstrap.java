package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Flight;
import com.example.demo.model.Passenger;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;

@Component
public class FlightBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;
	
	
	public FlightBootstrap(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Flight flight = new Flight();
		flight.setAirlineName("vistara");
		flight.setFrom("bangalore");
		flight.setTo("Mumbai");
		
		
		Passenger passenger = new Passenger();
		passenger.setFirstName("john");
		passenger.setLastName("smith");
		passenger.setEmail("johnp@gmail.com");
		
		
		flightRepository.save(flight);
	}

	
}
