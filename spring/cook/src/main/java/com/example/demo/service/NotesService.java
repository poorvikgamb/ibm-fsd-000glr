package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Notes;

public interface NotesService {
	
public List<Notes> findAll();
	
	public Notes findById(Long id);
	
	public void save(Notes notes);
	
	public void deleteById(Long id);

}
