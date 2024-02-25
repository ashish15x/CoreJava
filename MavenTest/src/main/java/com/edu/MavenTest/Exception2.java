package com.edu.MavenTest;

//If given i/p is number,throw Numberformat exception 
//otherwise  if i/p is character ,throw CharacterException
//Else display Valid String

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input:");

		String input = sc.nextLine();

		try {
			if (isInteger(input)) {
				throw new NumberFormatException("Input is an integer.");
			} else if (isCharacter(input)) {
				throw new CharacterException("Input is a character.");
			} else {
				System.out.println("Valid string: " + input);
			}
		} 
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException: " + e.getMessage());
		}
		catch (CharacterException e) {
			System.out.println("CharacterException: " + e.getMessage());
		}
	}

	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isCharacter(String input) {
		return input.length() == 1 && Character.isLetter(input.charAt(0));
	}

	static class CharacterException extends Exception {
		public CharacterException(String message) {
			super(message);
		}
	}
}
