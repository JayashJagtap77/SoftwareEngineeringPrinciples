package com.engineering.principles.version4;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			// display menu 
			printMenu();
			
			// get user's choice
			choice = scanner.nextInt();

			// Get appropriate operator
			Operator operator = getOperator(choice);
			
			// read user input only if operator is found and execute
			// execute operator
			if(operator != null) {
				operator.execute(readInputNumber(scanner, 1), readInputNumber(scanner, 2));
			}
		} while (choice != 5); // repeat until the user chooses to exit

		scanner.close(); // close the scanner
	}

	public static void printMenu() {
		System.out.println("Menu:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");
	}

	public static Operator getOperator(int choice) {
		switch(choice) {
			case 1 : return new AddOperator();
			case 2 : return new SubtractOperator();
			case 3 : return new MultiplyOperator();
			case 4 : return new DivideOperator();
			case 5 : System.out.println("Exiting program..."); break;
			default : System.out.println("Invalid choice, please try again.");
		}
		return null;
	}
	
	public static double readInputNumber(Scanner scanner, int order) {
		System.out.printf("Enter number %d : ", order);
		return scanner.nextDouble();
	}
}
