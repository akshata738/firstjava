package com.globalpayex.college.entities;

public class Collegeuser { //bydefault extends from object
	public String name;
	public char gender;
	
	public Collegeuser(String name, char gender) {
		super();//calls the parent constructor (in this case parent is object class which is default in java)
		this.name = name;
		this.gender = gender;
	}
	public String getdetails() {
		 
		 return String.format("name:%s\n gender:%s\n ",this.name,this.gender);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s\n gender:%s\n  ",
				this.name,this.gender); 
		
	}
	

}
//