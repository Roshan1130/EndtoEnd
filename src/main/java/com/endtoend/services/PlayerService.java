package com.endtoend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoend.dtos.PlayerDto;
import com.endtoend.entities.PlayerEntity;
import com.endtoend.entities.TeamEntity;
import com.endtoend.repositories.PlayerRepository;
import com.endtoend.repositories.TeamRepository;

@Service
public class PlayerService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public void addPlayer(PlayerDto playerDto, Integer teamId) throws Exception{
		TeamEntity team = teamRepository.getById(teamId);
		
		if(team == null) {
			throw new Exception("Team doesn't exist + teamId");
		}else {
			PlayerEntity playerEntity = convertDtoToEntity(playerDto);
			playerEntity.setTeam(team);
			playerRepository.savePlayer(playerEntity);
			System.out.println("writing");
		}
	}
	
	private PlayerEntity convertDtoToEntity(PlayerDto playerDto) {
		PlayerEntity playerEntity = null;
		if(playerDto!=null) {
			playerEntity = new PlayerEntity();
			playerEntity.setName(playerDto.getName());
			playerEntity.setPosition(playerDto.getPosition());
			playerEntity.setAge(playerDto.getAge());
		}
		return playerEntity;
	}

}
