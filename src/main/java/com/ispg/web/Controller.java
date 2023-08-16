package com.ispg.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ispg/api")
public class Controller {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World from ispgweb";
	}

}
