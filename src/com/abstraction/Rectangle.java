package com.abstraction;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	public double calArea()
	{
		return this.area = length*breadth;
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
