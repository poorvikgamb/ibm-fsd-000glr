package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bootstrap.ReceipeRepository;
import com.example.demo.model.Receipe;

@Service
public class ReceipeServiceImp implements ReceipeService{

	@Autowired
	private ReceipeRepository receipeRepository;
	
	public ReceipeServiceImp(ReceipeRepository receipeRepository) {
		super();
		this.receipeRepository = receipeRepository;
	}

	@Override
	public List<Receipe> findAll() {
		// TODO Auto-generated method stub
		return (List<Receipe>) receipeRepository.findAll();
	}

	@Override
	public Receipe findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Receipe> result = receipeRepository.findById(id);
		
		Receipe receipe = new Receipe();
		
		if(result.isPresent())
		{
			receipe = result.get();
		}
		else
		{
			throw new RuntimeException("your receipe doesn't exist");
		}
		return receipe;
	}

	@Override
	public void save(Receipe receipe) {
		// TODO Auto-generated method stub
		receipeRepository.save(receipe);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		receipeRepository.deleteById(id);
	}


}
