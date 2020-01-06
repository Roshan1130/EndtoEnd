package com.endtoend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoend.dtos.PlayerDto;
import com.endtoend.dtos.TeamDto;
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
	
	private TeamService ts;

	public void addPlayer(PlayerDto playerDto, Integer teamId) throws Exception {
		TeamEntity team = teamRepository.getById(teamId);

		if (team == null) {
			throw new Exception("Team doesn't exist + teamId");
		} else {
			PlayerEntity playerEntity = convertDtoToEntity(playerDto);
			playerEntity.setTeam(team);
			playerRepository.savePlayer(playerEntity);
			System.out.println("writing");
		}
	}

	public PlayerDto getPlayers(Integer teamId) {

		TeamEntity team = teamRepository.getById(teamId);
		
		List<PlayerDto> returnList = new ArrayList<PlayerDto>();
		TeamEntity team1 = teams.get(0); // we get only one team
		
		TeamDto td = ts.convert(team);
		
		
		for (PlayerEntity player : players) {
			returnList.add(convertEntityToDto(player));
		}
		return PlayerDto;

	}
	
	private PlayerDto convertEntityToDto(PlayerEntity pl) {
		PlayerDto pd =null;
		if(pl!=null) {
			pd= new PlayerDto();
			pd.setId(pl.getId());
			pd.setName(pl.getName());
			pd.setPosition(pl.getPosition());
			pd.setAge(pl.getAge());
		}
		
		return pd;
	}

	private PlayerEntity convertDtoToEntity(PlayerDto playerDto) {
		PlayerEntity playerEntity = null;
		if (playerDto != null) {
			playerEntity = new PlayerEntity();
			playerEntity.setName(playerDto.getName());
			playerEntity.setPosition(playerDto.getPosition());
			playerEntity.setAge(playerDto.getAge());
		}
		return playerEntity;
	}

}
