package com.edu.users;

import java.util.Hashtable;
public class HashTableExample {

	public static void main(String[] args) {
	
		Hashtable ht= new Hashtable();
		
		ht.put("k1","Ashish");
		ht.put("k2","Kumar");
		ht.put("k1","Ronit");
		ht.put("k1","Ramesh");
    System.out.println(ht);
    System.out.println(ht.keySet());
    System.out.println(ht.values());
    System.out.println(ht.get("k2"));
    ht.replace("k1", "Ramesh","Ashish");
    System.out.println(ht);
	}

}
