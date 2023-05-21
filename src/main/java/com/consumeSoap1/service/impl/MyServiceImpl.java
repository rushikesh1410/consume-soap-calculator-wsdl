package com.consumeSoap1.service.impl;

import org.springframework.stereotype.Service;

import com.consumeSoap1.service.MyService;
import io.codejournal.maven.wsdl2java.Calculator;



@Service
public class MyServiceImpl implements MyService {

	public String getStringFromService() {
		Calculator calculator = new Calculator();
		return "the sum is = "+calculator.getCalculatorSoap().add(5, 10);
	}

}
