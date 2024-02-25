package com.hughes.exercises;

/* 
--import java.util.* instead of importing all packages with * 
   instead we can import just the two package needed.
-- The class name given was arraylist which has 2 problems
    first that the initials of class name should be capital
    secondly the name should not be arraylist as this class is already predefined class
--instead of using Iterator e = arraylist.iterator();
   we can use a generic type of iterator to ensure type safety
   Iterator <String> e = arraylist.iterator();
 */

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Ashish
 *
 */

class ArrayListExample
{
public static void main(String args[])
{
ArrayList<String> arraylist = new ArrayList<String>(); // Declare an Arraylist with a specific datatype string
arraylist.add("Item 0"); // Add elements to the Arraylist
arraylist.add("Item 2");
arraylist.add("Item 3");
arraylist.add("Item 4");
arraylist.add("Item 5");
arraylist.add("Item 6");
arraylist.add(1, "Item 1");  // Add the given element at index 1 of arraylist
System.out.println("\nUsing the add method");
System.out.println(arraylist);  // Print the arraylist
arraylist.remove("Item 5");     //Remove an element from the arraylist
System.out.println(arraylist);
System.out.println("\nUsing the Iterator interface");
String s;  // Declare a String variable to store each element of the arrayList
Iterator<String> e = arraylist.iterator(); // Print the ArrayList elements using the Iterator
while (e.hasNext()) // Iterate through the ArrayList using the Iterator
{
s = (String)e.next(); /// Iterate through the ArrayList using the Iterator and typecast it to String
System.out.println(s);
}
}
}

