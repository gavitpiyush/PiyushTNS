package com.association;

public class association {

	public static void main(String[] args) {
		Address address=new Address("JM Road","Mumbai","MH",421203);
		
		student s1=new student(1,"Piyush",address);
		System.out.println(s1);

	}

}
