package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerServiceClient playerServiceClient;
	
	@Autowired
	private PlayerService playerService;

	@GetMapping("/fetchPlayers")
	public ResponseEntity<?> fetchPlayers()
	{
		return ResponseEntity.ok(playerService.getAllPlayers());
	}
}
