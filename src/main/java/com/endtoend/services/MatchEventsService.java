package com.endtoend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoend.dtos.MatchEventsDto;
import com.endtoend.entities.MatchEventEntities;
import com.endtoend.repositories.MatchEventsRepository;

@Service
public class MatchEventsService {

	@Autowired
	private MatchEventsRepository mer;
	
	public void InsertEvent(MatchEventsDto dto) {
		
		mer.saveMatch(convert(dto));
		
	}
	
	public MatchEventEntities convert(MatchEventsDto dto) {
		MatchEventEntities et = null;
		if(dto!=null) {
			et = new MatchEventEntities();
			et.setEventId(dto.getEventId());
			et.setDescription(dto.getDescription());
		}
		return et;
	}
}
