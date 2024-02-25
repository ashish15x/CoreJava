package com.edu.MavenTest;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String z = null;
			System.out.println(z.concat("str"));
		} catch (Exception e) {
			System.out.println("Exception occured due to operation on null");
		}
	}

}
