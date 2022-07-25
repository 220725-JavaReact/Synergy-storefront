package com.revature.models;

public class Item {
	private final String name;
	private final double price;
	private static int amount = 50;
	private final String description;
	private final String expiration;
	
	
	public Item() {
		super();
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
