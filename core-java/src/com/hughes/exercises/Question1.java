package com.hughes.exercises;

/*Problem Statement:
Given String:"aksajd5676@$%^"

No of Numbers:
No of Alphabets:
Total Size:  */

/**
 * @author Ashish
 *
 */
public class Question1 {

    public static void main(String[] args) {

        String s = "aksajd5676@$%^";
        
        // Variables to store the count of alphabetic characters, numeric characters, and total length of the string
        int alphacount = 0;
        int numcount = 0;
        int strlength = 0;
        
        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Check if the character is alphabetic
            if (Character.isAlphabetic(ch)) {
                alphacount++;
            } 
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numcount++; 
            }
            
            strlength++;
        }
        
        System.out.println("No. of alphabets: " + alphacount);
        System.out.println("No. of numbers: " + numcount);
        System.out.println("Total length: " + strlength);
    }

}
