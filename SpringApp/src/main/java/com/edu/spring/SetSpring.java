package com.edu.spring;

import java.util.Set;

public class SetSpring{

  private String fullname;
  private Set st;
  
  SetSpring(){}
    
  SetSpring(String name,Set s){
	  fullname=name;
	  st=s;
  }
  public void display() {
	  System.out.println(st);
  }
  
}
