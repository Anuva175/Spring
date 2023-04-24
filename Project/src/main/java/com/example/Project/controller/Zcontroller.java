package com.example.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.model.Zooinfo;
import com.example.Project.service.Zservice;
@RestController
public class Zcontroller {

	@Autowired
	public Zservice ser;
	
	@PostMapping("/anu")
	public Zooinfo savedetails(@RequestBody Zooinfo zo)
	{
		return ser.savedetails(zo);
	}
	@GetMapping("/anu")
	public List<Zooinfo>getall()
	{
		return ser.getall();
	}
	@DeleteMapping("/anu/{id}")
	public String deletebyid(@PathVariable("id")int byid)
	{
		ser.deletebyid(byid);
		return "the Deletion was successful";
	}
	@DeleteMapping("/anubyreqparam")
	public String deleteidusingreqparam(@RequestParam("id")int byid)
	{
		ser.deletebyid(byid);
		return "the Deletion was successful";
	}
	@PutMapping("/anu")
	public Zooinfo updatedetails(@RequestBody Zooinfo zo)
	{
		return ser.updatedetails(zo);
	}
	
	
	
}
