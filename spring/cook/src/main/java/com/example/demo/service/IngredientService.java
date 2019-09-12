package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Receipe;

public interface IngredientService {
	
	public List<Ingredient> findAll();
	
	public Ingredient findById(Long id);
	
    public void save(Ingredient ingredient);
	
	public void deleteById(Long id);
	

}
