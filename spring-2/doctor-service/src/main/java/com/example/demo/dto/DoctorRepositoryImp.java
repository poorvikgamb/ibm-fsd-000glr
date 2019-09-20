package com.example.demo.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class DoctorRepositoryImp {
	
	@Autowired
	private DoctorRepository doctorRepository;

	public DoctorRepositoryImp(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	
	@HystrixCommand(fallbackMethod = "commonSpecialityDoctor")
	public Doctor getDoctorBySpeciality(String Speciality)
	{
		Doctor d1 = null;
		List<Doctor> doctors = doctorRepository.findAll();
		for(Doctor d:doctors)
		{
			if(d.getSpeciality().equals(Speciality))
			{
			  d=d1;
			}
		}
		return d1;
	}
	
	public Doctor commonSpecialityDoctor()
	{
		return getDoctorBySpeciality("general physician");	
	}
	
	public void createDoctor(String name,String speciality)
	{
		doctorRepository.save(new Doctor(name, speciality));
	}

}
