package com.example.demo.repository;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.bootstrap.IngredientRepository;
import com.example.demo.bootstrap.NotesRepository;
import com.example.demo.bootstrap.ReceipeRepository;
import com.example.demo.model.Receipe;

@Component
public class DevJpa implements ApplicationListener<ContextRefreshedEvent>{

	private ReceipeRepository receipeRepository;
	private IngredientRepository ingredientRepository;
	private NotesRepository notesRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Receipe receipe = new Receipe();
		receipe.setCookTime(10);
		receipe.setDescription("blah blah blah");
		receipe.setDifficulty(3);
		receipe.setPrepTime(5);
		
		receipeRepository.save(receipe);
	}

	
	
}
