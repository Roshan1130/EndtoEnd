package com.endtoend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend.dtos.TeamDto;
import com.endtoend.services.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public TeamDto createTeam(@RequestBody TeamDto teamDto) {
		return teamService.createTeam(teamDto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<TeamDto> getAll(@RequestParam(required=false) Integer limit, 
			@RequestParam(required=false) Integer page) {
		return teamService.getAll(limit,page);
	}
	
	
}
