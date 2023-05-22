package com.consumeSoap1.dialect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.consumeSoap1.input.UserInput;


@Component
public class MyDialect {
	
	@Autowired
	com.consumeSoap1.service.MyService myService;
	
	public String getStringData() {
		return myService.getStringFromService();
	}
	
	public int getAddData(UserInput RequestBody) {
		return myService.getAddResultService(RequestBody);
		
	}

}
