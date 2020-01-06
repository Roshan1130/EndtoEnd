package com.endtoend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend.dtos.MatchEventsDto;
import com.endtoend.repositories.MatchEventsRepository;
import com.endtoend.services.MatchEventsService;

/*
create table match_events(
id int auto_increment not null,
event_id int,
description varchar (50),
primary key (id)
);*/

@RestController
@RequestMapping("/events")
public class MatchEventController {
	
	@Autowired
	private MatchEventsService mer;
	
	@RequestMapping(value ="", method = RequestMethod.POST)
	public void InsertMatchEvent(@RequestBody MatchEventsDto dto) {
		mer.InsertEvent(dto);
	}
	
	
}

