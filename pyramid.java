import java.util.Scanner;

/* This program calculates how many piles of money in a triangular shape there 
 * are, starting from adding bottom row of n piles and each row above until top 
 * row of 1 pile. 

 * It then calculates how much money is in the piles by multiplying the amount 
 * of piles by the value of the coin and how many coins are in each pile.
 */

public class pyramid {
	public static void main(String args[]) {
		// Declares input
		Scanner input = new Scanner(System.in);

		// Declares variables
		int triangle, add, pile;
		double coin, multiply;

		// Output asks length of longest side of triangle and allows user input to initialise 
		System.out.println("How long is the longest line of triangle?");
		triangle = input.nextInt();

		// Output asks what coin is being used and allows user input
		System.out.println("\nWhat coin are you using?");
		coin = input.nextDouble();

		// Output asks for how many coins are in each pile and allows user input
		System.out.println("\nHow many coins are in each pile?");
		pile = input.nextInt();

		// Calls methods and initialises variables
		add = addition(triangle); // uses addition method to work out sum of the rows of a triangle
		multiply = multiplication(coin, pile, add); // uses multiplication method to work out sum of coins in all piles within triangle 

		// Print out functions
		System.out.println("\n" + add + " piles"); // Prints out sum of rows of triangle
		System.out.println("£" + multiply); // Prints out sum of coins

		// Closes input
		input.close();
	}

	private static int addition(int a) {
		// Declares and initialises the variable b
		int b = 0;

		// For loop that loops through triangle from longest to shortest triangle line and adds each line to variable b
		for (int i = a; i > 0; i--) {
			b += i;
		}

		// Returns value of b after for loop
		return b;
	}

	private static double multiplication(double a, int b, int c) {
		// Returns total of a multiplied by b multiplied by c
		return (a * b * c);
	}
}
