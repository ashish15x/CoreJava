package com.edu.MavenTest;

abstract class DataTransfer{
	public abstract void SendSMS(); 
	public abstract void SendEmail();
	public abstract void SendPushNotification();
	
	public void Display() {
		System.out.println("Message delivered...")
	}
}


public class AbstractTest extends DataTransfer{
	
  public static void main(String args[]) {
	  
      AbstractTest obj = new AbstractTest();
      obj.SendSMS();
      obj.SendEmail();
  }
  
 public void SendSMS() {
  
  System.out.println("Sending SMS");
 }
 public void SendEmail() {
	  
	  System.out.println("Sending Email");
	 }
 public void SendPushNotification() {
	  
	  System.out.println("Sending Push Notification");
	 }
  
  
  
}
