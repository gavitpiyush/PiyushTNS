//child class
package com.inherit;

public class Student extends Citizen{
	
	private int id;
	private String collegeName;
	private String branch;

	public int getId() {
		return id;
	}
	
	//getters and setters
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	//default constructor
	public Student() {
		super();
	}
	
	
		
	public Student(String name, String aadharNo, long phNo, String gender, int id, String collegeName,
			String branch, String study) {
		super(name, aadharNo, phNo, gender);
		this.id = id;
		this.collegeName = collegeName;
		this.branch = branch;
	}
	public void study()
	{
		System.out.println("Student is studying");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeName=" + collegeName + ", branch=" + branch + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getPhNo()=" + getPhNo() + ", getGender()=" + getGender()
				+ "]";
	}
	

	
	}

	

	

	
	

	
	

	
	
	
	
	
	
	
	


