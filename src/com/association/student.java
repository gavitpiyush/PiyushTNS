package com.association;


//contained class
public class student {
	//data members
	private int rollNo;
	private String name;
	
	//dependency
	private Address address;
	
	//getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//parameterized constructor
	public student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	//default constructor
	public student() {
		super();
	}
	
	
	
}
