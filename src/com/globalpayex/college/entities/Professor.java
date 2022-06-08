package com.globalpayex.college.entities;

public class Professor extends Collegeuser {
	String[] subjects;
	public Professor(String name, char gender,String[] subjects) {
		super(name, gender);
		this.subjects = subjects;
	}
	
	

}
