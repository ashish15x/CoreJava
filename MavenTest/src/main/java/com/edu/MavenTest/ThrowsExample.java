package com.edu.MavenTest;

import java.io.IOException;
class Mat {
	public void mymethod() throws IOException,NullPointerException {
		System.out.println("My method activated");
		throw new IOException("io error");
	}
}

public class ThrowsExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new Mat().mymethod();

	}

}
