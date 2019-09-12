package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Receipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long receipeId;
	
	private int cookTime;
	
	private String description;
	
	private int difficulty;
	
	private int prepTime;
	
	@OneToOne
	private Notes notesId;
	
	@OneToOne
	private Ingredient ingredientId;

	public Long getReceipeId() {
		return receipeId;
	}

	public void setReceipeId(Long receipeId) {
		this.receipeId = receipeId;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}

	public Notes getNotesId() {
		return notesId;
	}

	public void setNotesId(Notes notesId) {
		this.notesId = notesId;
	}

	public Ingredient getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Ingredient ingredientId) {
		this.ingredientId = ingredientId;
	}
	
	
}
