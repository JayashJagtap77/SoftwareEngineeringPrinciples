package com.engineering.principles.version4;

import java.util.Scanner;

public class Calculator2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			// display menu 
			OperatorFactory.populateOperatorList();
			
			// get user's choice
			choice = scanner.nextInt();

			// Get appropriate operator
			Operator operator = OperatorFactory.getOperator(choice);
			
			// read user input only if operator is found and execute
			if(operator != null) {
				System.out.println("Result : " +operator.execute(readInputNumber(scanner, 1), readInputNumber(scanner, 2)));
			}
		} while (choice != 9); // observed why tele-callers have 9 for the last option ??

		scanner.close(); // close the scanner
	}
	
	public static double readInputNumber(Scanner scanner, int order) {
		System.out.printf("Enter number %d : ", order);
		return scanner.nextDouble();
	}
}
