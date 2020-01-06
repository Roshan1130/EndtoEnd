package com.endtoend.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoend.entities.MatchEventEntities;


@Repository
@Transactional
public class MatchEventsRepository {
	private EntityManager em;

	public void saveMatch( MatchEventEntities match) {
		em.persist(match);
	}
	
	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	

}
