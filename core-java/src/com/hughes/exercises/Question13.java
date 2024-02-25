package com.hughes.exercises;

/* Problem Statement:
 * Write a Java Program to find duplicate numbers in an 
 * array if it contains multiple duplicates? (
 */

/**
 * @author Ashish
 *
 */
public class Question13 {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 5, 2, 4, 8, 9, 5, 6, 2 };
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		System.out.print("Duplicate elements in the array are: ");
		// Traverse through the array
		for (int i = 0; i < arr.length; i++) {
			// Check if the element is marked as visited
			if (arr[Math.abs(arr[i])] >= 0) {
				// Mark the element as visited by negating its value
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				// If the element is already visited, it is a duplicate
				System.out.print(Math.abs(arr[i]) + " ");
			}
		}
	}
}
