package com.consumeSoap1.service.impl;

import org.springframework.stereotype.Service;

import com.consumeSoap1.input.UserInput;
import com.consumeSoap1.service.MyService;
import io.codejournal.maven.wsdl2java.Calculator;



@Service
public  class MyServiceImpl implements MyService {

	Calculator calculator = new Calculator();
	
	

	@Override
	public int getAddResultService(UserInput requestbody) {
		return calculator.getCalculatorSoap().add(requestbody.getIntA(), requestbody.getIntB());
	}



	@Override
	public int getSubstractResultService(UserInput requestbody) {
		return calculator.getCalculatorSoap().subtract(requestbody.getIntA(), requestbody.getIntB());
	}



	@Override
	public int getMultiplyResultService(UserInput requestbody) {
		return calculator.getCalculatorSoap().multiply(requestbody.getIntA(),requestbody.getIntB());
	}



	@Override
	public int getDivideResultService(UserInput requestbody) {
		return calculator.getCalculatorSoap().divide(requestbody.getIntA(), requestbody.getIntB());
	}
	
	

}
