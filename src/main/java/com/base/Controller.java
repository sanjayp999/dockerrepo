package com.base;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController 
public class Controller {
	
	org.slf4j.Logger logger=LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/greet")
	public String greet() {
		
		logger.info("user has accessed the app");
		
		String str="welcome to logging";
		
		logger.info("user access stopped");
		return str;
		
	}

}
