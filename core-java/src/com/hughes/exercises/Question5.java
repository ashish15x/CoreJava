package com.hughes.exercises;


/* Problem Statement:
i/p: 3
o/p: +++
i/p: 4
o/p: ++++ */

/**
 * @author Ashish
 *
 */

public class Question5 {

    public static void main(String[] args) {
        // Initialize a variable named 'counter' with the value 4
        int counter = 4;
        
        // Loop while 'counter' is greater than 0
        while (counter > 0) {
            // Print the character '+' without a newline
            System.out.print("+");
            // Decrement the value of 'counter' by 1
            counter--;
        }
    }

}

