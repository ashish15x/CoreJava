package com.edu.MavenTest;

//i/p: vasu34k@gmail.com
//o/p: valid emailid
// 
//i/p: bob34kgmail.com
//o/p:Invalid emailid


public class ValidString {

	public static void main(String[] args) {
		String user="ashish@gmail.com";
		System.out.println(user.hashCode());
		int len=user.length();
	//	if(user.substring(len-10,len).equals("@gmail.com")) {
			if(user.endsWith("@gmail.com")) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
