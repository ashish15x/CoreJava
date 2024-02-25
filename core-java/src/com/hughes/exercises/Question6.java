package com.hughes.exercises;

/* Problem Statement:
i/p:String a = "Computer"
o/p: r e t u p m o C
*/

/**
 * @author Ashish
 *
 */

public class Question6 {

    public static void main(String[] args) {
        // Define a string variable named 's' and assign it the value "Computer"
        String s = "Computer";
        
        // Loop through the characters of the string in reverse order
        for (int i = s.length()-1; i >= 0; i--) {
            // Print each character followed by a space
            System.out.print(s.charAt(i) + " ");
        }
    }
}

