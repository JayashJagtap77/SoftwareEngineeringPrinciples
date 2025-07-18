package com.engineering.principles.version4;

public class SquareOperator implements Operator
{

    @Override
    public double execute(double num1, double num2) {
        // Since this operator only uses the first number, we ignore num2
        return num1 * num1; // Square the first number
    }

}
