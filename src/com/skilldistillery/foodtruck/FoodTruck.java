package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	private String name;
	private String cuisine;
	private double rating;
	private int truckID;
	private static int MAX_TRUCKS = 5;
	
	public FoodTruck (String name, String cuisine, double rating) {
		this.name = name;
		this.cuisine = cuisine;
		this.rating = rating;
		this.truckID = truckID;
	}
//no ID in constructor b/c it's not passed?

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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", cuisine=" + cuisine + ", rating=" + rating + "]";
	}
	
	
}
