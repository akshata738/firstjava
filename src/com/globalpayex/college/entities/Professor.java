package com.globalpayex.college.entities;

import com.abc.salary.Salarieindividual;

public class Professor extends Collegeuser implements Salarieindividual {
	
	
	double costperday;
	int workingdays;
	
	
	public String[] subjects;
	public Professor(String name, char gender,String[] subjects) {
		super(name, gender);
		this.subjects = subjects;
	}
	public Professor(String name, char gender, double costperday, int workingdays) {
		super(name, gender);
		this.subjects =subjects;
		this.costperday = costperday;
		this.workingdays = workingdays;
	}
	
//	@Override
//	public double getCostperday() {
//		return costperday;
//	}
//	get
	

}
