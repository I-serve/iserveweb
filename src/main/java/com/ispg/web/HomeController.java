package com.ispg.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	
	@GetMapping("/test")
	public String test() {
		
		return "Test";
	}
	
	@PostMapping("/testpost")
	public String testpost() {
		return "response from testpost api";
	}
	

}
