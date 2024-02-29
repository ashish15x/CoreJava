package com.edu.spring;

import java.util.ArrayList;

public class ConstListExamp {

  private String fullname;
  private ArrayList ls;
  
  ConstListExamp(){}
    
  ConstListExamp(String name,ArrayList m){
	  fullname=name;
	  ls=m;
  }
  public void display() {
	  System.out.println(ls);
  }
  
}
