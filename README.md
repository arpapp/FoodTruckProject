## Food Truck Project - Week 2 Skill Distillery

#Overview

The program starts by asking the user to enter information for up to five different food trucks. It is possible to enter less than five food trucks as long as the user types "quit" when prompted to do so.

An array of objects called Food Trucks is created. As the user inputs data for each Food Truck object, the information is put into the array. Once the user is done inputting information, a menu is presented.

Most menu options call methods within the FoodTruckApplication. However, as no other methods were allowed to be static, an object of type FoodTruckApplication had to be created in order for the methods to actually be called.

For the all the methods, each one begins by iterating through each index of the array with a for loop. By use of an if statement, if the index is null/empty, it will be ignored.

In the list trucks method, it simply prints out each object instance's information with a toString method.

In the truck average method, the program first collects each truck rating and adds it into the running total. It does this by use of the getRating() method from the object class. Once it has the total, the average is calculated and printed out.

In the highest rated method, a new Food Truck object is created and named "highest" in order to keep track of the highest rating. It is initialed to already be 0th index of the array. As the method iterates through each index, if it comes across a higher rating, that new index will be equal to "highest". The sysout line then uses get methods to pull all relevant information of the object.

Once the user is done, they can type "4" to quit the program.

For the FoodTruck object class, all the variables are listed as private at the top in order to achieve encapsulation. All getter and setter methods are standard in that they get the instance quality and then set it as specific to that instance. However, the getter and setter for Unique ID had to function independent of user input and thus has several extra steps.

#Technologies Used

- Eclipse
- Java
- GitHub

#Lessons Learned

This project helped me to understand a lot more about arrays, objects, and the interplay between the two. When I first began this project, I had some idea of how I wanted to have an array of objects. However, as I began constructing the truck average method, I realized I had no idea how to just look at one quality of an object that is stored in an array. Now, I think I am comfortable with the idea of iterating through the array and using get methods to achieve this.

I think I also got a better grasp of thinking about multiple ways to do something instead of just committing to the first idea I have, (which is what happened last week and led to much frustration).

This project also helped me realize areas that I need to review further. For example, I realized I need to review getters and setters and what their purpose is. I understand that it helps us be specific to each object instance but I only understand it on a very shallow level. I plan on reviewing where I stumbled during this project in order to further cement what I've learned so far.
