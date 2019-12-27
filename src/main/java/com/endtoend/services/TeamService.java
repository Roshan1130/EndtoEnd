package com.endtoend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoend.dtos.TeamDto;
import com.endtoend.entities.TeamEntity;
import com.endtoend.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public TeamDto createTeam(TeamDto dto) {
		TeamEntity t = new TeamEntity();
		t.setName(dto.getName());
		t.setCountry(dto.getCountry());
		t.setManager(dto.getManager());
		TeamEntity te = teamRepository.save(t);
		return convert(te);
	}

	public List<TeamDto> getAll(Integer limit, Integer page) {
		List<TeamEntity> teams = teamRepository.getAll(limit,page);
		List<TeamDto> returnList = new ArrayList<TeamDto>();
		for (TeamEntity te : teams) {
			returnList.add(convert(te));
		}
		return returnList;
	}
	

	public TeamDto convert(TeamEntity te) {
		TeamDto td = null;
		if (te != null) {
			td = new TeamDto();
			td.setId(te.getId());
			td.setName(te.getName());
			td.setCountry(te.getCountry());
			td.setManager(te.getManager());
		}
		return td;
	}
	
	
	
	
}
