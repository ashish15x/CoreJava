package com.hughes.exercises;

/* Problem Statement:
Write a java program for below requirement.
i/p:Hyderabad
o/p:dabaredyH
*/

/**
 * @author Ashish
 *
 */

public class Question2 {
    public static void main(String args[]) {
        // Input string
        String s = "Hyderabad";
        
        // Initialize two pointers: one pointing to the beginning of the string and the other pointing to the end
        int i = 0;
        int j = s.length() - 1;
        
        // Convert the string to a character array
        char[] arr = s.toCharArray();  
        // Swap characters at positions i and j, and move the pointers towards each other until they meet
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }    
        // Convert the character array back to a string
        String reverse = new String(arr);
        System.out.println(reverse);
    }
}
