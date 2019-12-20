package com.endtoend.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoend.entities.PlayerEntity;

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
