package com.edu.MavenTest;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList ls=new ArrayList();
       ls.add(34);
       ls.add(21);
       ls.add("Ashish");
//      ls.remove("34");
//       System.out.println(ls);
       Iterator it=ls.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next() + " Hughes");
       }
	}

}
