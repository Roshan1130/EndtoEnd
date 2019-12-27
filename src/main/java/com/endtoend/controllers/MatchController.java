package com.endtoend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend.dtos.MatchDto;
import com.endtoend.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {
	
	@Autowired
	private MatchService ms;
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public void saveMatch(@RequestBody MatchDto match) {
		System.out.println(match.toString());
	ms.setMatch(match);
	}
	
	

}
