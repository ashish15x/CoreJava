package com.edu.users;

import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet ts = new TreeSet();
      ts.add(89);
     // ts.add(null);
      ts.add(8);
      ts.add(18);
      ts.add(5);
      try {
      TreeSet ts1=(TreeSet) ts.clone();
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
      ts.pollFirst();  //removes first element
      ts.pollLast();  //removes last element
      System.out.println(ts);
      System.out.println(ts.higher(18));
      System.out.println(ts.descendingSet());
      //System.out.println(ts1);
      
      
	}

}
