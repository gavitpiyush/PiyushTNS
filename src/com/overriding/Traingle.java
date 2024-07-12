package com.overriding;

//child class
public class Traingle extends Shape{
	
private int base;
private int height;
	

	public Traingle(int base, int height) {
	super();
	this.base = base;
	this.height = height;
}

	public void draw() 
	{
		System.out.println("Drawing a square with base and height" +base +" "+height);
	}
	
	public void erase() 
	{
		System.out.println("Earsing a circle with base and height" +base +" "+height);
	}
	
}
