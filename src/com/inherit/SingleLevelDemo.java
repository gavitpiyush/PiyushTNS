package com.inherit;

public class SingleLevelDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Piyush","1234 6789 1597",5478963,"Male",445,"Watumull","ComputerEngg","Student is Studying");
		s1.study();
		System.out.println(s1);	
		s1.tax();
		System.out.println(s1);

	}

}
