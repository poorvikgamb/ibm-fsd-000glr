package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DoctorRepository;
import com.example.demo.model.Doctor;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@PostMapping("/newDoc")
	public String newDoctor(@RequestBody Doctor doctor)
	{
		doctorRepository.save(doctor);
		return "doctor added";
	}
	
	@PostMapping("getDoc/{speciality}")
	public Doctor getDoctor(@PathVariable String speciality)
	{
		return doctorRepository.getDoctorBySpeciality(speciality);
	}

}
