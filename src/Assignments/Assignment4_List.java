package Assignments;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_List {

	public static void main(String[] args) 
	
	
	{
	/*1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined. */
		List < Integer> area = new ArrayList <Integer> ();
		area.add(30000);
		area.add(20000);
		area.add(15000);
		area.add(10000);
		area.add(5000);
		
		System.out.println("total area of 3rd and 4th cities :"+ (area.get(3)+ area.get(4)) );
		
	/*	2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size. */
		
		Set<String> touristattractions = new HashSet<String>();
		touristattractions.add("Taj Mahal ");
		touristattractions.add("Eiffel Tower ");
		touristattractions.add("Colosseum ");

		touristattractions.add("Louvre Museum ");

		touristattractions.add(" Forbidden City ");

		touristattractions.add("Great Wall of China ");
		touristattractions.add("Sacré-Cœur Basilica ");

		touristattractions.add("Great Smoky Mountains National Park ");

		touristattractions.add("Universal Studios Japan  ");
		touristattractions.add(" Disneyland Park ");
		System.out.println(" the top 10 most visited tourist attractions in the world are :"+touristattractions);
		System.out.println(" size is : "+touristattractions.size());

	/*	3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		6th Value.  */
		
		int [] numbers = new int [10];
		
		
		numbers [0]= 100;
		numbers [1]= 101;
		numbers [2]= 102;
		numbers [3]= 103;
		numbers [4]= 104;
		numbers [5]= 105;
		numbers [6]= 107;
		numbers [7]= 108;
		numbers [8]= 109;
		numbers [9]= 200;
		
	int average =	(numbers[5] + numbers[6])/2;

		
		System.out.println (" Average of 5th and 6th vaule is :" + average);
	/*	4. Create a list of the top 5 highest-grossing movies of all time and print out the third
		movie on the list. */
		
		List < String> movies = new ArrayList <String> ();
		movies.add(" Bahubali");
		movies.add(" Leo");
		movies.add("K.J.F  ");
		movies.add(" Pushpa");
		movies.add("HIT");
		
		System.out.println("3rd movie :"+ movies.get(3));
			
		
	}

}
