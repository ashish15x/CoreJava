package com.hughes.exercises;

import java.util.Arrays;

/*
 --import java.util.* instead of importing all packages with * 
   instead we can import just the arrays package needed.
 -- The class name given was arrays which has 2 problems
    first that the initials of class name should be capital
    secondly the name should not be arrays as arrays class is already predefined class
 */

/**
 * @author Ashish
 *
 */

class ArraysExample
{
	
public static void main(String args[])
{
int array[] = new int[10];

// Initialize array elements with negative values from -1 to -9
for(int loop_index = 9; loop_index > 0; loop_index--)
array[loop_index] = -loop_index; 

for(int loop_index = 0; loop_index < array.length; loop_index++)
System.out.print(array[loop_index] + " ");

System.out.println();
Arrays.sort(array); // Sort the array

// // Print the sorted array
for(int loop_index = 0; loop_index < array.length; loop_index++)
System.out.print(array[loop_index] + " ");
System.out.println();
//Perform binary search to find the position of value -5
System.out.print("Found -5 at position " +Arrays.binarySearch(array, -5));

}
}