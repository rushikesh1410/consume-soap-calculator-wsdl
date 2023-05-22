package com.consumeSoap1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumeSoap1.dialect.MyDialect;
import com.consumeSoap1.input.UserInput;


@RestController
@RequestMapping("/cal")
public class Controller {
	
	@Autowired
	MyDialect myDialect;
	
	@GetMapping("/all")
	public String printData() {
		return myDialect.getStringData();
	}
	
	@PostMapping(value="/Add")
	public int Addresult(@RequestBody UserInput requestbody ) {
		return myDialect.getAddData(requestbody);
	}


}
