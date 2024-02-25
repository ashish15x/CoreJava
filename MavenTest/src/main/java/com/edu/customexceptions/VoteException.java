package com.edu.customexceptions;

public class VoteException extends Exception{

	
	public VoteException(String message){
		super(message);  //super calls the base class with the given message
	}
	
	

}
