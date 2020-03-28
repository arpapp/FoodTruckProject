package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
//		FoodTruckApplication FT = new FoodTruckApplication(); //IDK Denise did this for cars
		
		
		FoodTruck[] groupTruck = new FoodTruck[5]; // array creation

		System.out.println("Welcome to Food Truck Rater!\n You will be able to rate up to five trucks."
				+ "\n To quit, please type \"quit\". ");
		
		for (int i = 0; i < groupTruck.length; i++) {
		System.out.print("Please enter the name of the food truck: ");
		String name = kb.nextLine();

		System.out.print("Please enter the cuisine/food type: ");
		String cuisine = kb.nextLine();

		System.out.print("Please enter your rating for the truck, (scale of 1 - 10); ");
		double rating = kb.nextDouble();
		kb.nextLine();
		
		FoodTruck truck = new FoodTruck(name, cuisine, rating); //object creation
		groupTruck [i] = truck;
		
		}
		
		System.out.println("" + groupTruck[0] + groupTruck[1] + groupTruck[2] + groupTruck[3] + groupTruck[4]) ;
		
		
		

	}

}
