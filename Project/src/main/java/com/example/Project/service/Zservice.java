package com.example.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	public List<Zooinfo> sortDetails(String name) {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(name).descending());
	}

	public List<Zooinfo> page(int num, int size) {
		// TODO Auto-generated method stub
		Page<Zooinfo> p=repo.findAll(PageRequest.of(num, size));
		return p.getContent();
		
	}

	public List<Zooinfo> sortpage(int num, int size, String name) {
		Page<Zooinfo> p=repo.findAll(PageRequest.of(num, size, Sort.by(name).ascending()));
		return p.getContent();
	}

	
	}

	

	
	
