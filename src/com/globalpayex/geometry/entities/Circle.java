package com.globalpayex.geometry.entities;
import com.abc.geometry.entities.Shapes;
import com.globalpayex.geometry.entities.*;

public class Circle extends Shapes {
	double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
		
	}
	

}
