package com.edu.MavenTest;

class A{
	void displayA() {
		System.out.println("Base Class: A");
	}
}

class B extends A{
	void displayB() {
		System.out.println("Child Class: B");
	}
}
class C extends A{
	void displayC() {
		System.out.println("Child Class: C");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		   B b = new B();
	       C c = new C();

	        b.displayA();
	        b.displayB();
	        c.displayA();
	        c.displayC();
	}

}
