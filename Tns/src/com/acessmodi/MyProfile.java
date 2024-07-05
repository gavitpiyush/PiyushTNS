package com.acessmodi;

public class MyProfile {
	public String name;
	private int age;
	long mobileno;
	protected String email;
	
	public void displayname()
	{
		System.out.println(name);
	}
	
	private void showage()
	{
		System.out.println(age);
	}
	
	void getmobileno()
	{
		System.out.println(mobileno);
	}
	
	protected void sendEmail()
	{
		System.out.println(email);
	}
	
	public void display() {
		email = "abc@gmail.com";
		sendEmail();
		
	}

}
