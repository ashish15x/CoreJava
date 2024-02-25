package com.edu.MavenTest;

class Vehicle{
  public void move() {
	  System.out.println("vehicle is moving");
  }


public class BikeClass extends Vehicle {
    
	public void move() {
		System.out.println("Bike is moving");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeClass obj=new BikeClass();
		obj.move();

	}

}
