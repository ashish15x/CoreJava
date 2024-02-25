package com.edu.MavenTest;
import java.util.Scanner;
import java.util.Vector;
public class VectorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Vector obj= new Vector();
		String input=sc.nextInt();
		switch(input) {
		case 1:
		   String adddata=sc.nextLine();
		   obj.add(adddata);
		   break;
		case 2:
			String deletedata=sc.nextLine();
			if(obj.isEmpty()) {
				System.out.println("Vector is empty");
			}
			else {
			obj.remove(deletedata);
			}
		    break;
		case 3:
			if(obj.isEmpty()) {
				System.out.println("Vector is empty");
			}
			else {
			System.out.println(obj);
			}
			break;
		case 4:
			Vector duplicates = new Vector();
	        for (String data : obj) {
	            if (obj.indexOf(data) != obj.lastIndexOf(data) && !duplicates.contains(data)) {
	                duplicates.add(data);
	            }
	        }

	        if (duplicates.isEmpty()) {
	            System.out.println("No duplicates found.");
	        } else {
	            System.out.println("Duplicate values:");
	            for (String duplicate : duplicates) {
	                System.out.println(duplicate);
	            }
	        }
	        break;
			
	}

}
}
