package com.endtoend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend.dtos.PlayerDto;
import com.endtoend.services.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController{
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addPlayer(@RequestBody PlayerDto playerDto, 
			@RequestParam Integer teamId) throws Exception {
		
		System.out.println("inside controller");
		playerService.addPlayer(playerDto, teamId);
		
	}

}
