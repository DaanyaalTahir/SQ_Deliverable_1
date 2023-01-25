package com.ontariotechu.sofe3980U;

import java.util.Scanner;  // Import the Scanner class

public class App 
{
	/**
	* Main program:  The entry point of the program. It asks users for each binary number
	*      and allow the user to perform a specified action on the numbers i.e. OR, AND, add, multiply.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		// Initialize variables 
		Binary binary1, binary2, result = new Binary("");
		int option;
		Scanner in = new Scanner(System.in); // Initialize the scanner

		// Menu system 
		System.out.println("\n=== Welcome to Binary Calculator ===\n");
		try {
			System.out.println("Enter the first binary number");
			binary1 = new Binary(in.nextLine());  // Read first binary
			System.out.println("Enter the second binary number");
			binary2 = new Binary(in.nextLine());  // Read second binary

			// Ask user for what action to perform
			System.out.println("\nSelect an operation to perform from the following:");
			System.out.println("\t1. Bitwise AND");
			System.out.println("\t2. Bitwise OR");
			System.out.println("\t3. Multiply");
			System.out.println("\t4. Add");

			System.out.print("Option: ");
			option = in.nextInt();

			// Check to see what option was selected and perform corresponding action
			switch(option) {
				case 1:
					result = Binary.bitwiseAnd(binary1, binary2);
					break;
				case 2:
					result = Binary.bitwiseOr(binary1, binary2);
					break;
				case 3:
					result = Binary.multiply(binary1, binary2);
					break;
				case 4:
					result = Binary.add(binary1, binary2);
					break;
				default:
					System.out.println("You selected the wrong option, please try again.");
			}

			// Print the result
			System.out.println("\nResult: " + result.getValue());
		}

		catch(Exception e){
			System.out.println("There was an error, please try again.");
		}

    }
}
