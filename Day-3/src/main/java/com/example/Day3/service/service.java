package com.example.Day3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day3.model.student;
import com.example.Day3.repository.repository;
@Service
public class service {
	@Autowired
	public repository repo;

	public student postdata(student st) {
		// TODO Auto-generated method stub
		return repo.save(st);
	}

}
