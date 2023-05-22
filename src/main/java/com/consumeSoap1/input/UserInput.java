package com.consumeSoap1.input;

import javax.persistence.Entity;

@Entity
public class UserInput {
	
	public int intA;
	public int intB;
	
	//getters and setters
	public int getIntA() {
		return intA;
	}
	public void setIntA(int intA) {
		this.intA = intA;
	}
	public int getIntB() {
		return intB;
	}
	public void setIntB(int intB) {
		this.intB = intB;
	}
	
	//constructor using fields
	public UserInput(int intA, int intB) {
		super();
		this.intA = intA;
		this.intB = intB;
	}
	
	//constructor using super
	public UserInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
