package com.engineering.principles.version2;

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
		double num1, num2, result;
		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();
		result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void subtraction(Scanner scanner) {
		double num1, num2, result;
		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();
		result = num1 - num2;
		System.out.println("Result: " + result);
	}

	public static void multiplication(Scanner scanner) {
		double num1, num2, result;
		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();
		result = num1 * num2;
		System.out.println("Result: " + result);
	}

	public static void division(Scanner scanner) {
		double num1, num2, result;
		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();
		if (num2 == 0) {
			// divide-by-zero error
			System.out.println("Cannot divide by zero");
		} else {
			result = num1 / num2;
			System.out.println("Result: " + result);
		}
	}
}
