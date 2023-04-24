package com.example.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Zooinfoo")
public class Zooinfo {
    @Id
	private int id;
	private String aniname;
	private String food;
	private String weight;
	private String no_of_animals;
	private String caretaker;
	private String origin;
	private String lifespan;
	private String healthissues;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAniname() {
		return aniname;
	}
	public void setAniname(String aniname) {
		this.aniname = aniname;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getNo_of_animals() {
		return no_of_animals;
	}
	public void setNo_of_animals(String no_of_animals) {
		this.no_of_animals = no_of_animals;
	}
	public String getCaretaker() {
		return caretaker;
	}
	public void setCaretaker(String caretaker) {
		this.caretaker = caretaker;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getLifespan() {
		return lifespan;
	}
	public void setLifespan(String lifespan) {
		this.lifespan = lifespan;
	}
	public String getHealthissues() {
		return healthissues;
	}
	public void setHealthissues(String healthissues) {
		this.healthissues = healthissues;
	}
	
}
