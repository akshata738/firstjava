package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shapes;

public class Square extends Shapes {
	public double side;
	

	public Square(int side) {
		super();
		this.side = side;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
