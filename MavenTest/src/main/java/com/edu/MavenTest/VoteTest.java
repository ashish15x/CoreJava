package com.edu.MavenTest;

import com.edu.customexceptions.VoteException;

public class VoteTest {

	public static void main(String[] args) {

		int age = 20;
		try {
			if (age < 18) {
				throw new VoteException("No right to vote");
			}
		} catch (VoteException e) {
			System.out.println(e.getMessage());
		}
	}

}
