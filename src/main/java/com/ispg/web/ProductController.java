package com.ispg.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@GetMapping("/p1")
	public String getproduct() {
		
		return "Product service from p1 api...";
	}
}
