package com.example.Day1.three;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Three {
	@Value("${namevalue:anu}")
 public String name;
	@GetMapping("/anu3")
	@ResponseBody
	public String display()
	{
		return "thank you"+name;
	}
}
