package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ingredient;

@Service
public class IngredientServiceImp implements IngredientService{
	

	private IngredientService ingredientService;
	
	public IngredientServiceImp(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}

	@Override
	public List<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return ingredientService.findAll();
	}

	@Override
	public void save(Ingredient ingredient) {
		// TODO Auto-generated method stub
		ingredientService.save(ingredient);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ingredientService.deleteById(id);
	}

	@Override
	public Ingredient findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
