package com.example.Day1;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
 private int id;
 @JsonIgnore
 private String name;
 private int age;
public Student() {
	super();
}
public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
 
 
}
