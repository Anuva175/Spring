package com.example.Day3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day3.model.student;
import com.example.Day3.service.service;
@RestController
public class controller {
@Autowired
	public service ser;

@PostMapping("/stu")
public student postdata(@RequestBody student st)
{
	return ser.postdata(st);
}



}
