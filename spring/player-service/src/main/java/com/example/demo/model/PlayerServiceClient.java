package com.example.demo.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "player-service")
public interface PlayerServiceClient {
	
	@RequestMapping(value="/players",method = RequestMethod.GET)
	public List<Player> getAllPlayers();
	
	@RequestMapping(value="/player/{id}")
	public Player getPlayer(@PathVariable("id") int id);
}
