package com.sarthaks93.jpa.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	private final static Logger log = LoggerFactory.getLogger(ApiController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}
	

}
