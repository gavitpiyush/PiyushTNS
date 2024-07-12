//parent class
package com.inherit;

//parent entity class
public class Citizen {
	
	private String name;
	private String aadharNo;
	private long phNo;
	private String gender;
	private String tax;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	//parameterized constructor
	public Citizen(String name, String aadharNo, long phNo, String gender) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.phNo = phNo;
		this.gender = gender;
		//super();position matters it should be on the first line in a constructor
	}
	
	public void tax()
	{
		System.out.println("tax is paid");
	}
	
	//default constructor
	public Citizen() {
		super();
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", phNo=" + phNo + ", gender=" + gender + "]";
	}
	
	
}
	
	


