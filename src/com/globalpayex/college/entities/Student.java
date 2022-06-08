package com.globalpayex.college.entities;

public class Student extends Collegeuser {
	int roll;
	float marks;
	public Student(String name, char gender, int roll, float marks) {
		super(name, gender);
		this.name=name;
		this.gender=gender;
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public String getdetails() {
		String s1= super.getdetails();
//		super.getdetails();
		 return String.format("name:%s\n gender:%s\n roll:%s\n marks:%s\n ",this.name,this.gender,this.roll,this.marks);
		 
		// TODO Auto-generated method stub
	
	}
	

}
