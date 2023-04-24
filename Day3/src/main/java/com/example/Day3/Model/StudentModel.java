package com.example.Day3.Model;

import jakarta.persistence.*;

@Entity
@Table(name="studentmodel")
public class StudentModel {
	
	@Id
	@Column(name="sid")
	private int sid;
	 private String sname;
	 private int rollnu;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollnu() {
		return rollnu;
	}
	public void setRollnu(int rollnu) {
		this.rollnu = rollnu;
	}
	 
	 

}
