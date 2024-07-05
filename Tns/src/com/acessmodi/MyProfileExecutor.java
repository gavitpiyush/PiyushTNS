package com.acessmodi;

public class MyProfileExecutor {
	
	public static void main(String[] args) {
		MyProfile p = new MyProfile();
		
		p.name = "Piyush";
		p.displayname();
		
		//private members are not accessible
		//p.age = 22;
		//p.showage();
		
		p.mobileno = 425613789;
		p.getmobileno();
		
		p.email = "abc@gmail.com";
		p.sendEmail();
	}

}
