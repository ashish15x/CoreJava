package com.edu.MavenTest;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a[]= {"cat","bat","rat","computer"};
       for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
	}
       System.out.println("----------------------------------------");
       Arrays.sort(a);
       for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
       }
	}

}
