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
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	@ManyToMany(mappedBy="passenger")
	private Set<Flight> flight = new HashSet<>();

	public Passenger(String firstName, String lastName, String email, Set<Flight> flight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.flight = flight;
	}

	public Passenger(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Passenger() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}
	
	
}
