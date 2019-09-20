package com.example.demo.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{
	
	public Doctor getDoctorBySpeciality(String Speciality);

}
