package com.example.Day1.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Second {
	
	public String name="anuvarsini";
	@GetMapping("/anu2")
	@ResponseBody
	public String display()
	{
		return "Welcome to RESTAPI"+name;
	}

}
