package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.model.Loginmodel;

public interface Loginrepo extends JpaRepository<Loginmodel,Integer> {
	Loginmodel findByname(String name); 

}
