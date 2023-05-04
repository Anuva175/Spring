package com.example.zoo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="zoomain")
public class Zoomain {
	
	@Id
	private int id;
	private String aniname;
	private String count;
	private String gender;
	private int age;
	private String arearequired;
	private String typeofanimal;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Zoomini> miniid;
	
	
	public List<Zoomini> getMiniid() {
		return miniid;
	}
	public void setMiniid(List<Zoomini> miniid) {
		this.miniid = miniid;
	}
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getArearequired() {
		return arearequired;
	}
	public void setArearequired(String arearequired) {
		this.arearequired = arearequired;
	}
	public String getTypeofanimal() {
		return typeofanimal;
	}
	public void setTypeofanimal(String typeofanimal) {
		this.typeofanimal = typeofanimal;
	}
	
	
	

}
