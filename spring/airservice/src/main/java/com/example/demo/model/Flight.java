package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	private String airlineName;
	
	private String fromCity;
	
	private String toCity;
	
	@ManyToMany
	@JoinTable(name="passenger_flight",
	joinColumns = @JoinColumn(name="flight_id"),
	inverseJoinColumns = @JoinColumn(name="passenger_id"))
	private Set<Passenger> passenger = new HashSet<>();

	public Flight(String airlineName, String from, String to, Set<Passenger> passenger) {
		super();
		this.airlineName = airlineName;
		this.fromCity = from;
		this.toCity = to;
		this.passenger = passenger;
	}

	public Flight(String airlineName, String from, String to) {
		super();
		this.airlineName = airlineName;
		this.fromCity = from;
		this.toCity = to;
	}

	public Flight() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFrom() {
		return fromCity;
	}

	public void setFrom(String from) {
		this.fromCity = from;
	}

	public String getTo() {
		return toCity;
	}

	public void setTo(String to) {
		this.toCity = to;
	}

	public Set<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(Set<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
}
