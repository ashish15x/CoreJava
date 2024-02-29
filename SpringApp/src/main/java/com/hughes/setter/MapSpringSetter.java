package com.hughes.setter;

import java.util.Map;

// Class representing an entity with a Map property
public class MapSpringSetter {

	// Field to store the name
	private String name;

	// Field to store the Map
	private Map mp;

	// Getter method for retrieving the name
	public String getName() {
		return name;
	}

	// Setter method for setting the name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for retrieving the Map
	public Map getMp() {
		return mp;
	}

	// Setter method for setting the Map
	public void setMp(Map mp) {
		this.mp = mp;
	}

}
