package com.hughes.setter;

import java.util.Set;

// Class representing an entity with a Set property
public class SetSpringSetter {

	// Field to store the name
	private String name;

	// Field to store the Set
	private Set st;

	// Getter method for retrieving the name
	public String getName() {
		return name;
	}

	// Setter method for setting the name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for retrieving the Set
	public Set getSt() {
		return st;
	}

	// Setter method for setting the Set
	public void setSt(Set st) {
		this.st = st;
	}

}
