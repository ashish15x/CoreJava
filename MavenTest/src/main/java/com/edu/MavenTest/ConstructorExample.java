package com.edu.MavenTest;

public class ConstructorExample {
    
	
	 private String firstname;
	ConstructorExample(){
		System.out.println("Unparameterised Constructor");
	}
	ConstructorExample(String first){
		firstname=first;
		System.out.println("parameterised Constructor "+firstname);
	}
	public void display() {
		System.out.println("function overloaded");
	}
	public void display(long mobile ) {
		System.out.println("function overloaded " +mobile);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConstructorExample p =new ConstructorExample("Ashish");
       p.display(990318313l);
	}

}
