package com.edu.MavenTest;

class Bank{
	public float getHomeLoanRate() {
		return 0f;
	}
}
class SBI extends Bank{
	public float getHomeLoanRate() {
		return 8f;
	}
}
class  ICICI extends Bank{
	public float getHomeLoanRate() {
		return 8.5f;
	}
}
class HSBC extends Bank{
	public float getHomeLoanRate() {
		return 9f;
	}
}
class IDBI extends Bank{
	public float getHomeLoanRate() {
		return 9.5f;
	}
}





public class Btest {

	public static void main(String args[]) {
		ICICI b= new ICICI();
		System.out.println(b.getHomeLoanRate());
	}
}
