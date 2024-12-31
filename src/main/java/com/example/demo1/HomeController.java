package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping
	public String getMessage()
	{
		return "Welcome to spring Project";
	}
	
	@GetMapping("home/{data}")
	public String getMessage(@PathVariable String data)
	{
		return "Welcome to spring Project "+data;
	}

}
