package com.edu.MavenTest;
 //dynamic parameters
public class NewTest {
	
	public void display(int ...a) {
		int sum=0;
		for(int i: a) {
			sum+=i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new NewTest().display(10,20,30,30);
	}

}
