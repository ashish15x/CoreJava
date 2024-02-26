package com.edu.users;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class RetainHashSetExample {

	public static void main(String[] args) {
	
		
		HashSet st = new HashSet();
		st.add(new Integer(789));
		st.add(new Integer(1789));
		st.add(null);
		st.add(new String("Ashish"));
		
	   HashSet st1=new HashSet();
	   st1.add(new Integer(789));
	   st1.add(new String("Ashish"));
	   System.out.println(st);
	   System.out.println(st1);
	   System.out.println(st.retainAll(st1));
	   System.out.println(st);
	   System.out.println(st1);
	   
		


	}

}
