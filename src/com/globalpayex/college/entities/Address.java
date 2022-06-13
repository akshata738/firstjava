package com.globalpayex.college.entities;

public class Address {
	private  int pincode;
	private String State;
	private String Country;
	private String District;
	
	

	public Address(int pincode, String state, String country, String district) {
		super();
		this.pincode = pincode;
		this.State = state;
		this.Country = country;
		this.District = district;
	}
	public String getDetails() {
		return this.pincode + "," + this.District + "," + this.State + "," +this.Country;
		}
	



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public String getCountry() {
		return Country;
	}



	public void setCountry(String country) {
		Country = country;
	}



	public String getDistrict() {
		return District;
	}



	public void setDistrict(String district) {
		District = district;
	}
	
	

}
