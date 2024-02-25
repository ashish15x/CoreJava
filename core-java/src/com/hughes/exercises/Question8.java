package com.hughes.exercises;

/* Problem Statement:
Based on the i/p,you need to display whether 
it is integer or float or character or string.
*/


/**
 * @author Ashish
 *
 */

import java.util.Scanner;

public class Question8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter input
	        System.out.print("Enter input: ");
	        String input = scanner.nextLine();
	        
	        // Determine the type of input and print the result
	        if (isInteger(input)) {
	            System.out.println("Integer");
	        } else if (isFloat(input)) {
	            System.out.println("Float");
	        } else if (isCharacter(input)) {
	            System.out.println("Character");
	        } else {
	            System.out.println("String");
	        }
	        
	        scanner.close();
	    }
	    
	    // Method to check if the input is an integer
	    public static boolean isInteger(String input) {
	        try {
	            Integer.parseInt(input); // Try parsing the input as an integer
	            return true; // Return true if successful
	        } catch (NumberFormatException e) {
	            return false; // Return false if parsing fails (input is not an integer)
	        }
	    }
	    
	    // Method to check if the input is a float
	    public static boolean isFloat(String input) {
	        try {
	            Float.parseFloat(input); // Try parsing the input as a float
	            return true; // Return true if successful
	        } catch (NumberFormatException e) {
	            return false; // Return false if parsing fails (input is not a float)
	        }
	    }
	    
	    // Method to check if the input is a character
	    public static boolean isCharacter(String input) {
	        return input.length() == 1 && Character.isLetter(input.charAt(0)); // Check if the input has length 1 and is a letter
	    }
	}
