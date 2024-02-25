package com.hughes.exercises; 
import java.util.Arrays;

/* Problem Statement:
 * "cat"
"bat"
"rat"
"computer"
in an array and display the contents in array in ascending order.
 */

/**
 * @author Ashish
 *
 */

public class Question11 {

	public static void main(String[] args) {

       // String array declaration and initialization
       String a[]= {"cat","bat","rat","computer"};
       
       // Printing the elements of the array before sorting
       for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
	}
 
       System.out.println("----------------------------------------");
       
       // Sorting the array using Arrays.sort() method
       Arrays.sort(a);
       
       // Printing the elements of the array after sorting
       for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
       }
	}

}
