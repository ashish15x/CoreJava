package com.edu.spring;

import java.util.Map;

public class MapSpring{

  private String fullname;
  private Map mp;
  
  MapSpring(){}
    
  MapSpring(String name,Map m){
	  fullname=name;
	  mp=m;
  }
  public void display() {
	  System.out.println(mp);
  }
  
}
