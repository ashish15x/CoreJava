package com.hughes.setter;

// Class representing a Customer entity
public class Customer {

	// Fields to store customer information
	private int customerId; // Customer ID
	private String custName; // Customer Name

	// Getter method for retrieving the customer ID
	public int getCustomerId() {
		return customerId;
	}

	// Setter method for setting the customer ID
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	// Getter method for retrieving the customer name
	public String getCustName() {
		return custName;
	}

	// Setter method for setting the customer name
	public void setCustName(String custName) {
		this.custName = custName;
	}

}
