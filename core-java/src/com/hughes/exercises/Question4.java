package com.hughes.exercises;

/*Problem Statement:
i/p: 34567
o/p: Thirty four Thousand Five Hundred and Sixty Seven Only
i/p: 345
o/p: Three Hundred and Forty Five only 
 till 6 digits */

/**
 * @author Ashish
 *
 */

import java.util.Scanner;

public class Question4 {
    
    // Arrays to store words for units, teens, and tens places
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.close(); 
        
        // Check if the number is out of range (0 to 999999)
        if (number < 0 || number > 999999) {
            System.out.println("Number out of range");
            return;
        }
        
        // Convert the number to words and print the result
        String words = convertToWords(number);
        System.out.println("Output: " + words);
    }
    
    // Method to convert a given number to words
    public static String convertToWords(int number) {
        // If the number is 0, return "Zero"
        if (number == 0) {
            return "Zero";
        }
        
        String words = "";
        
        // Convert lakh place if present
        if ((number / 100000) > 0) {
            words += convertToWords(number / 100000) + " Lakh ";
            number %= 100000;
        }
        
        // Convert thousand place if present
        if ((number / 1000) > 0) {
            words += convertToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }
        
        // Convert hundred place if present
        if ((number / 100) > 0) {
            words += convertToWords(number / 100) + " Hundred ";
            number %= 100;
        }
        
        // Convert remaining tens and units places
        if (number > 0) {
            if (!words.isEmpty()) {
                words += "and ";
            }
            if (number < 10) {
                words += units[number];
            } else if (number < 20) {
                words += teens[number - 10];
            } else {
                words += tens[number / 10] + " " + units[number % 10];
            }
        }
        
        return words;
    }
}
