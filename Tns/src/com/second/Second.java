package com.second;

import com.acessmodi.MyProfile;

public class Second extends MyProfile{
	
	public static void main(String[] args) {
		MyProfile p = new MyProfile();
		
		p.name = "Piyush";
		p.displayname();
		
		//private members are not accessible
		//p.age = 22;
		//p.showage();
		
		//p.mobileno = 425613789;
		//p.getmobileno();
		
		//protected members are not accesible
		//p.email = "abc@gmail.com";
		//p.sendEmail();
		
		p.display();
	}

}

