package com.endtoend.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoend.entities.MatchEntity;

@Repository
@Transactional
public class MatchRepository {

	private EntityManager em;

	public void saveMatch( MatchEntity match) {
		System.out.println(match.toString());
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
