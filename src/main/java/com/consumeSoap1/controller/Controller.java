package com.consumeSoap1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumeSoap1.dialect.MyDialect;



@RestController
@RequestMapping("/cal")
public class Controller {
	
	@Autowired
	MyDialect myDialect;
	
	@GetMapping("/all")
	public String printData() {
		return myDialect.getStringData();
	}

}
