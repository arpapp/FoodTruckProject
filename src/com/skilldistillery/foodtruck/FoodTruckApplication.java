package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
//		FoodTruckApplication FT = new FoodTruckApplication(); //IDK Denise did this for cars
		
		
		FoodTruck[] groupTruck = new FoodTruck[5]; // array creation

		System.out.println("Welcome to Food Truck Rater!\n You will be able to rate up to five trucks.");
		
		for (int i = 0; i < groupTruck.length; i++) {
		System.out.print("Please enter the name of the food truck, (if you're done, just type \"quit\"): ");
		String name = kb.nextLine();
			if (name.equals("quit")){      //use some case sensitivity later
				break;
			}

		System.out.print("Please enter the cuisine/food type: ");
		String cuisine = kb.nextLine();

		System.out.print("Please enter your rating for the truck, (scale of 1 - 10); ");
		double rating = kb.nextDouble();
		kb.nextLine(); //Denise told me to do this IDK what it does :O
		
		FoodTruck truck = new FoodTruck(name, cuisine, rating); //object creation
		groupTruck [i] = truck;
		
		}
		
//		System.out.println("" + groupTruck[0] + groupTruck[1] + groupTruck[2] + groupTruck[3] + groupTruck[4]) ;
		
		System.out.println();
		System.out.println("Thank you for helping us create a better FoodTruckApp experience! We value your input.");
		System.out.println();
		
		//will need a loopy loo for this menu
		System.out.println("Please select from the following options: ");
		System.out.println("1. List all existing food trucks");
		System.out.println("2. See the average rating of food trucks");
		System.out.println("3. Display the highest rated food truck");
		System.out.println("4. Exit the program");
		System.out.println("Please enter your selection (1-4): ");
			int selection = kb.nextInt();
		

	}

}
