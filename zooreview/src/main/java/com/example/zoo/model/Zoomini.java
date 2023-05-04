package com.example.zoo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="zoomini")
public class Zoomini {
	@Id
	private int zoid;
	private String food;
	private String healthissue;
	private String caretaker;
	private String weight;
	private String origin;
	private String lifespan;
	public int getZoid() {
		return zoid;
	}
	public void setZoid(int zoid) {
		this.zoid = zoid;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getHealthissue() {
		return healthissue;
	}
	public void setHealthissue(String healthissue) {
		this.healthissue = healthissue;
	}
	public String getCaretaker() {
		return caretaker;
	}
	public void setCaretaker(String caretaker) {
		this.caretaker = caretaker;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
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
	
	

}
