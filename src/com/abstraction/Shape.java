package com.abstraction;

public abstract class Shape {
	
	public double area;
	
	//solid/concrete
	public void showArea()
	{
		System.out.println("The area of the shape is" +area);
	}
	
	public abstract double calArea();
	
}
