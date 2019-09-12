package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Receipe;
import com.example.demo.service.ReceipeService;


@Controller
@RequestMapping("/receipe")
public class ReceipeController {
	
	private ReceipeService receipeService;
	
	public ReceipeController(ReceipeService receipeService) {
		super();
		this.receipeService = receipeService;
	}

	@GetMapping("/list")
	public String listReceipe(Model model)
	{
		List<Receipe> receipe = receipeService.findAll();
		model.addAttribute("receipes", receipe);
		return "receipe/listOfreceipe";
	}
	@GetMapping("/formForReceipe")
	public String formForReceipe(@RequestParam("receipeId") Long receipeId,Model model)
	{
		Receipe receipe = receipeService.findById(receipeId);
		model.addAttribute("receipes",receipe );
		return "receipe/receipeForm";
	}
	@PostMapping("/save")
	public String saveReceipe(@ModelAttribute("receipes") Receipe receipe)
	{
		receipeService.save(receipe);
		return "redirect:/receipe/list";
	}
	@PostMapping("/delete")
	public String delete(@RequestParam("receipeId")Long receipeId)
	{
		receipeService.deleteById(receipeId);
		return "redirect:/receipe/list";
	}
}
