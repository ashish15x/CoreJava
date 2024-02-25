package com.edu.MavenTest;

public class Anchor {
  
    private boolean status;
    
    public void callfunction(boolean stat) {
        status = stat;
        System.out.println(status);
        if (status) {
            System.out.println("Switch is ON");
        } else {
            System.out.println("Switch is OFF");
        }
    }
}
