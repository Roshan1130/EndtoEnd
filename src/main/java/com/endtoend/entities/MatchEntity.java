package com.endtoend.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class MatchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="matchDate")
	private String matchDate;
	
	@Column(name="location")
	private String location;
	
	@OneToOne
	@JoinColumn(name="away_team_id")
	private TeamEntity aTeam;
	
	@OneToOne
	@JoinColumn(name="home_team_id")
	private TeamEntity hTeam;
	
	public TeamEntity gethTeam() {
		return hTeam;
	}

	public void sethTeam(TeamEntity hTeam) {
		this.hTeam = hTeam;
	}

	public TeamEntity getaTeam() {
		return aTeam;
	}

	public void setaTeam(TeamEntity aTeam) {
		this.aTeam = aTeam;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MatchEntity [id=" + id + ", matchDate=" + matchDate + ", location=" + location ;
	}
	
	
	
}
