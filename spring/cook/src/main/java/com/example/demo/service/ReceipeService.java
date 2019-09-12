package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Receipe;

public interface ReceipeService {
	
	public List<Receipe> findAll();
	
	public Receipe findById(Long id);
	
	public void save(Receipe receipe);
	
	public void deleteById(Long id);
}
