package com.endtoend.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend.dtos.TeamDto;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public void createTeam(@RequestBody TeamDto team) {
		System.out.println(team.toString());
	}

}
