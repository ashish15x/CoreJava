package com.edu.MavenTest;

public class ThrowExample {

	public static void eventest(int a) {
		if (a % 2 == 0) {
			System.out.println("even no");
		} else {
			throw new ArithmeticException("given no is not even no.");
		}
	}

	public static void main(String[] args) {

		eventest(3);

	}

}
