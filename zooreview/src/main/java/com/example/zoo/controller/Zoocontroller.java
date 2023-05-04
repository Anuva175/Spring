package com.example.zoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoo.Zrepository.Queryrepository;
import com.example.zoo.model.Querytesting;
import com.example.zoo.model.Zoomain;
import com.example.zoo.service.Zooservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Zoocontroller {
	@Autowired
	public Zooservice serve;
	
	@Autowired
	public Queryrepository qrepo;
	
	@Tag(name="TO GET ALL DETAILS IN ZOO",description = "DETAILS IN MAIN TABLE")
	@GetMapping("/getall")
	public List<Zoomain> getdetall()
	{
		return serve.getdetall();
	}
	@Tag(name="POSTING VALUES IN ZOO",description = "TO POST VALUES IN ZOO")
	@PostMapping("/posting")
	public Zoomain postin(@RequestBody Zoomain zo)
	{
		return serve.postin(zo);
	}
	@Tag(name="TO DELETE BY USING ID IN ZOO",description = "FOR DELETING IN ZOO TABLE")
	@DeleteMapping("/del/{id}")
	public String delin(@PathVariable("id")int id)
	{
		serve.delin(id);
		return"Deletion was successful";
	}
	
	@Tag(name="TO UPDATE VALUE IN ZOO",description = "UPDATING VALUES IN ZOO")
	@PutMapping("/put")
	public Zoomain putin(@RequestBody Zoomain zo)
	{
		return serve.putin(zo);
	}
	@Tag(name="TO POST VALUES IN QUERY",description = "posting values in query")
	@PostMapping("/postquery")
	public Querytesting addquery(@RequestBody Querytesting q)
	{
		return serve.addquery(q);
	}
	@Tag(name="GET ALL DETAILS",description = "TO GET ALL DETAILS")
	@GetMapping("/getquery")
	public List<Querytesting> addquery()
	{
		return qrepo.findAll();
	}
	@Tag(name="DELETE BY ID",description = "DELETING BY ID")
	@DeleteMapping("/delquery/{id}")
	public String delque(@PathVariable("id")int id)
	{
		qrepo.delbyid(id);
		return "deletion is successful";
	}
	@Tag(name="UPDATING NAME BY USING ID JPQL",description = "we update the firstname by using id")
	@PutMapping("/putquery/{name}/{id}")
	public String upjpql(@PathVariable("name")String name,@PathVariable("id")int id)
	{
		qrepo.upjpql(name, id);
		return "Updation is successful";
	}
	@Tag(name="JPQL GET BY ID",description = "GETTING DETAILS BY USING ID")
	@GetMapping("/getjpql/{id}")
	public Querytesting getbyid(@PathVariable("id")int id)
	{
		return qrepo.selectbyidjpql(id);
	}
	
	

}
