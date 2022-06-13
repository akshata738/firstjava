package com.globalpayex.college.entities;

public class Student extends Collegeuser {
	public int roll;
	public float marks;
	public Student(String name, char gender, int roll, float marks) {
		super(name, gender);
//		this.name=name;
//		this.gender=gender;
		this.roll = roll;
		this.marks = marks;
		
	
	}
	public Student(String name, char gender, int roll, float marks,Address adress) {
		super(name, gender, adress);
//		this.name=name;
//		this.gender=gender;
		this.roll = roll;
		this.marks = marks;
//		this.address = address;
		
		
	
	}
	
	
	@Override
	public String getdetails() {
		String s1= super.getdetails(); //Collegeuser.getDetails();
//		super.getdetails();
		 return String.format("name:%s\n gender:%s\n roll:%s\n marks:%s\n ",this.name,this.gender,this.roll,this.marks);
		 
		// TODO Auto-generated method stub
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	
	
	

}
