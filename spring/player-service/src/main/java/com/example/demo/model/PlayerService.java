package com.example.demo.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private PlayerServiceClient playerServiceClient;
	
	public Optional<Player> findByID(Long id)
	{
		return playerRepository.findById(id);
	}
	
	public void createPlayer(String name)
	{
		playerRepository.save(new Player(name));
	}
	
	public List<Player> getAllPlayers()
	{
		List<Player> player = playerRepository.findAll();
		return player;
	}

	public void deletePlayer(Long id)
	{
		playerRepository.deleteById(id);
	}
	
}
