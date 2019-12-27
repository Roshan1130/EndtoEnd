package com.endtoend.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoend.dtos.MatchDto;
import com.endtoend.entities.MatchEntity;
import com.endtoend.entities.TeamEntity;
import com.endtoend.repositories.MatchRepository;
import com.endtoend.repositories.TeamRepository;

@Service
public class MatchService {
	
	@Autowired
	private TeamRepository tr; 
	
	@Autowired
	private MatchRepository mr;
	
	public void setMatch(MatchDto match) {
		System.out.println("inside set M");
		TeamEntity aTeam, hTeam;
		hTeam = tr.findTeamByTeamName(match.getHomeTeam());
		aTeam = tr.findTeamByTeamName(match.getAwayTeam());

		MatchEntity me = convertDtoToEntity(match);
		System.out.println("saving");
		me.setaTeam(aTeam);
		me.sethTeam(hTeam);
		mr.saveMatch(me);
	}
	
	private MatchEntity convertDtoToEntity(MatchDto match) {
		System.out.println("Converting");
		MatchEntity me = null;
				if (match!=null) {
					me = new MatchEntity();
					me.setMatchDate(match.getMatchDate());
					me.setLocation(match.getLocation());
										
				}
			return me;
	}
	
}
