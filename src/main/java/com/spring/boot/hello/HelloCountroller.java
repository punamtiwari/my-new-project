package com.spring.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCountroller {
	@RequestMapping("/Hello ")
	public String sayHi() {
		return "Hi" ;
		
		
		
		
		
	}
	
	

}
