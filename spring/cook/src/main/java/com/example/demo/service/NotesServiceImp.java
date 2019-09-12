package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bootstrap.NotesRepository;
import com.example.demo.model.Notes;
import com.example.demo.model.Receipe;

@Service
public class NotesServiceImp implements NotesService{

	@Autowired
	private NotesRepository notesRepository;

	public NotesServiceImp(NotesRepository notesRepository) {
		super();
		this.notesRepository = notesRepository;
	}

	@Override
	public List<Notes> findAll() {
		// TODO Auto-generated method stub
		return (List<Notes>) notesRepository.findAll();
	}

	@Override
	public Notes findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Notes> result = notesRepository.findById(id);
		
		Notes notes = new  Notes();
		
		if(result.isPresent())
		{
			notes = result.get();
		}
		else
		{
			throw new RuntimeException("cannot find notes");
		}
		return notes;
	}

	@Override
	public void save(Notes notes) {
		// TODO Auto-generated method stub
		notesRepository.save(notes);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		notesRepository.deleteById(id);
	}
	
	


}
