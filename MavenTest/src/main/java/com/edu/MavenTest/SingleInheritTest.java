package com.edu.MavenTest;

class Base extends Object {
	Base() {
		System.out.println("Base constructor");
	}
 
	Base(int a) {
		System.out.println("Base ed  constructor");
	}
 
	public void display() {
		System.out.println("Base display");
	}
}
 
class Child extends Base {
	Child() {
		super(12);
	}
 
	public void childdisplay() {
		super.display();
		System.out.println("Child display");
	}
}
 
public class SingleInheritTest {
	public static void main(String[] args) {
		new Child().childdisplay();
 
	}
 
}