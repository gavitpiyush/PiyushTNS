package com.privateconstructordemo;

public class MyClassDemo {

	public static void main(String[] args) {
	
		MyClass obj = MyClass.getObject();
		obj.setId(12);
		System.out.println(obj);
		
		MyClass m = MyClass.getObject();
		System.out.println(m);
		
	}

}
