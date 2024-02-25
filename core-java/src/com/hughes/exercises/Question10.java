package com.hughes.exercises;


/* Problem Statement:
 * 1)Display 'a','b','c','d' in reverse order using Arrays.
 */

/**
 * @author Ashish
 *
 */
public class Question10 {
	
	public static void main(String args[]) {
		// Character array declaration and initialization
		char arr[]= {'a','b','c','d'};
		
		// Length of the character array
		int len = arr.length;

		System.out.println("Printing the char array in reverse:");
		
		// Loop through the character array in reverse order
		for(int i = len - 1; i >= 0; i--) {
			System.out.print(arr[i] +" ");
		}
	}
}

