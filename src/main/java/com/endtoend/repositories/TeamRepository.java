package com.endtoend.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.endtoend.entities.TeamEntity;

@Repository
public class TeamRepository {
	private EntityManager em;

	@Transactional
	public TeamEntity save(TeamEntity team) {
		return em.merge(team);
	}
	
	@Transactional
	public List<TeamEntity> getAll(Integer limit, Integer page){
		//System.out.println(limit+" "+offset);
		Query q = em.createQuery("FROM TeamEntity");
		int offset = (page-1)*limit;
		q.setFirstResult(offset);
		q.setMaxResults(limit);
		return q.getResultList();
	}
	
	@Transactional
	public TeamEntity getById(Integer teamId) {
		return em.find(TeamEntity.class, teamId);
	}
	
	public EntityManager getEm() {
		return em;
	}    

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
}
