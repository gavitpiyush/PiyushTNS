package com.abstraction;

public class Square extends Shape{
	
	private double side;
	
	public double calArea()
	{
		return this.area = side*side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}
	
}
