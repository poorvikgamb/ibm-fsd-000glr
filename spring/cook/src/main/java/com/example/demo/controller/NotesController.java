package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bootstrap.NotesRepository;
import com.example.demo.model.Notes;
import com.example.demo.model.Receipe;
import com.example.demo.service.NotesService;

@Controller
@RequestMapping("note")
public class NotesController {
	
	private NotesService notesService;

	public NotesController(NotesService notesService) {
		super();
		this.notesService = notesService;
	}
	
	@GetMapping("/list")
	public String listNotes(Model model)
	{
		List<Notes> note = notesService.findAll();
		model.addAttribute("notes", note);
		return "note/listOfnotes";
	}
	
	@GetMapping("/formForNote")
	public String formForNote(@RequestParam("notesId") Long notesId, Model model)
	{
		Notes notes = notesService.findById(notesId);
		model.addAttribute("notes", notes);
		return "redirect:/note/list";		
	}
	@PostMapping("/save")
	public String saveReceipe(@ModelAttribute("notes") Notes notes)
	{
		notesService.save(notes);
		return "redirect:/note/list";
	}
	@PostMapping("/delete")
	public String delete(@RequestParam("notesId")Long notesId)
	{
		notesService.deleteById(notesId);
		return "redirect:/note/list";
	}
	

}
