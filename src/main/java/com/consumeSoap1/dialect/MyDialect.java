package com.consumeSoap1.dialect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyDialect {
	
	@Autowired
	com.consumeSoap1.service.MyService myService;
	
	public String getStringData() {
		return myService.getStringFromService();
	}

}
