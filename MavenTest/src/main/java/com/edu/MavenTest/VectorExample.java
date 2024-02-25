package com.edu.MavenTest;

import java.util.Vector;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Vector obj= new Vector();
		obj.add(34);
		obj.add("Ashish");
		obj.add("Ranchi");
		obj.add(400.51f);
		obj.add(null);
//		obj.add(34);
		System.out.println(obj);
//		obj.remove(34);
		obj.remove("Ashish");
		System.out.println(obj.size());
		System.out.println(obj);
		
		
		Vector<Integer> obj1 =new Vector<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);

		
		
		
	}

}
