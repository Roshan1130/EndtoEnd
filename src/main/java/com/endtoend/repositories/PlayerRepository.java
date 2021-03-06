package com.endtoend.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoend.entities.PlayerEntity;
import com.endtoend.entities.TeamEntity;

@Repository
@Transactional
public class PlayerRepository {

	private EntityManager em;
	
	public void savePlayer(PlayerEntity playerEntity) {
		em.persist(playerEntity);
	}
	
	
	
	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
}
