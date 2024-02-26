package com.edu.users;

import java.util.Hashtable;

public class HashtableQuestion1 {

	public static void main(String[] args) {
		
		String[] arr= {"bat","rat","cat","map","TV","Laptop"};
		
		Hashtable<Integer,String> ht=new Hashtable<>();
		
		for (int i = 0; i < arr.length; i++) {
            ht.put(i, arr[i]);
        }

        System.out.println(ht);

	}

}
