package com.edu.spring;

public class Customer {

	private int id;
	private String name;

	public Customer() {
		System.out.println("def cons");
	}

	public Customer(int id) {
		this.id = id;
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(int id, String name) {

		this.id = id;
		this.name = name;

	}

	void display() {

		System.out.println(id + " " + name);

	}

}
