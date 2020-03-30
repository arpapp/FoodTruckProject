package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	private String name;
	private String cuisine;
	private int rating;
	private static int assignID = 1000;
	private int uniqueID;
	private static int MAX_TRUCKS = 5;
	
	
	public FoodTruck (String name, String cuisine, int rating) {
		this.name = name;
		this.cuisine = cuisine;
		this.rating = rating;
		FoodTruck.assignID = FoodTruck.assignID + 5;
		this.uniqueID = assignID;
		
	}
	
	public static int assignID() {
		return assignID;
	}
	
	public static void nextID(int assignID) {
		FoodTruck.assignID = assignID;
	}
	
	public int uniqueID() {
		return uniqueID;
	}
	
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public int getUniqueID() {
		return uniqueID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", cuisine=" + cuisine + ", rating=" + rating + ", uniqueID=" + uniqueID
				+ "]";
	}
	
	
	
	
}
