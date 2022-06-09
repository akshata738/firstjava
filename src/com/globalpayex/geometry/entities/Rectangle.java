package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shapes;

public class Rectangle extends Shapes  {
	public double length;
	public double breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return this.length*this.breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length+this.breadth);
	}
	
	

}
