package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	static FoodTruck[] groupTruck = new FoodTruck[5]; // array creation

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruckApplication FT = new FoodTruckApplication();

		System.out.println("Welcome to Food Truck Rater!\n You will be able to rate up to five trucks.");

		for (int i = 0; i < groupTruck.length; i++) {
			System.out.print("Please enter the name of the food truck, (if you're done, just type \"quit\"): ");
			String name = kb.nextLine();
			if (name.equals("quit")) { // use some case sensitivity later
				break;
			}

			System.out.print("Please enter the cuisine/food type: ");
			String cuisine = kb.nextLine();

			System.out.print("Please enter your rating for the truck, (scale of 1 - 10); ");
			int rating = kb.nextInt();
			kb.nextLine();

			FoodTruck truck = new FoodTruck(name, cuisine, rating); // object creation
			groupTruck[i] = truck;

		}


		System.out.println();
		System.out
				.println("Thank you for helping us create a better Food Truck Rater experience! We value your input.");
		System.out.println();
		
		
		// will need a loopy loo for this menu
		
		FT.highestRated();
		
		System.out.println("Please select from the following options: ");
		System.out.println("1. List all existing food trucks");
		System.out.println("2. See the average rating of food trucks");
		System.out.println("3. Display the highest rated food truck");
		System.out.println("4. Exit the program");
		System.out.println("Please enter your selection (1-4): ");
		int selection = kb.nextInt();

	}
	
	public void listTrucks() {
		for (int i = 0; i < groupTruck.length ; i++) {
			if (groupTruck[i] == null) {
				break;
			} else {
				System.out.println(groupTruck[i].toString());
			}
		}
	}

	public void truckAverage() {
		double total = 0;
		double average = 0;
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < groupTruck.length; indexSpot++) {
			if (groupTruck[indexSpot] == null) {
				break;
			} else {
				double truckRating = groupTruck[indexSpot].getRating();
				total = total + truckRating;
			}

		}
		average = total / indexSpot;

		System.out.println("The average rating for all the trucks is: " + average);
	}

	public void highestRated() {    //NEED TO ADD ID
		FoodTruck highest = groupTruck[0];
		for (int i = 0; i < groupTruck.length; i++) {
			if (groupTruck[i] == null) {
				break;
			} 
			else if (highest.getRating() < groupTruck[i].getRating()) {
				highest = groupTruck[i];
			}
		}
		System.out.println("The highest rated truck is " + highest.getName() + " with a rating of " + highest.getRating() +"." 
				+ "Their cuisine is " + highest.getCuisine() + ".\nIf you'd like to look them up, there ID is " + highest.getUniqueID());

	}
}
