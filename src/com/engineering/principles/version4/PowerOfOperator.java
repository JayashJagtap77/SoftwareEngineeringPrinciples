package com.engineering.principles.version4;

public class PowerOfOperator implements Operator{

	@Override
	public double execute(double num1, double num2) {
		return Math.pow(num1, num2);
	}

}
