package com.overriding;

//child class
public class Square extends Shape{
	
private int side;
	

	public Square(int side) {
	super();
	this.side = side;
}

	public void draw() 
	{
		System.out.println("Drawing a square with side" +side);
	}
	
	public void erase() 
	{
		System.out.println("Earsing a circle with side" +side);
	}

}
