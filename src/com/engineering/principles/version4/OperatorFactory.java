package com.engineering.principles.version4;

import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
	private static final int ADD = 1;
	private static final int SUBTRACT = 2;
	private static final int MULTIPLY = 3;
	private static final int DIVIDE = 4;
	private static final int POWER_OFF = 5;
	private static final int EXIT = 9;

	private static Map<Integer, String> operatorMap = new HashMap<>();
	
	static {
		operatorMap.put(ADD, "Addition");
		operatorMap.put(SUBTRACT, "Subtraction");
		operatorMap.put(MULTIPLY, "Multiplication");
		operatorMap.put(DIVIDE, "Division");
		operatorMap.put(POWER_OFF, "PowerOff");
		operatorMap.put(EXIT, "Exit");
	}

	private OperatorFactory() {
		
	}
	
	public static Operator getOperator(int choice) {
		switch(choice) {
			case ADD : return new AddOperator();
			case SUBTRACT : return new SubtractOperator();
			case MULTIPLY : return new MultiplyOperator();
			case DIVIDE : return new DivideOperator();
			case POWER_OFF : return new PowerOfOperator();
			case EXIT : System.out.println("Exiting program..."); break;
			default : System.out.println("Invalid choice, please try again.");
		}
		return null;
	}
	
	public static void populateOperatorList() {
		System.out.println("\n ======= Menu =======");
		for(Map.Entry<Integer, String> operatorEntry : operatorMap.entrySet()) {
			System.out.println(operatorEntry.getKey() + ". "+ operatorEntry.getValue());
		}
		System.out.print("Enter your choice: ");
	}
}
