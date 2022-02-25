package com.SampleBuildJob.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Demo {
	
	@GetMapping("/demo")
	public String display() {
		
		return ("hello ");
	}

}
