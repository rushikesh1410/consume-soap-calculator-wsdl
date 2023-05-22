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
	
	
	@PostMapping(value="/Add")
	public int addResult(@RequestBody UserInput requestbody ) {
		return myDialect.getAddData(requestbody);
	}

	
	@PostMapping(value="/Substract")
	public int substractResult(@RequestBody UserInput requestbody ) {
		return myDialect.getSubstractData(requestbody);
	}
	
	@PostMapping(value="/Multiply")
	public int multiplayResult(@RequestBody UserInput requestbody ) {
		return myDialect.getMultiplayData(requestbody);
	}
	
	@PostMapping(value="/Divide")
	public int DivideResult(@RequestBody UserInput requestbody ) {
		return myDialect.getDivideData(requestbody);
	}

}
