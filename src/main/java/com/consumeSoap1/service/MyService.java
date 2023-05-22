package com.consumeSoap1.service;

import com.consumeSoap1.input.UserInput;

public interface MyService {

	public int getAddResultService(UserInput requestbody);
	
	public int getSubstractResultService(UserInput requestbody);
	
	public int getMultiplyResultService(UserInput requestbody);
	
	public int getDivideResultService(UserInput requestbody);
	
	
}
