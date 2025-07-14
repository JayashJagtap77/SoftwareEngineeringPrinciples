package com.engineering.principles.version4;

public class DivideOperator implements Operator {

	@Override
	public double execute(double num1, double num2) {
		if (num2 == 0) {
			// divide-by-zero error
			System.out.println("Cannot divide by zero");
		} else {
			return num1 / num2;
		}
		return 0;
	}

}
