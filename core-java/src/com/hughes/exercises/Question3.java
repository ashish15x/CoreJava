package com.hughes.exercises;

/* Problem Statement: 
i/p: a b c d e f
o/p: f1 e2 d3 c4 b5 a6
*/

/**
 * @author Ashish
 *
 */

public class Question3 {
    public static void main(String[] args) {
        String input = "a b c d e f";
        
        // Split the input string by space into an array of tokens
        String[] tokens = input.split(" ");
        
        // Variable to store the result
        String result = "";
        
        // Counter to keep track of the position of each token
        int count = 1;
        
        // Iterate over the tokens array in reverse order
        for (int i = tokens.length - 1; i >= 0; i--) {
            // Append the current token and its position to the result string
            result += tokens[i] + count++;
            
            // Add a space if it's not the last token
            if (i != 0) {
                result += " ";
            }
        }
        System.out.println("Output: " + result);
    }
}

