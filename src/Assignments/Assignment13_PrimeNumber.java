package Assignments;

public class Assignment13_PrimeNumber {

	public static void main(String[] args) {
		
		int number = 0; 

		boolean prime = true; 
		if (number <= 1) {
			System.out.println(number + " is not a prime number");
			prime = false; 
		} 

		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
								prime = false;
			}
		}	
		if (prime)
			System.out.println(number+ " is a prime number");
		else
			System.out.println(number+ " is not a prime number");
	}

	}

