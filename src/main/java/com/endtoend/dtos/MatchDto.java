package com.endtoend.dtos;


public class MatchDto {

	private Integer id;
	private String matchDate;
	private String location;
	private String homeTeam;
	private String awayTeam;
	
	
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
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
		return "MatchDto [id=" + id + ", matchDate=" + matchDate + ", location=" + location + ", homeTeam=" + homeTeam
				+ ", awayTeam=" + awayTeam + "]";
	}
	
	


}
