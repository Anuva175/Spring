package com.example.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.Zooinfo;
import com.example.Project.repository.Repository;
@Service
public class Zservice {
	
	@Autowired
	public Repository repo;

	public Zooinfo savedetails(Zooinfo zo) {
		// TODO Auto-generated method stub
		return repo.save(zo);
	}

	public List<Zooinfo> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void deletebyid(int byid) {
		// TODO Auto-generated method stub
		repo.deleteById(byid);
	

	}

	public Zooinfo updatedetails(Zooinfo zo) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(zo);
	}
	}
