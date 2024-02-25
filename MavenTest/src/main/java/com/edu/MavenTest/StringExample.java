package com.edu.MavenTest;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="       Ashish"; //literal way
		String s2="ashish";
		String lastname= new String("Ashish"); //object way of creating
		
		System.out.println(lastname.isEmpty());
		System.out.println(s.replace('s','E'));
		System.out.println(s.trim());
		if(s.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
		
		
		
	}

}
