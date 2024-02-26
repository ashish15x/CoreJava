package com.edu.users;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
	
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10);
		al.add(20);
		
		
		Set st = new HashSet();
		st.add(new Integer(789));
		st.add(new Integer(1789));
		st.add(new Integer(1789));
		st.add(new String("Ashish"));
		st.add(new String("Kumar"));
		st.add(null);
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.toArray()[0]);
		System.out.println(st.contains(789));
		st.addAll(al);
		
		Iterator<E> ir=st.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		

	}

}
