package com.edu.users;

import java.util.TreeMap;
public class TreeMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap tm=new TreeMap();
        tm.put(1,"ABCD");
        tm.put(1+1,"Sugar");
        tm.put(1+1+1,"RR");
        tm.put(10/2,null);
        //tm.put(null,null); gives error as key cannot be null in TreeMap
        System.out.println(tm);
	}

}
