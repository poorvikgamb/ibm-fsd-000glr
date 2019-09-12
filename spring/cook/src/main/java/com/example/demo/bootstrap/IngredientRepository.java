package com.example.demo.bootstrap;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
	

}
