package com.example.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.Loginmodel;
import com.example.Project.repository.Loginrepo;
@Service
public class Loginservice {
 @Autowired
	private Loginrepo repol;
	public String checkLogin(String name,String pwd)
	{
		Loginmodel user=repol.findByname(name);
		if(user==null)
		{
			return "No User Found";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public Loginmodel addUser(Loginmodel mod)
	{
		return repol.save(mod);
	}
	public List<Loginmodel>getUser()
	{
		return repol.findAll();
	}
	public String deleteById(int id)
	{
		repol.deleteById(id);
		return "Deleted";
	}
}
