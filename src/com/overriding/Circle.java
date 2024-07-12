package com.overriding;

//child class
public class Circle extends Shape{
	
	private int radius;
	
	//parameterized constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void draw() 
	{
		System.out.println("Drawing a circle with radius" +radius);
	}
	
	public void erase() 
	{
		System.out.println("Earsing a circle with radius" +radius);
	}
}
