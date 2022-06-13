package com.globalpayex.college.entities;
//final cannot be inherited
public class Collegeuser { //bydefault extends from object
	// we can use protected in same package classes and any classes which is in hierrachial 
	//i.e parent or child classes  of its class
	public String name;
	protected char gender;
	
	public Collegeuser(String name, char gender) {
		super();//calls the parent constructor (in this case parent is object class which is default in java)
		this.name = name;
		this.gender = gender;
		// student has a address
		//professor has a address
		
				}
	public Collegeuser(String name, char gender,Address address) {
		super();//calls the parent constructor (in this case parent is object class which is default in java)
		this.name = name;
		this.gender = gender;
		this.address = address;
		
		// student has a address
		//professor has a address
		
				}
	
	
	
	
	 Address address;
	public void setAddress(Address adress) {
		this.address= address;
	}
	

	public Address getAddress() {
		return address;
	}
	public String getdetails() {
		 
		 return String.format("name:%s\n gender:%s\n Address:%s\n  ",this.name,this.gender,this.address!=null ?
				  this.address.getDetails(): "NA");
	}
	public boolean isAdressPresent() {
		return this.address != null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s\n gender:%s\n  ",
				this.name,this.gender); 
		
	}
	public char getgender() {
		return gender;
		
	}
	

}
//