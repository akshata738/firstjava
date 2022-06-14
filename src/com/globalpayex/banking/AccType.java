package com.globalpayex.banking;

public enum AccType {
	SAVINGS("s"),
	CURRENT("c");
	private String Actualvalue;
	AccType(String ActualValue){
		this.Actualvalue = ActualValue;
	}
	public String getActualvalue() {
		return Actualvalue;
	}
	//has an implicit integer value called Ordinal
	
	//source destination,copy opeartion and then write fibonaci series inthe file 20

	

}
