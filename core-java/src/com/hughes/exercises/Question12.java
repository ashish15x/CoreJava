package com.hughes.exercises;

/*Problem Statement:
Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.
*/


/**
 * @author Ashish
 *
 */
import java.util.Arrays;

public class Question12 {

    public static int removeDuplicates(int[] arr) {
        
        Arrays.sort(arr);
        
        // Variable to store the current index of the updated array
        int currentIndex = 0;
        
        // Loop through the array and remove duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            // If the current element is not equal to the next element then copy it to the updated array
            if (arr[i] != arr[i + 1]) {
                arr[currentIndex++] = arr[i];
            }
        }
        
        // Copy the last element to the updated array
        arr[currentIndex++] = arr[arr.length - 1];
        
        return currentIndex;
    }

    public static void main(String[] args) {
        // Given input
        int[] array = {20, 20, 30, 40, 50, 50, 50};

        // Function call for removing duplicates
        int newLength = removeDuplicates(array);

        System.out.println("New length of array after removing duplicates: " + newLength);
    }
}

