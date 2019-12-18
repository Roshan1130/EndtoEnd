package com.endtoend.dtos;

import org.springframework.stereotype.Component;

@Component
public class TeamDto {
	
	private Integer id;
	private String name;
	private String country;
	private String manager;
	private String logo;
	
	//getters-setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "TeamDto [id=" + id + ", name=" + name + ", country=" + country + ", manager=" + manager + ", logo="
				+ logo + "]";
	}
	

}
