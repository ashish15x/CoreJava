package com.hughes.exercises;


/* Problem Statement:
Add values from 239 till 699 using for loop.
example:
2 till 8
2+3+4+5+6+7+8=?
*/

/**
 * @author Ashish
 *
 */
		
public class Question9 {

    public static void main(String[] args) {

        int sum=0; // Initialize a variable to store the sum of numbers
        for(int i=239;i<=699;i++) { // Loop from 239 to 699 (inclusive)
            sum+=i; // Add each number to the sum
        }
        System.out.println(sum); 
    }

}

