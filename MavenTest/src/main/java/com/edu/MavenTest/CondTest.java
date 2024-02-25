package com.edu.MavenTest;

public class CondTest {

	public static void main(String[] args) {
		
//		int a=Integer.parseInt(args[0]);
//		if(a%4==0) {
//			System.out.println("Leap Year");
//		}
//		else
//		{
//			System.out.println("Not a leap Year");
//		}

		String s ="Ashish";
		switch(s) {
		case "Ashish":
			System.out.println("Matched with 1");
			break;
		case "ss":
			System.out.println("Matched with 90");
			break;
		default:
			System.out.println("No Match");
		}
	}

}
