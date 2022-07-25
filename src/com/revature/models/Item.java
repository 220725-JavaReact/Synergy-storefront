package com.revature.models;

public class Item {
	private final String name;
	private double price;
	private static int amount = 50;
	private final String description;
	private final String expiration;
	
	
	//not empty parameter constructor


	public Item(String name, double price, String description, String expiration) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.expiration = expiration;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static int getAmount() {
		return amount;
	}


	public static void setAmount(int amount) {
		Item.amount = amount;
	}


	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public String getExpiration() {
		return expiration;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", description=" + description + ", expiration=" + expiration
				+ "]";
	}
	
	
	
	

	
	
}
