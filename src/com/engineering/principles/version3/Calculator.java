package com.engineering.principles.version3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		// display menu and get user's choice
		do {
			printMenu();
			choice = scanner.nextInt();

			// Execute the selected operation
			switch (choice) {
			case 1:
				// addition
				addition(scanner);
				break;
			case 2:
				// subtraction
				subtraction(scanner);
				break;
			case 3:
				// multiplication
				multiplication(scanner);
				break;
			case 4:
				// division
				division(scanner);
				break;
			case 5:
				// Exit the program
				System.out.println("Exiting program...");
				break;
			default:
				// invalid choice
				System.out.println("Invalid choice, please try again.");
				break;
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

	public static void addition(Scanner scanner) {
		double result;
		result = readInputNumber(scanner, 1) + readInputNumber(scanner, 2);
		System.out.println("Result: " + result);
	}

	public static void subtraction(Scanner scanner) {
		double result;
		result = readInputNumber(scanner, 1) - readInputNumber(scanner, 2);
		System.out.println("Result: " + result);
	}

	public static void multiplication(Scanner scanner) {
		double result;
		result = readInputNumber(scanner, 1) * readInputNumber(scanner, 2);
		System.out.println("Result: " + result);
	}

	public static void division(Scanner scanner) {
		double num1, num2, result;
		num1 = readInputNumber(scanner, 1);
		num2 = readInputNumber(scanner, 2);
		if (num2 == 0) {
			// divide-by-zero error
			System.out.println("Cannot divide by zero");
		} else {
			result = num1 / num2;
			System.out.println("Result: " + result);
		}
	}
	
	public static double readInputNumber(Scanner scanner, int order) {
		System.out.printf("Enter number %d : ", order);
		return scanner.nextDouble();
	}
}
