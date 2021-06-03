package com.vishwaaws.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApplicationInfoController {

	
	@GetMapping("/info")
	public String getAppInfo() {
		return "Spring application in Java + AWS + Git + Jenkins + tomcat+ cucumber successfully integrated, will integrate cucumber soon";
	}

	
}
