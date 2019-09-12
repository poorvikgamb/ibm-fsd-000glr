package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Ingredient;
import com.example.demo.service.IngredientService;
import com.example.demo.service.IngredientServiceImp;

@Controller
@RequestMapping("/ingredient")
public class IngredientController {
	
	private IngredientService ingredientService;

	public IngredientController(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}
	
	@GetMapping("/list")
	public String listIngredient(Model model)
	{
		List<Ingredient> ingredient = ingredientService.findAll();
		model.addAttribute("ingredients", ingredient);
		return "ingredient/listOfingredients";
	}
	@GetMapping("/formForIngredient")
	public String formForIngredient(@RequestParam("ingredientId") Long ingredientId,Model model)
	{
		Ingredient ingredient = ingredientService.findById(ingredientId);
		model.addAttribute("ingredients",ingredient );
		return "ingredient/ingredientForm";
	}
	@PostMapping("/save")
	public String saveIngredient(@ModelAttribute("ingredient") Ingredient ingredient)
	{
		ingredientService.save(ingredient);
		return "redirect:/ingredient/list";
	}
	@PostMapping("/delete")
	public String delete(@RequestParam("ingredientId")Long ingredientId)
	{
		ingredientService.deleteById(ingredientId);
		return "redirect:/receipe/list";
	}
}
