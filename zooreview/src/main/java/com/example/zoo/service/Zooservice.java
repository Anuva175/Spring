package com.example.zoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoo.Zrepository.Queryrepository;
import com.example.zoo.Zrepository.Zoomainrepository;
import com.example.zoo.model.Querytesting;
import com.example.zoo.model.Zoomain;

@Service
public class Zooservice {
	
	@Autowired
	public Zoomainrepository mrepo;
	
	@Autowired
	public Queryrepository qrepo;

	public List<Zoomain> getdetall() {
		// TODO Auto-generated method stub
		return mrepo.findAll();
	}

	public Zoomain postin(Zoomain zo) {
		// TODO Auto-generated method stub
		return mrepo.save(zo);
	}

	public void delin(int id) {
		// TODO Auto-generated method stub
		mrepo.deleteById(id);
	}

	public Zoomain putin(Zoomain zo) {
		// TODO Auto-generated method stub
		return mrepo.saveAndFlush(zo);
	}

	public Querytesting addquery(Querytesting q) {
		// TODO Auto-generated method stub
		return qrepo.save(q);
	}

}
