package com.edu.users;

import java.util.Hashtable;
import java.util.ArrayList;

public class HashtableQuestion2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(0, "Srinivas");
        hashtable.put(1, "srinivas");
        hashtable.put(2, "laptop");
        hashtable.put(3, "Laptop");
        hashtable.put(4, "Edu");
        hashtable.put(5, "Tech");

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < hashtable.size(); i++) {
            String currentValue = hashtable.get(i).toLowerCase();
            for (int j = i + 1; j < hashtable.size(); j++) {
                String nextValue = hashtable.get(j).toLowerCase(); 
                if (currentValue.equals(nextValue)) {
                    duplicates.add(i);
                    duplicates.add(j);
                }
            }
        }
            System.out.println(duplicates);
    }
}

